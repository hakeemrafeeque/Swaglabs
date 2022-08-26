# Swaglabs
 An automation test sccript for swaglabs shopping site

 ***************Go to "SwaglabsRunner.java" to execute the test script***************

The automation script covers,
First Open the shopping site
Enter the username and password
Then Click login button
Add any product to the cart
Click a cart icon to open the cart
Then Click checkout
Enter your details firstname,lastname and zipcode(All are dynamically changed for every test runs)
Then Click on continue
Click finish to complete your order
And validate the text("THANK YOU FOR YOUR ORDER") is visible or not


After script runs successfully, report will be automatically generated in "target/reports/report.html" in the project, we can view the test results here.

To change the browser Goto "SwaglabsFeature.feature" and change the table value as the browser name you want (chrome, firefox, ie, edge, opera).