Feature: Smoothies Management

  #use serenity BDD maven plugin

  Background:
    Given The Drink category:
      | Getrank  | Kategory | Punkte |
      | Apfel    | Regular  | 15     |
      | Banana   | Fancy    | 20     |
      | Erdbeere | Tea      | 10     |

  Scenario Outline: d
    Given arriving to the store
    When you purshase <Menge> <Getrank> drinks
    Then you should earn <Punkte>
    Examples:
      | Getrank  | Menge | Punkte |
      | Apfel    | 1     | 15     |
      | Banana   | 2     | 40     |
      | Erdbeere | 3     | 30     |