Feature: Purchase From Outfitters

  @TestCase01
  Scenario: User add to cart Faux Blazer

    Given I open the outfitters website
    And I should see search icon to navigate to search section
    When I enter search term to see blazers option
    Then I should see blazers option to click on blazers
    And I should see products page to click on Faux Blazer
    When I click Faux blazer i should see size chart with xl to select
    Then I should be able to click add to cart button
    And I should see drown down to click on view cart button
    When I click on view cart i should see checkout page to click checkout button


  @TestCase02
  Scenario: User add to cart Shirt
    Given User is on outfitters website
    And User should see search button to click on search button
    And User enter "shirts" in search term and see product listing page
    And User click on "CheckShirt"
    Then User validates Search and LogIn element on the webpage
    And User should see size chart to select "sizeXL"
    When User click on add to cart button and see a drop down he should be able to select view cart or continue shopping
    Then User select view cart option and see checkout page
    Then User validates "CheckShirt" product details
    And User click on on Checkout button to proceed to info page

  @TestCase03
  Scenario: User add to cart Polo shirt

    Given User is on outfitters website
    And User should see search button to click on search button
    And User enter "Polo shirts" in search term and see product listing page
    And User click on "PoloShirt"
    Then User validates Search and LogIn element on the webpage
    And User should see size chart to select "sizeM"
    When User click on add to cart button and see a drop down he should be able to select view cart or continue shopping
    Then User select view cart option and see checkout page
    Then User validates "PiqueSportsPoloShirt" product details
    And User click on on Checkout button to proceed to info page


  @TestCase04
  Scenario:User add to cart slim fit jeans

    Given User is on outfitters website
    And User should see search button to click on search button
    And User enter "jeans" in search term and see product listing page
    And User click on "SlimFitJeans"
    Then User validates Search and LogIn element on the webpage
    And User should see size chart to select "size30"
    When User click on add to cart button and see a drop down he should be able to select view cart or continue shopping
    Then User select view cart option and see checkout page
    Then User validates "SlimFitJeans" product details
    And User click on on Checkout button to proceed to info page


  @TestCase05
  Scenario: User add to cart skinny comfort jeans

    Given User is on outfitters website
    And User should see search button to click on search button
    And User enter "jeans" in search term and see product listing page
    And User click on "SkinnyComfortJeans"
    Then User validates Search and LogIn element on the webpage
    And User should see size chart to select "S30"
    When User click on add to cart button and see a drop down he should be able to select view cart or continue shopping
    Then User select view cart option and see checkout page
    Then User validates "SkinnyComfortJeans" product details
    And User click on on Checkout button to proceed to info page


  @TestCase06
  Scenario: User add to cart basic jogger trouser

    Given User is on outfitters website
    And User should see search button to click on search button
    And User enter "Basic Joggers" in search term and see product listing page
    And User click on "BasicJoggers"
    Then User validates Search and LogIn element on the webpage
    And User should see size chart to select "sizeL"
    When User click on add to cart button and see a drop down he should be able to select view cart or continue shopping
    Then User select view cart option and see checkout page
    Then User validates "BasicJoggers" product details
    And User click on on Checkout button to proceed to info page


  @TestCase07
  Scenario: User add to cart linen bermuda shorts

    Given User is on outfitters website
    And User should see search button to click on search button
    And User enter "shorts" in search term and see product listing page
    And User click on "BasicJerseyShorts"
    Then User validates Search and LogIn element on the webpage
    And User should see size chart to select "SizeS"
    When User click on add to cart button and see a drop down he should be able to select view cart or continue shopping
    Then User select view cart option and see checkout page
    Then User validates "BasicJerseyShorts" product details
    And User click on on Checkout button to proceed to info page


  @TestCase08
  Scenario: User add to cart low top snickers

    Given User is on outfitters website
    And User should see search button to click on search button
    And User enter "Snickers" in search term and see product listing page
    And User click on "LowTopSnickers"
    Then User validates Search and LogIn element on the webpage
    And User should see size chart to select "Size40"
    When User click on add to cart button and see a drop down he should be able to select view cart or continue shopping
    Then User select view cart option and see checkout page
    Then User validates "lowtopsneakers" product details
    And User click on on Checkout button to proceed to info page


  @TestCase09
  Scenario: User add to cart good vibes fragrance

    Given User is on outfitters website
    And User should see search button to click on search button
    And User enter "fragrances" in search term and see product listing page
    And User click on "goodvibes"
    Then User validates Search and LogIn element on the webpage
    And User should see size chart to select "SizeFree"
    When User click on add to cart button and see a drop down he should be able to select view cart or continue shopping
    Then User select view cart option and see checkout page
    Then User validates "goodvibes" product details
    And User click on on Checkout button to proceed to info page


  @TestCase10
  Scenario: User add to cart dark knight fragrance

    Given User is on outfitters website
    And User should see search button to click on search button
    And User enter "fragrances" in search term and see product listing page
    And User click on "DarkKnight"
    Then User validates Search and LogIn element on the webpage
    And User should see size chart to select "Sizefree"
    When User click on add to cart button and see a drop down he should be able to select view cart or continue shopping
    Then User select view cart option and see checkout page
    Then User validates "DarkKnight" product details
    And User click on on Checkout button to proceed to info page

