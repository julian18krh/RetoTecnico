#lan:en
@stories
Feature: Sign up Utest
  As a user, I want to learn how  to register in a test
  @scenario1
  Scenario: login to the portal u test
    Given   than Cristian wants to enter the Utest platform
      |strName    | strLname |
      |Cristian   |Ramirez|
    When he assigns password to the user
      |strPassword  |
      |Choucair2107*|

    Then he validates that the registration was successful
      |strConfirm    |
      |Welcome to the world's largest community of testers.|



