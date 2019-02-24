$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sande/Selenium_Projects/maven-demo/src/main/java/features/login3.feature");
formatter.feature({
  "line": 1,
  "name": "Handling G-Mail Login Part",
  "description": "",
  "id": "handling-g-mail-login-part",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login to G-Mail",
  "description": "Given: User in Gmail Portal",
  "id": "handling-g-mail-login-part;login-to-g-mail",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User in Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Enters UserName and Clicks on Next",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 7
    },
    {
      "cells": [
        "sandeep.nagothi9",
        "Skype@1234"
      ],
      "line": 8
    },
    {
      "cells": [
        "sandeep.nagothi8",
        "Skype@5678"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User Enters Password and Clicks on Login",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User Navigates to Mail Home Page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});