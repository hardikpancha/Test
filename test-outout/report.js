$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/SUMUKH/eclipse_workspace/Test/src/main/java/Features/HotelSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Search",
  "description": "",
  "id": "search",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Basic hotel search",
  "description": "",
  "id": "search;basic-hotel-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "the user has clicked Home to access the search page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "they have chosen the Hotels option",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "they have chosen a hotel for \u003ccity\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "they have chosen with dates \u003ccheckin\u003e to \u003ccheckout\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "they have selected number of \u003cadults\u003e and \u003cchildren\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "they click search",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "matching results are displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "search;basic-hotel-search;",
  "rows": [
    {
      "cells": [
        "city",
        "checkin",
        "checkout",
        "adults",
        "children"
      ],
      "line": 14,
      "id": "search;basic-hotel-search;;1"
    },
    {
      "cells": [
        "\"montreal\"",
        "\"11/22/2018\"",
        "\"11/24/2018\"",
        "1",
        "0"
      ],
      "line": 15,
      "id": "search;basic-hotel-search;;2"
    },
    {
      "cells": [
        "\"new york\"",
        "\"11/11/2018\"",
        "\"11/20/2018\"",
        "5",
        "1"
      ],
      "line": 16,
      "id": "search;basic-hotel-search;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8659941927,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Basic hotel search",
  "description": "",
  "id": "search;basic-hotel-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "the user has clicked Home to access the search page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "they have chosen the Hotels option",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "they have chosen a hotel for \"montreal\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "they have chosen with dates \"11/22/2018\" to \"11/24/2018\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "they have selected number of 1 and 0",
  "matchedColumns": [
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "they click search",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "matching results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelSearch.the_user_has_clicked_Home_to_access_the_search_page()"
});
formatter.result({
  "duration": 9176187075,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearch.they_have_chosen_the_Hotels_option()"
});
formatter.result({
  "duration": 3143423563,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "montreal",
      "offset": 30
    }
  ],
  "location": "HotelSearch.they_have_chosen_a_hotel_for_montreal(String)"
});
formatter.result({
  "duration": 1356597843,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11/22/2018",
      "offset": 29
    },
    {
      "val": "11/24/2018",
      "offset": 45
    }
  ],
  "location": "HotelSearch.they_have_chosen_with_dates_to(String,String)"
});
formatter.result({
  "duration": 833201926,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 29
    },
    {
      "val": "0",
      "offset": 35
    }
  ],
  "location": "HotelSearch.they_have_selected(int,int)"
});
formatter.result({
  "duration": 678082431,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearch.they_click_search()"
});
formatter.result({
  "duration": 1839202879,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearch.matching_results_are_displayed()"
});
formatter.result({
  "duration": 72180454,
  "status": "passed"
});
formatter.after({
  "duration": 96131707,
  "status": "passed"
});
formatter.before({
  "duration": 8846586259,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Basic hotel search",
  "description": "",
  "id": "search;basic-hotel-search;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "the user has clicked Home to access the search page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "they have chosen the Hotels option",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "they have chosen a hotel for \"new york\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "they have chosen with dates \"11/11/2018\" to \"11/20/2018\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "they have selected number of 5 and 1",
  "matchedColumns": [
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "they click search",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "matching results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelSearch.the_user_has_clicked_Home_to_access_the_search_page()"
});
formatter.result({
  "duration": 9896253535,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearch.they_have_chosen_the_Hotels_option()"
});
formatter.result({
  "duration": 2826746362,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "new york",
      "offset": 30
    }
  ],
  "location": "HotelSearch.they_have_chosen_a_hotel_for_montreal(String)"
});
formatter.result({
  "duration": 1571382703,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11/11/2018",
      "offset": 29
    },
    {
      "val": "11/20/2018",
      "offset": 45
    }
  ],
  "location": "HotelSearch.they_have_chosen_with_dates_to(String,String)"
});
formatter.result({
  "duration": 769547255,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 29
    },
    {
      "val": "1",
      "offset": 35
    }
  ],
  "location": "HotelSearch.they_have_selected(int,int)"
});
formatter.result({
  "duration": 458442895,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearch.they_click_search()"
});
formatter.result({
  "duration": 1560656876,
  "status": "passed"
});
formatter.match({
  "location": "HotelSearch.matching_results_are_displayed()"
});
formatter.result({
  "duration": 52004716,
  "status": "passed"
});
formatter.after({
  "duration": 110839108,
  "status": "passed"
});
});