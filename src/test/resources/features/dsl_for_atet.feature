Feature: DSL language for atet

#Helper commands
#Then I capture a screen image "group_claim_2"

Scenario: Journeys to pages 

Given I am on the start page
Given I am on the save your claim page
Given I am on the claimant details page
Given I am on the group claims page
Given I am on the representatives detail page
Given I am on the respondent details page
Given I am on the additional respondents page
Given I am on the employment details page
Given I am on the about your claim page
Given I am on the claim outcome page
Given I am on the more about my claim page
Given I am on the check your claim page
Given I am on the pay your fee page
Given I am on the card payment page


Scenario: Start page

Given I am on the start page
When I select to start a claim
Then I am directed to page 1 saving my claim

Given I am on the start page
When I select to return to a claim
Then I am redirected to return to claim page


Scenario: Save your claim page

Given I am on the saving your claim page
When I enter a memorable word
And I click save and continue
Then I am directed to page 2 claimant details

Given I am on the saving your claim page
When I click save and continue
Then error dialog is displayed on the saving yoiur claim page

Given I am on the saving your claim page
When I enter an optional email address
And I click save and continue
Then error dialog is displayed on the saving yoiur claim page


Scenario: claimant details page

Given I am on the claimant details page
When I select my title "Mr"
And I enter my first name "Robert"
And I enter my last name "Milroy"
And I enter my DOB day number "20"
And I enter my DOB month number "01"
And I enter my DOB year "1989"
And I select my gender as male
And I select my gender as female
And I select my gender as other
And I select NO I don't need assitance
And I select YES I need assistance
And I enter the details of the assitance required:
|wheelchair assistance required|
And I enter my address building number or name "3"
And I enter my street address "Cheyney Close"
And I enter my town or city "Steeple Morden"
And I enter my county "Hertfordshire"
And I enter my postcode "SG8 0LT"
And I select my country "United Kingdom"
And I enter my claimant mobile or phone number "1234567890"
And I enter my alternative claimant mobile or phone number "1234567890"
And I enter my claimant detail email address "ugstester+atet@gmail.com"
And I select correspondence should be by post
And I select correspondence should be by email
And I click save and continue
Then I am directed to page 3 group claims


Scenario: Group claim page

Given I am on the group claims page
When I click No people are not making a claim with me
When I click Yes people are making a claim with me
And I enter group claimant 1 title "Mr"
And I enter group claimant 1 first name "Robert"
And I enter group claimant 1 last name "Milroy"
And I enter group claimant 1 DOB day number "20"
And I enter group claimant 1 DOB month number "01"
And I enter group claimant 1 DOB year "1989"
And I enter group claimant 1 address building number or name "3"
And I enter group claimant 1 street address "Cheyney Close"
And I enter group claimant 1 town or city "Steeple Morden"
And I enter group claimant 1 county "Hertfordshire"
And I enter group claimant 1 postcode "SG8 0LT"
And I click add another claimant
And I enter group claimant 2 title "Mr"
And I enter group claimant 2 first name "Robert"
And I enter group claimant 2 last name "Milroy"
And I enter group claimant 2 DOB day number "20"
And I enter group claimant 2 DOB month number "01"
And I enter group claimant 2 DOB year "1989"
And I enter group claimant 2 address building number or name "3"
And I enter group claimant 2 street address "Cheyney Close"
And I enter group claimant 2 town or city "Steeple Morden"
And I enter group claimant 2 county "Hertfordshire"
And I enter group claimant 2 postcode "SG8 0LT"
And I click add another claimant
And I enter group claimant 3 title "Mr"
And I enter group claimant 3 first name "Robert"
And I enter group claimant 3 last name "Milroy"
And I enter group claimant 3 DOB day number "20"
And I enter group claimant 3 DOB month number "01"
And I enter group claimant 3 DOB year "1989"
And I enter group claimant 3 address building number or name "3"
And I enter group claimant 3 street address "Cheyney Close"
And I enter group claimant 3 town or city "Steeple Morden"
And I enter group claimant 3 county "Hertfordshire"
And I enter group claimant 3 postcode "SG8 0LT"
And I click save and continue
Then I am directed to page 4 representatives details page



Scenario: Representatives detail page

Given I am on the representatives detail page
When I select NO I have no representative
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


Scenario: Respondent detail page

