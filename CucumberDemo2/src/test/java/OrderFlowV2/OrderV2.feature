Feature:  Order page
This feature to test order function of Company V1 and V2


Scenario Outline: To make an order at Company V2

Given User Opens the Orderpage				
When User select Product "<Product2V>", select  Plan "<Plan2V>"	
And User select Quantity "<Qty2V>"
Then Add selected items to Cart
Then Place the order
And Print out success message

	
Examples: Quantity2
  | Product2V	| Plan2V	| Qty2V	|
  | V1			| P2		| 2		|
  | V2			| P2		| 3		|
  | V2			| P1		| 1		|
  | V1			| P1		| 2		|

