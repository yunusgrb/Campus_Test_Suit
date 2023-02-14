Feature: Nationalities Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
  @Regression
  Scenario: Create,Edit and Delete a Nationalities
    And Click on the element in the User funcitoanality
      | setupOne      |
      | parameters    |
      | nationalities |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | okan |


    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

    And search Area
      | okan |

    And Edit item Name
      | Jack |


    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

    Then Click delete area
      | Jack |

    And Success message should be displayed

