@SepulsaSelectProduct
Feature: Choose Products from Main Menu
  As a user
  I want to be able to choose various products from the main menu
  So that I can view and select the products I need

  Background:
    Given the application is open
    And I am on the main menu

  Scenario: Choose Pulsa Product
    When I select the "Pulsa" product from the main menu
    Then I should see the list of available pulsa products

  Scenario: Choose Voucher Game Product
    When I select the "Voucher Game" product from the main menu
    Then I should see the list of available voucher game products

  Scenario: Choose PLN Listrik Product
    When I select the "PLN Listrik" product from the main menu
    Then I should see the list of available PLN listrik products

  Scenario: Choose Paket Data Product
    When I select the "Paket Data" product from the main menu
    Then I should see the list of available paket data products

  Scenario: Choose Telkom & Indihome Product
    When I select the "Telkom & Indihome" product from the main menu
    Then I should see the list of available Telkom & Indihome products

  Scenario: Choose PDAM Product
    When I select the "PDAM" product from the main menu
    Then I should see the list of available PDAM products

  Scenario: Choose Uang Elektronik Product
    When I select the "Uang Elektronik" product from the main menu
    Then I should see the list of available Uang Elektronik products

  Scenario: Choose Other Products
    When I select "Other" from the main menu
    Then I should be able to view products from other categories

  Scenario: Choose Telekomunikasi Category
    Given I am on the "Other" product category page
    When I select the "Telekomunikasi" category
    Then I should see products within the telekomunikasi category

  Scenario: Choose Bayar Tagihan Category
    Given I am on the "Other" product category page
    When I select the "Bayar Tagihan" category
    Then I should see products within the bayar tagihan category

  Scenario: Choose Beli Voucher Category
    Given I am on the "Other" product category page
    When I select the "Beli Voucher" category
    Then I should see products within the beli voucher category

  Scenario: Choose Keuangan Category
    Given I am on the "Other" product category page
    When I select the "Keuangan" category
    Then I should see products within the keuangan category

  Scenario: Choose Dana Sosial Category
    Given I am on the "Other" product category page
    When I select the "Dana Sosial" category
    Then I should see products within the dana sosial category

  Scenario: Choose Transportasi Category
    Given I am on the "Other" product category page
    When I select the "Transportasi" category
    Then I should see products within the transportasi category
