#Author: juliangebe@gmail.com
Feature: Choosing a flight
  As a web user 
  I want choose a flight
  To see the options

  Scenario: find the flight
    Given thath Julian wants to select a flight
    When He choose the origin  and  destiny city
      | origin | destiny |
      | Mede   | Barr    |
    Then he should see the flight finder screen
    Given thath Julian wants to finalize the purchase
    When he enter the data
      | CreditCardNumber | SecurityCode | CardHolder          | CardHolderDocument | Name    | LastName  | IdentificationCard | Address | AdultName | AdultLastName | AdultIdentificationCard | Email               | ComfirmEmail        | Area   | CellPhoneNumber |
      | 5406910176125671 |          843 | Sebastian Gallego B |          115223434 | Alberto | Fernandez |          115223215 | calle D | Alberto   | Fernandez     |              1152232156 | enalber@hotmail.com | enalber@hotmail.com | 035050 |      3002923332 |
    Then he see the buy details
