Feature: Book appointment

  Background: As a user I would like to login to cura health care
    Given the user logins to cura health care

  Scenario: As a user I would like to book an apointment
    When the user enters details in the appointment page
    Then clicks Book Appointment button

  Scenario: As a user I would like to book an apointment
    When the user enters readmission details in the appointment page
    Then clicks Book Appointment button to view appointment