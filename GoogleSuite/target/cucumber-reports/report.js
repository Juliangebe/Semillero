$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/google_translate.feature");
formatter.feature({
  "name": "Google Translate",
  "description": "\tAs a web user\n\tI wan to use Google Translate\n\tto translate words between different languages",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Translate from English to Spanish",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "that susan wants yo translate a word",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleTranslateStepDefinitions.thatSusanWantsYoTranslateAWord()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she translates the word cheese from English to Spanish",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleTranslateStepDefinitions.sheTranslatesTheWordCheeseFromEnglishToSpanish()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "she should see the word queso in the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleTranslateStepDefinitions.sheShouldSeeTheWordQuesoInTheScreen()"
});
formatter.result({
  "status": "passed"
});
});