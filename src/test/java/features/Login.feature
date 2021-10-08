Feature: Application Login

Scenario: Home Page Default Login
Given User is on NetBanking landing page
When User login into application with username and password
Then Home page is displayed
And All cards are also displayed


