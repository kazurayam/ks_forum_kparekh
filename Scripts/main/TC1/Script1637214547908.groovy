import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.nio.file.Path
import java.nio.file.Paths

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// resolve URL of the HTML file 
Path projectDir = Paths.get(RunConfiguration.getProjectDir())
Path html = projectDir.resolve('Include/fixtures/page.html')
String url = html.toFile().toURI().toURL().toExternalForm()

// open the page in a browser
WebUI.openBrowser('')
WebUI.navigateToUrl(url)

// read the Data from the CSV file
TestData data = findTestData("sampleData")

// iterate over the rows in the table body
for (int i: 1..data.getRowNumbers()) {
	// find value of the 'ID' column
	String id = data.getValue('ID', i)
	if (id != null & id.length() > 0) {
		// look for the <input> element in the row which you are interested
		TestObject tObj = findTestObject("main/rgMasterTable_tbody_tr(td4_RiskCategoryID)_td2_input", ["ID":id])
		// make sure you found the element
		WebUI.verifyElementPresent(tObj, 5, FailureHandling.STOP_ON_FAILURE)
		// do whatever you want
		def name = WebUI.getAttribute(tObj, "name")
		WebUI.comment("ID=\"${id}\", name=\"${name}\"")
	}
}

// close the browser
WebUI.closeBrowser()