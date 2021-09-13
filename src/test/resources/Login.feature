Feature:

  @test
  Scenario Outline: Login with invalid username
    When enter user name "<username>"
    And  enter the password as "<password>"
    And  login
    Then should get error message "<err>"
    Examples:
      | username        | password     | err                                                          |
      | invalidusername | secret_sauce | Username and password do not match any user in this service. |

  @test
  Scenario Outline: Login with invalid password
    When enter user name "<username>"
    And  enter the password as "<password>"
    And  login
    Then should get error message "<err>"
    Examples:
      | username      | password        | err                                                                     |
      | standard_user | invalidPassword | wrong eror Username and password do not match any user in this service. |

  Scenario Outline: Login with valid username and password
    When enter user name "<username>"
    And  enter the password as "<password>"
    And  login
    Then  should see Products page with title "<title>"
    Examples:
      | username      | password     | title    |
      | standard_user | secret_sauce | PRODUCTS |
