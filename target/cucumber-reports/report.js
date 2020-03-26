$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Check automationpractice login",
  "description": "",
  "id": "check-automationpractice-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@MyStoreLogin"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "login with valid credential and check the different functionality",
  "description": "",
  "id": "check-automationpractice-login;login-with-valid-credential-and-check-the-different-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Enter the \"\u003cURL\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on sign in",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter userEmail \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter the userPass \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "In home page click on Dresses",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on Sort by dropdown manu",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Select the second dress",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "go to next page and add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "validate total price",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "check-automationpractice-login;login-with-valid-credential-and-check-the-different-functionality;",
  "rows": [
    {
      "cells": [
        "URL",
        "email",
        "password"
      ],
      "line": 19,
      "id": "check-automationpractice-login;login-with-valid-credential-and-check-the-different-functionality;;1"
    },
    {
      "cells": [
        "http://automationpractice.com/index.php",
        "jahirultech86@gmail.com",
        "sunday2019"
      ],
      "line": 20,
      "id": "check-automationpractice-login;login-with-valid-credential-and-check-the-different-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11043003900,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "login with valid credential and check the different functionality",
  "description": "",
  "id": "check-automationpractice-login;login-with-valid-credential-and-check-the-different-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@MyStoreLogin"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Enter the \"http://automationpractice.com/index.php\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on sign in",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter userEmail \"jahirultech86@gmail.com\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter the userPass \"sunday2019\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "In home page click on Dresses",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on Sort by dropdown manu",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Select the second dress",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "go to next page and add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "validate total price",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php",
      "offset": 11
    }
  ],
  "location": "StepsOfLoginFeature.enter_the(String)"
});
formatter.result({
  "duration": 6265539600,
  "status": "passed"
});
formatter.match({
  "location": "StepsOfLoginFeature.click_on_sign_in()"
});
formatter.result({
  "duration": 3727097200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jahirultech86@gmail.com",
      "offset": 17
    }
  ],
  "location": "StepsOfLoginFeature.enter_userEmail(String)"
});
formatter.result({
  "duration": 410826500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sunday2019",
      "offset": 20
    }
  ],
  "location": "StepsOfLoginFeature.enter_the_userPass(String)"
});
formatter.result({
  "duration": 99628100,
  "status": "passed"
});
formatter.match({
  "location": "StepsOfLoginFeature.click_on_Sign_in_button()"
});
formatter.result({
  "duration": 1060521000,
  "status": "passed"
});
formatter.match({
  "location": "StepsOfLoginFeature.in_home_page_click_on_Dresses()"
});
formatter.result({
  "duration": 2502661800,
  "status": "passed"
});
formatter.match({
  "location": "StepsOfLoginFeature.click_on_Sort_by_dropdown_manue()"
});
formatter.result({
  "duration": 175240500,
  "status": "passed"
});
formatter.match({
  "location": "StepsOfLoginFeature.select_the_second_dress()"
});
formatter.result({
  "duration": 2146579700,
  "status": "passed"
});
formatter.match({
  "location": "StepsOfLoginFeature.go_to_next_page_and_add_to_cart()"
});
formatter.result({
  "duration": 259502700,
  "status": "passed"
});
formatter.match({
  "location": "StepsOfLoginFeature.validate_total_price()"
});
formatter.result({
  "duration": 5516975100,
  "status": "passed"
});
formatter.after({
  "duration": 861092200,
  "status": "passed"
});
});