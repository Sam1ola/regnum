Feature: Vehicle Registration number Check

  Scenario: Positive Test
    Given I Initialize the browser and Navigate to "https://covercheck.vwfsinsuranceportal.co.uk/" Site
    When I enter the Car Registration number and click on Find Vehicle
    Then My Car Registration Number is Displayed


