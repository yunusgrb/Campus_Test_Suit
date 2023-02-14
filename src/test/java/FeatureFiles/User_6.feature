Feature: Education Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
  @Regression
  Scenario: Create a Subjects Categories
    And Click on the element in the Dialog1
      | education         |
      | setup             |
      | subjectCategories |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content1
      | nameInput | Omer22 |
      | codeInput | 1234   |

    And Click on the element in the Dialog1
      | saveButton |

    And Success message should be displayed
  @Regression
  Scenario: Edit a Subjects Categories
    And Click on the element in the Dialog1
      | education         |
      | setup             |
      | subjectCategories |

    And Search Area
      | Omer22 |

    And Edit item Name in the user
      | nameInput | Omer22 |
      | codeInput | 1234   |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed
  @Regression
  Scenario:Delete a Subjects Categories
    And Click on the element in the Dialog1
      | education         |
      | setup             |
      | subjectCategories |

    And Search to delete Account
      | Omer22 |

    Then Success message should be displayed