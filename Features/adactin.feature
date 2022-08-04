Feature: Check the Room Booking funtionality of AdactIn.in Hotel web Application


Scenario: Check the Login funtionality 
Given Application launched successfuly
When user enter the username in the usernname field
And user enter the password in the password field
Then user click on Login Button

Scenario: Check all funtionality of Search hotel form
Given Login sucessful
Given search open page opens sucessfuly
When user select a location from location dropdown
And user select a hotel from Hotels dropdown
And user select a type of room from Room Type dropdown
And user select a no. of rooms from Number of Rooms dropdown
And user enter the checkIn date in Check In Date field
And user enter the chekOut date in Check Out Date field
And user select  no. of adults from Adults per Room dropdown
And user select  no. of child from Children per Room field
Then user click the search button



Scenario: Check the funtionality of select Hotel form
Given All the details about Hotel is choosen
When user click select hotel Radio button
Then user click continue button



Scenario: Check all funtionalities of Book a hotel form
Given Hotel is selected
When user enter thier firstName in First Name field
And  user enter thier lastName in Last Name field
And user enter thier address in Address field
And user enter thier card no. in Credit Card Number field
And user select type of card from Credit Card Type field
And user select expiryMonth from Expiry Month field
And user select expiryYear from  Expiry Year  field
And user enter CVV number
Then user click Book Now button


Scenario: Check funtionality of Booking confirmation
Given Hotel is successfuly booked
Then user click on my itinerary button


Scenario: Check funtionality of logout button
Given Booked iternary page is lauched
Then user click on logout button


  