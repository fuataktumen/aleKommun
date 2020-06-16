$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/upplevAle.feature");
formatter.feature({
  "name": "Navigating Upplev Ale module",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@all"
    }
  ]
});
formatter.scenario({
  "name": "The user should reserve one room on www.glasbruksmuseet.se",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@all"
    },
    {
      "name": "@HyraLokal"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be able to be main page of www.glasbruksmuseet.se",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.HyraLokalStepDef.the_user_should_be_able_to_be_main_page_of_www_glasbruksmuseet_se()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should be able to click Hyra Lokal under Boka Hyr module",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.HyraLokalStepDef.the_user_should_be_able_to_click_Hyra_Lokal_under_Boka_Hyr_module()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click skapaFörfrogan",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.HyraLokalStepDef.the_user_should_click_skapaFörfrogan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should be able to select one option under the Välj lokal att hyra",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.HyraLokalStepDef.the_user_should_be_able_to_select_one_option_under_the_Välj_lokal_att_hyra()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should be able to select the date of reservation",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.HyraLokalStepDef.the_user_should_be_able_to_select_the_date_of_reservation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should fill required blanks",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.HyraLokalStepDef.the_user_should_fill_required_blanks()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click SKİCKA",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.HyraLokalStepDef.the_user_should_click_SKİCKA()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});