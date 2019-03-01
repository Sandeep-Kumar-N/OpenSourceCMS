$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Automating Action in HomePage",
  "description": "",
  "id": "automating-action-in-homepage",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8143339801,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Write a New Story",
  "description": "",
  "id": "automating-action-in-homepage;write-a-new-story",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is in HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on WriteNewStory",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify AddNewPost Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enter Title and Paragraph",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on publish",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Go Back to HomePage",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Verify HomePage",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDefinition.user_is_in_HomePage()"
});
formatter.result({
  "duration": 4568069000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.user_clicks_on_WriteNewStory()"
});
formatter.result({
  "duration": 4254609000,
  "status": "passed"
});
formatter.match({
  "location": "NewStoryStepDefinition.verify_AddNewPost_Page()"
});
formatter.result({
  "duration": 17647799,
  "status": "passed"
});
formatter.match({
  "location": "NewStoryStepDefinition.enter_Title_and_Paragraph()"
});
formatter.result({
  "duration": 493990300,
  "status": "passed"
});
formatter.match({
  "location": "NewStoryStepDefinition.click_on_publish()"
});
formatter.result({
  "duration": 1322455700,
  "status": "passed"
});
formatter.match({
  "location": "NewStoryStepDefinition.go_Back_to_HomePage()"
});
formatter.result({
  "duration": 848748301,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.verify_HomePage()"
});
formatter.result({
  "duration": 4811201,
  "status": "passed"
});
formatter.after({
  "duration": 181870000,
  "status": "passed"
});
});