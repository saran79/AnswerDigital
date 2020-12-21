Feature: Infinite Scroll-Validation

  @infinite
  Scenario: Validate by Scrolling to the Bottom of the page and back to the top and assert
    Given I navigate to the provided Url
    When I click the infinite scroll link
    And I should be able to view the infinite scroll page
    And I scroll down to the Bottom of the page twice
    And I Scroll Up to the Top of the page
    Then I should be able to validate the text "Infinite Scroll"
