Feature: Portal Login

Background:
Given Validate the browser
When Browser is triggered
Then Check if browser is started

@PortalTest
Scenario: Home Page Default Login

Given User is on Netbanking landing page
When User login in to application with username and password
Then Home Page is Displayed
And Cards are displayed

@PortalTest
Scenario: Home Page Default Login

Given User is on Netbanking landing page
When User login in to application with username "john" and password "123"
Then Home Page is Displayed
And Cards displayed are "true"


@PortalTest
Scenario: Home Page Default Login

Given User is on Netbanking landing page
When User login in to application with username "sam" and password "abc"
Then Home Page is Displayed
And Cards displayed are "false"

@PortalTest
Scenario: Home Page Default Login

Given User is on Netbanking landing page
When User need to signup with below details
|test12|abcd3|test12@gmail.com|12, STR CLUB|CALIFORNIA|35004|    
Then Home Page is Displayed
And Cards displayed are "false"

@PortalTest
Scenario Outline: Home Page Default Login

Given User is on Netbanking landing page
When User Login in to application with username <username> and password <password>
Then Home Page is Displayed
And Cards displayed are "true"

Examples:
|username|password|  
|user1	|pass1|
|user2	|pass2|
|user3	|pass3|
|user4	|pass4|



