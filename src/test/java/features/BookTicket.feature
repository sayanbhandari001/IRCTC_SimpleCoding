Feature: Book a IRCTC Tatkal Ticket users

  Background:
    Given User has Logged in successfully with proper login details

  @IRCTCBooking
  Scenario: Book Irctc ticket for registered user with passenger details provided
    Given closed popup of last transaction details if open
    And I select "From" and "To" destination with next corresponding Date
    And Select "class" and booking "time" at 10 am for "AC 3 Tier (3A)" or 11 am for "Sleeper"
    And change "quota" as required
    When I click on search and select correct "train number"
    Then As per Class selection select refresh, get the vacancy count
    And validate if vacancy count is more than or equal to 1 in case of single member and vacancy count is more than or equal to 5 in case of family booking
    And if count is less then 1 in case of single member or less than or equal to 5 in case of family then click on next available date
    And click on corresponding book now button and if any popup displayed click on yes and proceed further
    And fill individual or family Passenger Details such as Name,age, gender, India as country and preference as No preference for
    And consider adding customer phone number
    And Select Payment option as bhim pay
    Then click continue
    And validate if vacancy count is still more than 0
    Then Popup with Captcha to fill by user
    And Click continue and then select "BHIM/ UPI/ USSD" and click "Pay using BHIM (Powered by PAYTM ) also accepts UPI" and clcik "Pay and Book"
