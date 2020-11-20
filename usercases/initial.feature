Feature: Search about suitable home
  
Background: The System has a repository of homes with their specifications (type-material-placement-pets-amenties-price-area-bedrooms-bathrooms-leaselength)
Given  these homes are contained in the system
                |HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING_FIREPLACE_ELEVATOR|510_150_3_2_6|
                |APARTMENT_BRICK_CITY_NO_ELEVATOR|230_120_4_2_12|
                
                
                
               

   
    
    @tag
    Scenario: Search home by material
    When I search about home by material "BRICK"
    Then A list of homes that matches the material specification should be returned and printed on the console
    And email with the result should be send to user "aseel.assi16@gmail.com"