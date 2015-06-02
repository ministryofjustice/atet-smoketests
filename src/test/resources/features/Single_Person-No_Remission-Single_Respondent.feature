@staging
Feature: Single Person - Single Respondent - No remission

Scenario: Single Person - Single Respondent - No remission - Mastercard Payment

Given I am on the start page
When I select to start a claim
Then I am directed to page 1 saving my claim
When I enter a memorable word
And I click save and continue
Then I am directed to page 2 claimant details
When I select my title "Mr"
And I enter my first name "Robert"
And I enter my last name "Milroy"
And I enter my DOB day number "20"
And I enter my DOB month number "01"
And I enter my DOB year "1989"
And I select my gender as male
And I select NO I don't need assitance
And I enter my address building number or name "3"
And I enter my street address "Cheyney Close"
And I enter my town or city "Steeple Morden"
And I enter my county "Hertfordshire"
And I enter my postcode "SG8 0LT"
And I select my country "United Kingdom"
And I enter my claimant mobile or phone number "1234567890"
And I enter my alternative claimant mobile or phone number "1234567890"
And I enter my claimant detail email address "robert.milroy@digital.justice.gov.uk"
And I select correspondence should be by email
And I click save and continue
Then I am directed to page 3 group claims
When I click No people are not making a claim with me
And I click save and continue
Then I am directed to page 4 representatives details page
And I select YES I have a representative
And I select that the representative is a "Law centre"
And I enter the representatives organisation name "organisations name"
And I enter the representatives name "representatives name"
And I enter the representatives address building number or name "3"
And I enter the representatives street address "Cheyney Close"
And I enter the representatives town or city "Steeple Morden"
And I enter the representatives county "Hertfordshire"
And I enter the representatives postcode "SG8 0LT"
And I enter the representatives mobile or phone number "1234567890"
And I enter the representatives alternative mobile or phone number "1234567890"
And I enter the representatives email address "ugstester+atet@gmail.com"
And I enter the representatives dx address "dx1"
And I click what is a dx number
And I click save and continue
Then I am directed to page 5 respondents details page
When I enter the respondent name "respondents name"
And I enter the respondent address building number or name "3"
And I enter the respondent street address "Cheyney Close"
And I enter the respondent town or city "Steeple Morden"
And I enter the respondent county "Hertfordshire"
And I enter the respondent postcode "SG8 0LT"
And I enter the respondent mobile or phone number "1234567890"
And I click NO that the respondent address is not their work address
And I enter the respondent work address building number or name "3"
And I enter the respondent work street address "Disney Land"
And I enter the respondent work town or city "Steeple Morden"
And I enter the respondent work county "Cambridgeshire"
And I enter the respondent work postcode "SE42DQ"
And I enter the respondent work mobile or phone number "0987654321"
And I enter the acas number "R000000/00/00"
And I click save and continue
Then I am directed to page 6 additional respondents page
When I click NO there are no claims against other respondents
And I click save and continue
Then I am directed to page 7 employment details page
When I click YES that I have  worked for the employer before
And I click I am no longer working for the employer
And I enter my job title "slacker"
And I enter employment start day "3"
And I enter employment start month "4"
And I enter employment start year "2015"
And I enter employment end day "4"
And I enter employment end month "6"
And I enter employment end year "2016"
And I click YES I did work a notice period
And I enter "5" employment duration units
And I click weekly employment duration units
And I enter my gross pay "500"
And I click weekly gross pay
And I click monthly gross pay
And I enter my net pay "400"
And I click monthly net pay
And I click NO not a member of an employers pension scheme
And I enter any employer benefits:
|No |
And I click YES I do have a new job
And I click save and continue
Then I am directed to page 8 about the claim page
When I click unfair dismissal
And I click sex dicrimination
And I click notice pay
And I click other type of claim
And I enter details of the other claim "this is other claims details"
And I click YES this claim is whistleblowing
And I click YES to forward the claim to the whistleblowing authority
And I click save and continue
Then I am redirected to page 9 claim detail page 
And you enter 1 lines with 2400 characters in the claim description
And I click YES there are other claimants
And I enter the other claimants names:
|Other claimants |
And I click save and continue
Then I am redirected to page 10 claim outcome page
When I click compensation
And I enter details for other claim compensation:
|compensation details to be entered|
And I click save and continue
Then I am redirected to page 11 more about your page
And I click YES I do have further information to add
And I enter further information for my claim:
|further information| 
And I click save and continue
Then I am redirected to the page 12 the fee page
When I click NO I do not need fee remission
And I click save and continue
Then I am redirected to check your claim page
And I click submit claim and move to payment
Then I am redirected to the pay issue fee page
And I click pay issue fee
Then I am redirected to the pay fee by card page
When I click pay by mastercard
And I enter the card holders name "mickey mouse"
And I enter the card number "5399999999999999"
And I select the card expiry month "07"
And I select the card expiry year "2015"
And I enter the card verification number "111"
And I capture a screen image "scenario_1"
And I click the card payment button
Then I am redirected to the claim submitted page

