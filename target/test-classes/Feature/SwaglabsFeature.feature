Feature: Shopping site functinality validation

@swaglabs
Scenario: Check the shopping site functionalities

Given Launch browser <browser>
Then Enter uname <username>
Then Enter pword <password>
Then Click login button
Then Add a product to cart
Then Click on cart to open
Then Click checkout
Then Enter fname
Then Enter lname
Then Enter zcode
Then Click on continue
Then Click on finish
Then Validate the text

Examples:
   | browser | username | password |
   | chrome | standard_user | secret_sauce |
                              
