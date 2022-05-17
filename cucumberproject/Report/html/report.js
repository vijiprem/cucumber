$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Featuresfile/login.feature");
formatter.feature({
  "name": "To Validate facebook Login Functionalies",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "check login through chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Facebook.check_login_through_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "To validate 2d data fb login through data table",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@data2d"
    }
  ]
});
formatter.step({
  "name": "check login through chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Facebook.check_login_through_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To login userName and password",
  "rows": [
    {
      "cells": [
        "viji",
        "pavi",
        "prem",
        "vimala"
      ]
    },
    {
      "cells": [
        "dhanya",
        "shree",
        "kgijnm",
        "dfjgk"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Facebook.to_login_userName_and_password(DataTable)"
});
formatter.result({
  "error_message": "java.lang.IndexOutOfBoundsException: Index: 5, Size: 2\r\n\tat java.util.ArrayList.rangeCheck(ArrayList.java:659)\r\n\tat java.util.ArrayList.get(ArrayList.java:435)\r\n\tat java.util.Collections$UnmodifiableList.get(Collections.java:1311)\r\n\tat org.demo.Facebook.to_login_userName_and_password(Facebook.java:66)\r\n\tat ✽.To login userName and password(file:src/test/resources/Featuresfile/login.feature:41)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click login",
  "keyword": "Then "
});
formatter.match({
  "location": "Facebook.click_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});