Feature: login on cogmento 
@tag: @login
Scenario: Login on cogmento
Given I am on cogmento login page
When I enters "userName"
And I enter "password"
And I select login button on cogmento login page
Then cogmento master menu page is visible 