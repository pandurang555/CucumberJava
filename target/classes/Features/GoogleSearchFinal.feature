Feature: To search Cucumber word in Google

Scenario: Verify that search functionality is working properly

Given user has to open browser
And Redirect to www.google.com page
When person should enter cucumber text in search box
And person hits enter
Then person is navigated to search results