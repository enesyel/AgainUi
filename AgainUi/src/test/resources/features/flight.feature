Feature: Flight Booking
  Background:
    Given The user navigate to the baseURL
    And The user click on the Booking Link
    Scenario: Validate that the Search Flight
      When The user clicks on the Flight Tab
      And The user selects Round Trip button
      And The user selects button type Business travel