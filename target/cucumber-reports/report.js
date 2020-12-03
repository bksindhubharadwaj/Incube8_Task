$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Q1b.feature");
formatter.feature({
  "line": 1,
  "name": "To navigate to IMDB and perform tasks",
  "description": "",
  "id": "to-navigate-to-imdb-and-perform-tasks",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Navigate to IMDB page and search",
  "description": "",
  "id": "to-navigate-to-imdb-and-perform-tasks;navigate-to-imdb-page-and-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User navigates to page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "click on menu button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "select Top rated shows link",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigates_to_page()"
});
formatter.result({
  "duration": 4826007396,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_menu_button()"
});
formatter.result({
  "duration": 448359967,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.select_Top_rated_shows_link()"
});
formatter.result({
  "duration": 3731947218,
  "status": "passed"
});
formatter.uri("Q1c.feature");
formatter.feature({
  "line": 1,
  "name": "Search for Game of thrones",
  "description": "",
  "id": "search-for-game-of-thrones",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Search and choose Last watch episode",
  "description": "",
  "id": "search-for-game-of-thrones;search-and-choose-last-watch-episode",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User navigates to page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "searches for GoT",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "selects the Last watch link",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigates_to_page()"
});
formatter.result({
  "duration": 1618321745,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionGoT.searches_for_GoT()"
});
formatter.result({
  "duration": 4896784836,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionGoT.selects_the_Last_watch_link()"
});
formatter.result({
  "duration": 4145276781,
  "status": "passed"
});
formatter.uri("Q1d.feature");
formatter.feature({
  "line": 1,
  "name": "Assertions",
  "description": "",
  "id": "assertions",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Assertions for attributes",
  "description": "",
  "id": "assertions;assertions-for-attributes",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Home page navigation",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "assert for title of episode as \"\u003ctitle\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "assert for the rating as \"\u003crating\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "assert for number of reviews",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "assertions;assertions-for-attributes;",
  "rows": [
    {
      "cells": [
        "title",
        "rating"
      ],
      "line": 10,
      "id": "assertions;assertions-for-attributes;;1"
    },
    {
      "cells": [
        "Game of Thrones",
        "9.3"
      ],
      "line": 11,
      "id": "assertions;assertions-for-attributes;;2"
    },
    {
      "cells": [
        "Friends",
        "8.9"
      ],
      "line": 12,
      "id": "assertions;assertions-for-attributes;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Assertions for attributes",
  "description": "",
  "id": "assertions;assertions-for-attributes;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Home page navigation",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "assert for title of episode as \"Game of Thrones\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "assert for the rating as \"9.3\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "assert for number of reviews",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiintionAssertion.Home_page_navigation()"
});
formatter.result({
  "duration": 2279829420,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Game of Thrones",
      "offset": 32
    }
  ],
  "location": "StepDefiintionAssertion.assertForTitleOfEpisodeAs(String)"
});
formatter.result({
  "duration": 11722505965,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9.3",
      "offset": 26
    }
  ],
  "location": "StepDefiintionAssertion.assertForTheRatingAs(String)"
});
formatter.result({
  "duration": 32062902,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiintionAssertion.assertForNumberOfReviews()"
});
formatter.result({
  "duration": 33922879,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Assertions for attributes",
  "description": "",
  "id": "assertions;assertions-for-attributes;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Home page navigation",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "assert for title of episode as \"Friends\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "assert for the rating as \"8.9\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "assert for number of reviews",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiintionAssertion.Home_page_navigation()"
});
formatter.result({
  "duration": 2141049129,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Friends",
      "offset": 32
    }
  ],
  "location": "StepDefiintionAssertion.assertForTitleOfEpisodeAs(String)"
});
formatter.result({
  "duration": 6098410569,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8.9",
      "offset": 26
    }
  ],
  "location": "StepDefiintionAssertion.assertForTheRatingAs(String)"
});
formatter.result({
  "duration": 33160073,
  "status": "passed"
});
formatter.match({
  "location": "StepDefiintionAssertion.assertForNumberOfReviews()"
});
formatter.result({
  "duration": 32901975,
  "status": "passed"
});
formatter.uri("Q2a.feature");
formatter.feature({
  "line": 1,
  "name": "To navigate to IMDB and create account",
  "description": "",
  "id": "to-navigate-to-imdb-and-create-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Create accounts",
  "description": "",
  "id": "to-navigate-to-imdb-and-create-account;create-accounts",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Landing page navigation",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "click on create new account",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user enters name, email and password with prefix as \"\u003cprefix\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on submit",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "to-navigate-to-imdb-and-create-account;create-accounts;",
  "rows": [
    {
      "cells": [
        "prefix"
      ],
      "line": 10,
      "id": "to-navigate-to-imdb-and-create-account;create-accounts;;1"
    },
    {
      "cells": [
        "dummy"
      ],
      "line": 11,
      "id": "to-navigate-to-imdb-and-create-account;create-accounts;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Create accounts",
  "description": "",
  "id": "to-navigate-to-imdb-and-create-account;create-accounts;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Landing page navigation",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "click on create new account",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user enters name, email and password with prefix as \"dummy\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on submit",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionCreateNew.landingPageNavigation()"
});
formatter.result({
  "duration": 4032765245,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionCreateNew.clickOnCreateNewAccount()"
});
formatter.result({
  "duration": 1230642069,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dummy",
      "offset": 53
    }
  ],
  "location": "StepDefinitionCreateNew.userEntersNameEmailAndPasswordWithPrefixAs(String)"
});
formatter.result({
  "duration": 698299965,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionCreateNew.userClicksOnSubmit()"
});
formatter.result({
  "duration": 3276078313,
  "status": "passed"
});
formatter.uri("Q2b.feature");
formatter.feature({
  "line": 1,
  "name": "To navigate to IMDB and sign in",
  "description": "",
  "id": "to-navigate-to-imdb-and-sign-in",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Sign In",
  "description": "",
  "id": "to-navigate-to-imdb-and-sign-in;sign-in",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Sign In Landing page navigation",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user enters  email as \"\u003cemail\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "check if user name as \"\u003cname\u003e\" is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "to-navigate-to-imdb-and-sign-in;sign-in;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "name"
      ],
      "line": 11,
      "id": "to-navigate-to-imdb-and-sign-in;sign-in;;1"
    },
    {
      "cells": [
        "bksindhubharadwaj@gmail.com",
        "airtest123",
        "Sindhu"
      ],
      "line": 12,
      "id": "to-navigate-to-imdb-and-sign-in;sign-in;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Sign In",
  "description": "",
  "id": "to-navigate-to-imdb-and-sign-in;sign-in;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Sign In Landing page navigation",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user enters  email as \"bksindhubharadwaj@gmail.com\" and password as \"airtest123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "check if user name as \"Sindhu\" is displayed",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionSignIn.signInLandingPageNavigation()"
});
formatter.result({
  "duration": 5774408832,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionSignIn.userClicksOnSignIn()"
});
formatter.result({
  "duration": 1069882954,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bksindhubharadwaj@gmail.com",
      "offset": 23
    },
    {
      "val": "airtest123",
      "offset": 69
    }
  ],
  "location": "StepDefinitionSignIn.userEntersEmailAsAndPasswordAs(String,String)"
});
formatter.result({
  "duration": 295909884,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionSignIn.userClicksOnLogin()"
});
formatter.result({
  "duration": 119431256,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sindhu",
      "offset": 23
    }
  ],
  "location": "StepDefinitionSignIn.checkIfUserNameAsIsDisplayed(String)"
});
formatter.result({
  "duration": 3302877362,
  "status": "passed"
});
});