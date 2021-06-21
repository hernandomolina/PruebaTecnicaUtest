@stories

Feature: Test Utest
    As a user, I want to register on the utes page
  @scenario1

  Scenario: New user registration
    Given Juan wants to register as a new user on the utes page
    When he the registration form for new users
      |  name   |    lastName    |   emailAddress     |   month   |   day   |   year   |     city     |   idioma    |  postalCode  |   country   | computer | version | language | mobileDevice  | model     |   os   |  password  |  confirPassword  |
      | Juan    |    Perez       | juanp78@gmail.com  |   April   |    8    |   2001   | Barranquilla |  Spanish |   080011     |   Albania   | Windows  |  10     | Spanish  | Apple         | iPhone 11 | iOS 14 |  Molina0893 | Molina0893      |
    Then he complete the registration of new user