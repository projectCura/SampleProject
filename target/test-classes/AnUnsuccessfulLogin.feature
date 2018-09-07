Feature: CURA Health Care automation

  Scenario: As a user I would like to use cura health care website to book an appointment

    Given a user wants to login to Cura Health Care
    When user enters "<Username>" , "<Password>"
    Then clicks the LOGIN button

#     Examples:  {'datafile':'resources/testdata.csv'}
#      |Username      |   Password           |
#      |John Doe      |   ThisIsNotPassword  |



