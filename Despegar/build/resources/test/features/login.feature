#Author: juliangebe@gmail.com

Feature: login despegar
  As a Web User  
  I want to login into despegar

  
  Scenario: login with correct credentials
    Given that Julian wants into despegar page
    When he enter the credentials
      | userName            | password |
      | juliangebe@gmail.com | pruebasjulian1234   |
    Then he should see the despegar home page
