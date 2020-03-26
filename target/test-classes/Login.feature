@MyStoreLogin
Feature: Check automationpractice login

Scenario Outline: login with valid credential and check the different functionality
		
And Enter the "<URL>"
When Click on sign in
And Enter userEmail "<email>"
And Enter the userPass "<password>"
And Click on Sign in button
And In home page click on Dresses
And Click on Sort by dropdown manu
And Select the second dress
And go to next page and add to cart
Then validate total price


Examples: 
|URL										|email								|password|
|http://automationpractice.com/index.php	|jahirultech86@gmail.com			|sunday2019|