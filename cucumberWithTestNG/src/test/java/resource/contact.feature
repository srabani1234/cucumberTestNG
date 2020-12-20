Feature: create contact

@tag: @t1
Scenario: Create user contact
Given I loggedin as valid use
When I naviagte to contact
And I enter valid user information
 |Firstname|Lastname|Company|
 |Srabani| Adhikary|Fidel|
Then contact record should created