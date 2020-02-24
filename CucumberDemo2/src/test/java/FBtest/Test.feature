Feature: FBlgoin

Scenario Outline: Login functionality exists

Given Open the Firefox and launch the application				
When Enter the Username "<username>"and Password "<password>"				
Then Login the account						

Examples:                      		

|username	  		|password         |		
|User1@name     	|password1p       |		
|User2@name     	|password1pp      |	
|User3@name     	|password1ppp     |	