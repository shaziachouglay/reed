Feature: Search for jobs

  @current
  Scenario Outline: Search by location and title
    Given Ariel a non registered user has opened the reed application
    When she searches for job by type of job <Job Title> and <Location>
    Then she should be able to see jobs related to the type of job searched <Job Title>
    Examples:
      | Job Title | Location |
      | Teacher   | london   |