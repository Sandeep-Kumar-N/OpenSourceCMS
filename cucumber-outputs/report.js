$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Automating Action in HomePage",
  "description": "",
  "id": "automating-action-in-homepage",
  "keyword": "Feature"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to OpenSourceCMS Application",
  "description": "",
  "id": "login-to-opensourcecms-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4856507800,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login with User Credentials",
  "description": "",
  "id": "login-to-opensourcecms-application;login-with-user-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is in OpenSourceCMS Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is in LoginPage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enters UserName, Password and Clicks on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User Navigates to HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDefinition.user_is_in_OpenSourceCMS_Login_Page()"
});
formatter.result({
  "duration": 2130517900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefinition.user_is_in_LoginPage()"
});
formatter.result({
  "duration": 14767900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefinition.user_Enters_UserName_Password_and_Clicks_on_Login_Button()"
});
formatter.result({
  "duration": 2395125300,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefinition.user_Navigates_to_HomePage()"
});
formatter.result({
  "duration": 18504000,
  "status": "passed"
});
formatter.after({
  "duration": 137785100,
  "status": "passed"
});
});