Given I am on the respondent details page
When I enter the respondent name "representatives name"
And I enter the respondent address building number or name "3"
And I enter the respondent street address "Cheyney Close"
And I enter the respondent town or city "Steeple Morden"
And I enter the respondent county "Hertfordshire"
And I enter the respondent postcode "SG8 0LT"
And I enter the respondent mobile or phone number "1234567890"
And I click YES that the respondent address is their work address
And I click NO that the respondent address is not their work address
And I enter the respondent work address building number or name "3"
And I enter the respondent work street address "Cheyney Close"
And I enter the respondent work town or city "Steeple Morden"
And I enter the respondent work county "Hertfordshire"
And I enter the respondent work postcode "SG8 0LT"
And I enter the respondent work mobile or phone number "1234567890"
And I enter the acas number ""
And I click I dont have an acas number
And I click there is a joint claimant has an acas number
And I click that acas does not have authority to concilitate
And I click my employer has been in touch with acas
And I click I am applying for interim relief
And I click I am my claim is against a security service
And I click save and continue
Then I am directed to page 6 additional respondents page


Scenario: additional respondents page

Given I am on the additional respondents page
When I click NO there are no claims against other respondents
When I click YES there are claims against other respondents
And as additonal respondent 1 enter name "Robert Milroy"
And as additonal respondent 1 enter address building number or name "3"
And as additonal respondent 1 enter street address "Cheyney Close"
And as additonal respondent 1 enter town or city "Steeple Morden"
And as additonal respondent 1 enter county "Hertfordshire"
And as additonal respondent 1 enter postcode "SG8 0LT"
And as additonal respondent 1 enter acas number ""
And as additonal respondent 1 click I dont have an acas number
And as additonal respondent 1 click there is a joint claimant has an acas number
And as additonal respondent 1 click that acas does not have authority to concilitate
And as additonal respondent 1 click my employer has been in touch with acas
And as additonal respondent 1 click I am applying for interim relief
And as additonal respondent 1 click I am my claim is against a security service
And I click add another respondent
And as additonal respondent 2 enter name "Robert Milroy"
And as additonal respondent 2 enter address building number or name "3"
And as additonal respondent 2 enter street address "Cheyney Close"
And as additonal respondent 2 enter town or city "Steeple Morden"
And as additonal respondent 2 enter county "Hertfordshire"
And as additonal respondent 2 enter postcode "SG8 0LT"
And as additonal respondent 2 enter acas number ""
And as additonal respondent 2 click I dont have an acas number
And as additonal respondent 2 click there is a joint claimant has an acas number
And as additonal respondent 2 click that acas does not have authority to concilitate
And as additonal respondent 2 click my employer has been in touch with acas
And as additonal respondent 2 click I am applying for interim relief
And as additonal respondent 2 click I am my claim is against a security service
And I click add another respondent
And as additonal respondent 3 enter name "Robert Milroy"
And as additonal respondent 3 enter address building number or name "3"
And as additonal respondent 3 enter street address "Cheyney Close"
And as additonal respondent 3 enter town or city "Steeple Morden"
And as additonal respondent 3 enter county "Hertfordshire"
And as additonal respondent 3 enter postcode "SG8 0LT"
And as additonal respondent 3 enter acas number ""
And as additonal respondent 3 click I dont have an acas number
And as additonal respondent 3 click there is a joint claimant has an acas number
And as additonal respondent 3 click that acas does not have authority to concilitate
And as additonal respondent 3 click my employer has been in touch with acas
And as additonal respondent 3 click I am applying for interim relief
And as additonal respondent 3 click I am my claim is against a security service
And I click save and continue
Then I am directed to page 7 employment details page


Scenario: employment details page

Given I am on the employment details page
When I click NO that I have not work for the employer before
And I click YES that I have  worked for the employer before
And I click I am still working for the employer
And I click I am still working my notice with the employer
And I click I am no longer working for the employer
And I enter my job title "slacker"
And I enter employment start day "3"
And I enter employment start month "4"
And I enter employment start year "2015"
And I enter employment end day "4"
And I enter employment end month "6"
And I enter employment end year "2016"
And I click NO I did not work a notice period
And I click YES I did work a notice period
And I enter "5" employment duration units
And I click weekly employment duration units
And I click months employment duration units
And I enter my gross pay "500"
And I click weekly gross pay
And I click monthly gross pay
And I enter my net pay "400"
And I click weekly net pay
And I click monthly net pay
And I click NO not a member of an employers pension scheme
And I click YES I was a member of an employers pension scheme
And I enter any employer benefits:
|Company Car |
And I click NO I do not have a new job
And I click YES I do have a new job
And I click save and continue
Then I am directed to page 8 about the claim page


