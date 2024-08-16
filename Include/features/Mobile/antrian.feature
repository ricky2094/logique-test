Feature: filter and add vehicle feature

  Scenario: Ensure i success filter on antrian pengiriman
    Given I logged into the mobile application
    And I on antrian pengiriman page
    When I applies a filter for Status Pengiriman
    Then The filtered list should be displayed correctly
	
	Scenario: Ensure success add kendaraan tanpa SPK
		Given user already logged in
		And 	user already at antrian pengiriman page
		When  user click button tanpa SPK
		And 	user fill all the mandatory field
		And 	user click button save
		Then 	data will add to history

	Scenario: Ensure failed when field are empty
		Given user already logged in
		And 	user already at antrian pengiriman page
		When 	user click button tanpa SPK
		And 	user click button save with all field empty
		Then 	user will get error that field are empty