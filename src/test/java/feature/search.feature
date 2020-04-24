Feature: Search and place order for vegetables

@SeleniumTest
Scenario: Search for items and validate results
Given User is on GreenKart Landing Page
When User searched for "Cucumber" Vegetable
Then "Cucumber" results are displayed

@SeleniumTest
Scenario: Search for items and move to checkout page
Given User is on GreenKart Landing Page
When User searched for "Brinjal" Vegetable
And Added items to cart
And User proceeded to checkout page for purchase
Then Verify Selected "Brinjal" items are displayed in checkout page