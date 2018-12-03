$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/buscar_pelicula.feature");
formatter.feature({
  "name": "Search for a movie",
  "description": "  The user wants to look for a movie on the page",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Search for a movie",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "that the user wants to choose a movie",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user manages to select the movie that he wants",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the should be able to see the movie that he selects",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});