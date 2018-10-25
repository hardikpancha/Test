Feature: Search

Scenario Outline: Basic hotel search

Given the user has clicked Home to access the search page
And they have chosen the Hotels option 
And they have chosen a hotel for <city>  
And they have chosen with dates <checkin> to <checkout>  
And they have selected number of <adults> and <children> 
When they click search 
Then matching results are displayed 

Examples:
			| city | checkin | checkout | adults | children | 
			| "montreal" | "11/22/2018" | "11/24/2018"| 1 | 0 |
			| "new york" | "11/11/2018" | "11/20/2018" | 5 | 1 | 