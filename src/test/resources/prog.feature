Feature: To validate the all information 

Scenario: Verify Areas of Scenting
Given To launch the chrome and maximize the window
When To launch the url of the SCENT
And To Click the About Us button
And Scroll down to the Area of Scenting Section
And Click the hotel menu button
And Print the description of the under the hotel menu
Then To close the browser


Scenario: Check Bottom Page Links
Given To launch the chrome and maximize the window
When To Navigate into the webPage
And To Click the Our Services button
And Scroll down to see the Contact Us button
And To Click the Contact Us button
And To pass the name
And To pass the Company Name
And To pass the phone number
And To pass the mail id
And To select the elementary in the dropdown box
And To pass the Country
And To scroll Down into home page
Then close the browser