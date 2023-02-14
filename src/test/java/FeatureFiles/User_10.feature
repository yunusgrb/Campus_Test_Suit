Feature: Education Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
  @Regression
  Scenario: Create,Edit and Delete a Subjects Categories
    And Click on the element in the Dialog2
      | setup    |
      | parameters   |
      | gradeLevels   |

      | addButton   |

    And User sending the keys in Dialog content2
      | nameInput   |Omer33|
      | shortNameInput   |Akcaa|
      | orderInput   |155|

    And Click on the element in the Dialog2
      | nextGrade   |
      | clickNextGrade   |
      | saveButton   |

      |clikEditOrDelete|
      |clickDelete|
      |deleteButton|

      |clickEdit|

    And User sending the keys in Dialog content2
      | nameInput   |Leyla|
    And Click on the element in the Dialog1
      | saveButton   |
    And Success message should be displayed