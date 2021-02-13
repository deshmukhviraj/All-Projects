$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/Application.feature");
formatter.feature({
  "line": 1,
  "name": "Perfom CRUD operations on Address Book website",
  "description": "",
  "id": "perfom-crud-operations-on-address-book-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4328507400,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#Scenario: Open Address Book website \u0026 Sign up"
    },
    {
      "line": 4,
      "value": "#\tGiven User is already on the TestAddressBook page"
    },
    {
      "line": 5,
      "value": "#\tWhen User clicks on the Sign in link"
    },
    {
      "line": 6,
      "value": "#\tThen the Sign in page is displayed"
    },
    {
      "line": 7,
      "value": "#\tWhen User clicks on SignUp link"
    },
    {
      "line": 8,
      "value": "#\tThen the Sign Up page is displayed"
    },
    {
      "line": 9,
      "value": "#\tWhen User enters the Email address and Password on SignUp page"
    },
    {
      "line": 10,
      "value": "#\tAnd Clicks on the Sign up button"
    },
    {
      "line": 11,
      "value": "#\tThen User navigates to the Welcome page"
    }
  ],
  "line": 13,
  "name": "Sign in and sign out",
  "description": "",
  "id": "perfom-crud-operations-on-address-book-website;sign-in-and-sign-out",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "User is already on the TestAddressBook page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User clicks on the Sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the Sign in page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User enters the Email address and Password on SignIn page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Clicks on the Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User navigates to the Welcome page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User clicks on the Sign out link",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "the Sign in page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_is_already_on_the_TestAddressBook_page()"
});
formatter.result({
  "duration": 2635084900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_clicks_on_the_Sign_in_link()"
});
formatter.result({
  "duration": 255676400,
  "status": "passed"
});
formatter.match({
  "location": "SignInPageSteps.the_Sign_in_page_is_displayed()"
});
formatter.result({
  "duration": 658724600,
  "status": "passed"
});
formatter.match({
  "location": "SignInPageSteps.user_enters_the_Email_address_and_Password_on_SignIn_page()"
});
formatter.result({
  "duration": 312604600,
  "status": "passed"
});
formatter.match({
  "location": "SignInPageSteps.clicks_on_the_Sign_in_button()"
});
formatter.result({
  "duration": 1002175900,
  "status": "passed"
});
formatter.match({
  "location": "WelcomePageSteps.user_navigates_to_the_Welcome_page()"
});
formatter.result({
  "duration": 2022911600,
  "status": "passed"
});
formatter.match({
  "location": "WelcomePageSteps.user_clicks_on_the_Sign_out_link()"
});
formatter.result({
  "duration": 826499000,
  "status": "passed"
});
formatter.match({
  "location": "SignInPageSteps.the_Sign_in_page_is_displayed()"
});
formatter.result({
  "duration": 77887700,
  "status": "passed"
});
formatter.after({
  "duration": 169095200,
  "status": "passed"
});
});