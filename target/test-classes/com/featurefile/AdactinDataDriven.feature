Feature: To book a hotel room 

Scenario Outline: User is in the log In page 

	Given user launchs the browser 
	Then  user has a valid username and enters it "<username>" 
	Then  user enters password "<password>" 
	And   clicks the login button 
	
	Examples: 
		| username  | password  |
		|Richard1112|richard1113|
		|  tom123   |   tom123  |
		|Richard1113|richard1113|
		

Scenario: User searches the hotel 

	Given User enters his desired location 
	Then  Enters hotel name 
	Then  Selects room type 
	Then  Selects number of rooms 
	Then  Specifies number of persons 
	And   Then clicks submit 
	
Scenario: User selects the  available hotel in the location 

	Given He clicks on the select button 
	And   continues to the next page 
	
Scenario: User starts booking 

	Given Enters his firstname 
	Then  Enters last name 
	Then  Enters his residencial address 
	Then  Enters Credit card number 
	Then  Selects credit card type 
	Then  Selects Expiry month 
	And   Expiry year 
	Then  Enters cvv number 
	And   clicks book now 
	
Scenario: Finally logs out 

	Given User logs out of the site 
	
	
	
