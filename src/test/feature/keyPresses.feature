Feature: Key Presses

  @KeyPress
  Scenario: Validate the Key Presses and Assert the text Displayed
    Given I navigate to the provided Url
    When I click the Key presses link
    And I will be directed to the Key Presses page
    And I press the first key
    And I should be able to validate the first text displayed after key press
    And I press the Second key
    And I should be able to validate the second text displayed after key press
    And I press the third key
    And I should be able to validate the third text displayed after key press
    And I press the fourth key
    Then I should be able to validate the fourth text displayed after key press