Feature: Automating Action in HomePage 

@SmokeTest 
Scenario: Write a New Story 

	Given User is in HomePage 
	When User clicks on WriteNewStory 
	Then Verify AddNewPost Page 
	Then Enter Title and Paragraph 
	And Click on publish 
	And Go Back to HomePage 
	And Verify HomePage 
	