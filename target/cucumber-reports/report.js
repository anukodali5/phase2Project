$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/FeatureFiles/Checkout.feature");
formatter.feature({
  "name": "Checkout Module",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Login and go to Products page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepsDefinations.verifyLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter the the following credentails",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "loginStepsDefinations.verifyLoginCredentails(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be landed on the Products Page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepsDefinations.displaySucessMsg()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user is on the Products page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@checkout"
    },
    {
      "name": "@positive"
    },
    {
      "name": "@critical"
    }
  ]
});
formatter.step({
  "name": "User landed at Product page after logged in successfully",
  "keyword": "When "
});
formatter.match({
  "location": "loginStepsDefinations.Verify()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to notice the Shopping Cart icon badge changed",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepsDefinations.verifyAddProductToCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able examine the item in Shopping cart",
  "keyword": "And "
});
formatter.match({
  "location": "loginStepsDefinations.verifyCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on checkout",
  "keyword": "And "
});
formatter.match({
  "location": "loginStepsDefinations.clickOnCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User provides profile info clicks on Continue button",
  "keyword": "And "
});
formatter.match({
  "location": "loginStepsDefinations.clickOnContinue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on products overview page clciks on Finish",
  "keyword": "And "
});
formatter.match({
  "location": "loginStepsDefinations.clickOnFinish()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/FeatureFiles/login.feature");
formatter.feature({
  "name": "Login Module",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify that login is working with correct credentails",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@login"
    },
    {
      "name": "@positive"
    },
    {
      "name": "@critical"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepsDefinations.verifyLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter the the following credentails",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "loginStepsDefinations.verifyLoginCredentails(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be landed on the Products Page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepsDefinations.displaySucessMsg()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});