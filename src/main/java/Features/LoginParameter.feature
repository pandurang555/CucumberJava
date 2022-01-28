#Parameterization and Data driven
Feature: Test login functionality

Scenario Outline: Check login is successful with valid credentials
Given browser should open
And user is on login page
When User enters <username> and <password>
And user clicks on login
Then user is navigated to the home page

Examples:
| username | password |
| Dadasaheb555 | 12345 |