Scenario: the about the claim page

Given I am on the about the claim page
When I click the what is this unfair dismissal link
And I click unfair dismissal
And I click sex dicrimination
And I click disability dicrimination
And I click race dicrimination
And I click age dicrimination
And I click maternity dicrimination
And I click religious dicrimination
And I click sexual orientation dicrimination
And I click marital dicrimination
And I click gender reassignment dicrimination
And I click redundancy pay
And I click notice pay
And I click holiday pay
And I click arrears of pay
And I click other payments
And I click other type of claim
And I enter details of the other claim "this is other claims details"
And I click NO this claim is not whistleblowing
And I click YES this claim is whistleblowing
And I click NO to fowarding the claim to whistleblowing authority
And I click YES to forward the claim to the whistleblowing authority
And I click save and continue
Then I am redirected to the claim detail page 


Scenario: the claim detail page

Given I am on the claim detail page 
When I click about writing your claim statement link
And I click the browser back button
When I click it as upload separate document link
And I enter the claim details:
|This is the claims detail description|
And I click NO there are no othere claimants
And I click YES there are other claimants
And I enter the other claimants names:
|Other claimants |
And I click save and continue
Then I am redirected to the claim outcome page


Scenario: the claim outcome page

Given I am on the claim outcome page 
When I click compensation
And I click recommendation from tribunal
And I click get your old job back
And I click get a new job with same employer
And I enter details for other claim compensation:
|compensation details to be entered|
And I click save and continue
Then I am redirected to the more about your page


Scenario: the more about the claim page

Given I am on the more about the claim page 
Then I click NO I do not have further information to add
And I click YES I do have further information to add
And I enter further information for my claim:
|further information| 
And I click save and continue
Then I am redirected to the Fee page


Scenario: the fee page

Given I am on the fee page
When I click see more details on fees
And I click the browser back button
And I click the guide for fee remission
And I click the browser back button
And I click NO I do not need fee remission
And I click YES I do need fee remission
And I click fee remission application form
And I click the browser back button
And I click save and continue
Then I am redirected to check your claim page


Scenario: check your claim page 

Given I am on the check your claim page
When I click edit claimant details
And I click save and continue
Then I am redirected to check your claim page
When I click edit group claim
And I click save and continue
Then I am redirected to check your claim page
When I click edit representatives details
And I click save and continue
Then I am redirected to check your claim page
When I click edit respondent details
And I click save and continue
Then I am redirected to check your claim page
When I click edit additional respondents
And I click save and continue
Then I am redirected to check your claim page
When I click edit employment details
And I click save and continue
Then I am redirected to check your claim page
When I click edit claim type 
And I click save and continue
Then I am redirected to check your claim page
When I click edit claim details
And I click save and continue
Then I am redirected to check your claim page
When I click edit claim outcome
And I click save and continue
Then I am redirected to check your claim page
When I click edit additional information
And I click save and continue
Then I am redirected to check your claim page
When I click edit issue fee
And I click save and continue
Then I am redirected to check your claim page
And I click print check your claim link
And I click submit claim and move to payment
Then I am redirected to the pay issue fee page



Given I am on the pay issue fee page
When I click pay issue fee contact us
And I click the browser back button
And I click pay by cheque
And I click save claim to pdf
And I click the browser back button
And I click pay issue fee
Then I am redirected to the pay fee by card page


Scenario: pay fee by card page

Given I am on the card payment page
When I click pay by mastercard
#And I click the browser back button
#And I click pay by visa card 
#And I click the browser back button
#And I click pay by jcb card
#And I click the browser back button
#And I click pay by maestro
And I enter the card holders name "mickey mouse"
And I enter the card number "4111111111111111"
And I select the card expiry month "07"
And I select the card expiry year "2018"
And I enter the card verification number "111"
#And I click the card back button
#And I click the card cancel button
And I click the card payment button
Then I am redirected to the pay fee by card page
 
