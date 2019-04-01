Feature: Login Feature
Scenario Outline: Valid login
Given The URL of the login page
When user enters <username> as username
And user enters <password> as password
Then user is success
Examples:
|username|password|
|Lalitha|Password123|
|admin|Password456|
|admin1|Password123|

