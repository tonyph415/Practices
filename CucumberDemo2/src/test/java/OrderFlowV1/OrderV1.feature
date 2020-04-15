Feature:  Order page
This feature to test order function of Company V1 and V2

Scenario Outline: To make an order at Company V1

Given User Opens the Orderpage				
When User select Product "<Product1V>"
And User select  Plan "<Plan1V>"	
Then User Quantity "<Qty1V>"
Then Add selected items to Cart
Then Place the order
And Order summary is displayed
Then Print out success message

Examples: QuantityV1
  | Product1V	| Plan1V 	| Qty1V	|
  | V1			| P1		| 1		|
  | V1			| P2		| 2		|
  | V2			| P2		| 3		|
  | V2			| P1		| 1		|
  


