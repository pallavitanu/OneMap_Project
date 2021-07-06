Feature: Validate the OneMap site 

  Scenario: Validate Different options in Home Page
  	Given User is on HomePage of URL "https://www.onemap.gov.sg"
    When Validate that home page heading is displayed
    Then Validate that searchbox is enabled
    And Validate that Vaccination Centres icon is enabled
    Then Validate that Covid Test Provider icon is enabled
		And Validate that Nearby Parks icon is enabled
		Then Validate that Essential Amenities icon is enabled
		And Validate that School Query icon is enabled
		Then Validate that More Menu icon is enabled
		And Validate that notification icon is enabled
		Then Validate that Map Tools icon is enabled
		And Validate that toggle icon is enabled
		
	Scenario: Validate Covid Test Providers Option
  	Given User is on HomePage of URL "https://www.onemap.gov.sg"
    When User can click Covid Test Providers option
    Then Validate that Covid Test Providers opens
    When User successfully search "102 THOMSON RIDGE THOMSON RIDGE SINGAPORE 574684"
    And User can click on list of covid swab providers link
    Then A seperate window of moh opens
		And Validate no link is broken
		
	Scenario: Validate Nearby Park Option
  	Given User is on HomePage of URL "https://www.onemap.gov.sg"
    When User can click Nearby Park option
    And User click on the OK button
    Then Validate that Nearby Park opens
    When Validate that User successfully download the KML document
    And User click on Cancel button
    Then User click on the Information icon
		And Validate that Information window is opening
		And User click on the OK button
		
	Scenario: Validate Essential Amenities Option
  	Given User is on HomePage of URL "https://www.onemap.gov.sg"
    When User can click Essential Amenities option
    And User click on the OK button
    Then Validate that Essential Amenities opens
    When User clicks on the Retail Pharmacy Locations Option
    And Validate that cancel button is enabled
    Then User click on Yes button
		And Validate that Retail Pharmacy Locations present in Map
		
	Scenario: Validate Different options in More Menu
  	Given User is on HomePage of URL "https://www.onemap.gov.sg"
    When Validate that More Menu icon is enabled
    Then Validate that user can click phpcDisplay in moreMenu options
    And Validate that all the options in phpcDisplay are present
    Then Validate that user can click LandQuery in moreMenu options
		And Validate that query and tenure options in phpcDisplay are present
		Then Validate that user can click DroneQuery in moreMenu options
		And Validate that all options in DroneQuery are present
		Then Validate that user can click About One Map in moreMenu options
		And Validate that email and homepage link options in About One Map are present
		Then Validate that user can click Help in moreMenu options
		And Validate that all options in Help are present
		
	Scenario: Validate Happy Smiley Option
  	Given User is on HomePage of URL "https://www.onemap.gov.sg"
  	When User goes to Happy Smiley in homepage
  	Then User gives the rating
		
		
	