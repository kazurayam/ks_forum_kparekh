# ks_forum_kparekh

## What is this?

This is a small Katalon studio project, it was developed to propose a solution to a question raised at

- https://forum.katalon.com/t/refer-data-from-excel-sheet/60096/

## How to run the demo

Open "Test Cases/main/TC1" and run it.

You will find the following output in the Console:

```
2021-11-18 18:19:30.666 INFO  c.k.katalon.core.main.TestCaseExecutor   - START Test Cases/main/TC1
...
2021-11-18 18:19:37.772 INFO  c.k.k.c.keyword.builtin.CommentKeyword   - ID="RiskID3", name="ctl00$cphMain$RadGridRiskCategory$ctl00$ctl04$EditButton"
2021-11-18 18:19:38.615 INFO  c.k.k.c.keyword.builtin.CommentKeyword   - ID="RiskID1", name="ctl00$cphMain$RadGridRiskCategory$ctl00$ctl06$EditButton"
2021-11-18 18:19:39.393 INFO  c.k.k.c.keyword.builtin.CommentKeyword   - ID="VCAT4", name="ctl00$cphMain$RadGridRiskCategory$ctl00$ctl08$EditButton"
2021-11-18 18:19:40.157 INFO  c.k.k.c.keyword.builtin.CommentKeyword   - ID="VCAT3", name="ctl00$cphMain$RadGridRiskCategory$ctl00$ctl10$EditButton"
2021-11-18 18:19:40.281 INFO  c.k.katalon.core.main.TestCaseExecutor   - END Test Cases/main/TC1
```

`TC1` read the file `Include/fixtures/data.csv` to get the list of values of ID.

`TC1` uses a parameterised Test Obect.
