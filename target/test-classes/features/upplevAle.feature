
@all
Feature:Navigating Upplev Ale module
  @opplevAle
  Scenario:The user should book an appointment Glasbruksmuseet i Surte

    Given The user should be on mainpage as an user
    When The user should be able to click "Upplev Ale" module
    Then The user should be able to click  Glasbruksmuseet i Surte option
    And  The user should be able to click www.glasbruksmuseet.se on the webpage



  @HyraLokal
  Scenario:The user should reserve one room on www.glasbruksmuseet.se


    Given   The user should be able to be main page of www.glasbruksmuseet.se
    And The user should be able to click Hyra Lokal under Boka Hyr module
    And The user should click skapaFörfrogan
    When The user should be able to select one option under the Välj lokal att hyra
    And The user should be able to select the date of reservation
    And the user should fill required blanks
    Then The user should click SKİCKA


