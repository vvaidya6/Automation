Feature: Application Login



@MobileTest
Scenario: Home Page Default Login

Given User is on Netbanking landing page
When User login in to application with username and password
Then Home Page is Displayed
And Cards are displayed

@WebTest
Scenario: Home Page Default Login

Given User is on Netbanking landing page
When User login in to application with username "john" and password "123"
Then Home Page is Displayed
And Cards displayed are "true"


@RegressionTest
Scenario: Home Page Default Login

Given User is on Netbanking landing page
When User login in to application with username "sam" and password "abc"
Then Home Page is Displayed
And Cards displayed are "false"

@MobileTest
Scenario: Home Page Default Login

Given User is on Netbanking landing page
When User need to signup with below details
|test12|abcd3|test12@gmail.com|12, STR CLUB|CALIFORNIA|35004|    
Then Home Page is Displayed
And Cards displayed are "false"

@WebTest
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

