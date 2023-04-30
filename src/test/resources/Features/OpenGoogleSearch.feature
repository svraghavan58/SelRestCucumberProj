Feature: Open  Search Engines


Background:
 Given I open "chrome" browser
 
@tag 
Scenario: Google Serach   
When I enter the url  "https://www.google.com"
 
    
@tag1
Scenario Outline: Serach Engine 
When I enter the url  "<url>"

Examples:
|url|
|https://www.google.com|
|https://www.yahoo.com|      


@tag2
Scenario: Serach Engine2 
When I enter the below url
|url|
|https://www.google.com|
  