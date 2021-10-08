Feature: Application Login

Scenario: Home Page Default Login
Given User is on NetBanking landing page
When User login into application with "John" and password "232323"
Then Home page is displayed
And All cards are displayed "true"

Scenario: Home Page Login
Given User is on NetBanking landing page
When User login into application with "Foo" and password "3434343"
Then Home page is displayed
And All cards are displayed "false"


