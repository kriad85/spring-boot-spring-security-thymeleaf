Feature: login 
#This is how background can be used to eliminate duplicate steps 

Background: 
   User navigates to MyKong 
   Given I am on MyKong login page 

#Scenario with AND 
Scenario: 
   When I enter username as "TOM"
   And I enter password as "JERRY" 
   Then Login should fail