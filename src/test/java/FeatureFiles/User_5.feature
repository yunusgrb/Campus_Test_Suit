Feature: Human Resources Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
  @Regression
  Scenario: Create,Edit and Delete a Exam
    And Click on the element in the User
      | humanResources |
      | setup          |
      | positions      |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | "okan"    |
      | shortName | "oakland" |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

    And search Area
      | "okan" |

    And Edit item Name
      | "Jack"   |


    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

    Then Click delete area
      | "Jack" |

    And Success message should be displayed






