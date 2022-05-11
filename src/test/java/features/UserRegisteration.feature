Feature: User Registration
   I want to check that the user can register in our e-commerce website.
   
	Scenario Outline: User Registeration
	Given the user in the home page
	When I click on register link
	And I entered "<firstname>" , "<lastname>" , "<email>" , "<password>"
	Then The registration page displayed successfully
	
	Examples:
 	 | firstname | lastname | email | password |
 	 | ahmed | mohamed | ahmed@use5r434.com | 12345678 |
 	 | Moataz | ahmed | test@newus5er233.com | 87654321 |
 	  