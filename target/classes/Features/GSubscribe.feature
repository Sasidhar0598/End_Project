@chilternoak @subscribe
Feature: Subscribe Feature

  Scenario Outline: Subscribe scenario with differe set of data
    Given user in homepage
    When user click Subscribe email text box
    When user fills the email as "<Email>"
    And user clicks on subscribe button
    Then it shows sucess message "<url>"

    Examples: 
      | Email                | url                                                                 |
      | RONEY123             | https://www.chilternoakfurniture.co.uk/                             |
      | roney                | https://www.chilternoakfurniture.co.uk/                             |
      |                      | https://www.chilternoakfurniture.co.uk/                             |
      | roneyy1830@gmail.com | https://www.chilternoakfurniture.co.uk/challenge#footer_signup_form |
      | roneyy1830@          | https://www.chilternoakfurniture.co.uk/                             |
