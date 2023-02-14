Feature: Add-Edit-Delete Discounts under Parameters Setup

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
  @Regression
  Scenario: Add Discounts Parameters Setup
    And Navigate to Discounts Page
      | setupOne   |
      | parameters |
      | discounts  |

    And Click on the element in the Dialog
      | addButton |

    And Create a Discounts
      | description     | EnginUser11 |
      | integrationCode | 171717      |
      | priorityCode    | 10          |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed
  @Regression
  Scenario: Edit Discount Parameters Setup

    And Navigate to Discounts Page
      | setupOne   |
      | parameters |
      | discounts  |

    And Edit and Delete Discounts
      | descriptionText | EnginUser11 |

    And Click on the element in the Dialog
      | searchButton |
      | editBtn      |

    And Edit and Delete Discounts
      | description | EditUser11 |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed
  @Regression
  Scenario: Delete Discount Parameters Setup

    And Navigate to Discounts Page
      | setupOne   |
      | parameters |
      | discounts  |

    And Edit and Delete Discounts
      | descriptionText | EditUser11 |

    When Delete Fields "EditUser11"

    Then Success message should be displayed












