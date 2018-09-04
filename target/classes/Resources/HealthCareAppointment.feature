Feature: CURA Health Care Login

  Background: User is Logged In a CURA HealthCare
    Given User navigates to the login page
    When User submits username and password
    Then User should be logged in

  Scenario: User wants to make an appointment for treatment
    When the user makes an appointment
    Then the user makes a successful appointment

  Scenario: As a user I applies appointment without entering visit date
    When the user makes an appointment
    Then User should be poped-up with error message as "Please fill out this field"


