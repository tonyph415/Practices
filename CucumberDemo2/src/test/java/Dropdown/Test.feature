Feature: FBlgoin

Scenario Outline: Login functionality exists

Given Open the Orderpage				
When Login Account	
Then Enter the Passengers "<Passengers>"and Departing From: "<Departing>" and Arriving "<Arriving>"	
Then book the fight
			
					

Examples:                      		

|Passengers	|Departing     | Arriving	|		
|1	  		|London        | Portland 	|
|2	  		|Paris         | London		|	
	