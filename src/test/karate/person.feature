Feature: Testing Person CRUD
    Background:
        * def homeURL = 'http://localhost:8080/api/person/'
        * def person = {name: 'Hashim', age:2}



    Scenario: Adding Person
        Given url homeURL.concat("save")
        And request person
        When method post
        Then status 200