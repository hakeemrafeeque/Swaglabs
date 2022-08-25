Feature: Shopping site functinality validation

Scenario: Check the shopping site functionalities

Given Open the browser
Then Open the shopping site
Then Enter uname <username>
Then Enter pword <password>
Then Click login button
Then Add a product to cart
Then Click on cart to open
Then Click checkout
Then Enter fname <firstname>
Then Enter lname <lastname>
Then Enter zcode <zipcode>
Then Click on continue
Then Click on finish
Then Validate the text

Examples:
    | username | password | firstname | lastname | zipcode |
    | standard_user | secret_sauce | Hakeem | S | 1234 |
    | standard_user | secret_sauce | Azar | S | 5678 |
    | standard_user | secret_sauce | Shahid | H | 9012 |
    | standard_user | secret_sauce | Mohammad | A | 3456 |
                              
