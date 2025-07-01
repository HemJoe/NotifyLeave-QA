Feature: add the men shirt to cart
  Scenario:add the item to cart
    Given open the ajio website
    When search men shirt
    And select men shirt 
    And select shirt size
    And add the product in cart
    Then checkout the product