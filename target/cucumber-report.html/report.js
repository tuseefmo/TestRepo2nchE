$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "As a valid user, I should be able to login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "name": "Client Center login verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the website",
  "keyword": "Given "
});
formatter.match({
  "location": "deliveryConfiguration_Tuseef.step_def.Login_StepDef.i_am_on_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the correct credentials",
  "keyword": "When "
});
formatter.match({
  "location": "deliveryConfiguration_Tuseef.step_def.Login_StepDef.i_enter_the_correct_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "deliveryConfiguration_Tuseef.step_def.Login_StepDef.i_should_be_able_to_login_successfully()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: Title verification is failed!!! expected:\u003c[Client Center]\u003e but was:\u003c[Sign in to your account]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat deliveryConfiguration_Tuseef.step_def.Login_StepDef.i_should_be_able_to_login_successfully(Login_StepDef.java:37)\r\n\tat ✽.I should be able to login successfully(file:///C:/Users/Tuseef%20Mohammed/IdeaProjects/DeliveryConfiguration_Tuseef/src/test/resources/features/Login.feature:7)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "Client Center login verification");
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/MyReports.feature");
formatter.feature({
  "name": "My Reports",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@MyReports"
    }
  ]
});
formatter.scenario({
  "name": "My Reports",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MyReports"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the main web page",
  "keyword": "Given "
});
formatter.match({
  "location": "deliveryConfiguration_Tuseef.step_def.MyReports_StepDef.iAmOnTheMainWebPage()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Client Center]\u003e but was:\u003c[Sign in to your account]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat deliveryConfiguration_Tuseef.step_def.MyReports_StepDef.iAmOnTheMainWebPage(MyReports_StepDef.java:25)\r\n\tat ✽.I am on the main web page(file:///C:/Users/Tuseef%20Mohammed/IdeaProjects/DeliveryConfiguration_Tuseef/src/test/resources/features/MyReports.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I click File Center module",
  "keyword": "When "
});
formatter.match({
  "location": "deliveryConfiguration_Tuseef.step_def.MyReports_StepDef.i_click_File_Center_module()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I make sure that there is no \"Myreports\" module",
  "keyword": "Then "
});
formatter.match({
  "location": "deliveryConfiguration_Tuseef.step_def.MyReports_StepDef.iMakeSureThatThereIsNoModule(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click the user icon",
  "keyword": "Then "
});
formatter.match({
  "location": "deliveryConfiguration_Tuseef.step_def.MyReports_StepDef.iClickTheUserIcon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click the \"Start Impersonating\" link",
  "keyword": "And "
});
formatter.match({
  "location": "deliveryConfiguration_Tuseef.step_def.MyReports_StepDef.iClickTheLink(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I add \"bob backline\" as a username in the field",
  "keyword": "Then "
});
formatter.match({
  "location": "deliveryConfiguration_Tuseef.step_def.MyReports_StepDef.iAddAsAUsernameInTheField(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click the \"Start Impersonating\" button",
  "keyword": "And "
});
formatter.match({
  "location": "deliveryConfiguration_Tuseef.step_def.MyReports_StepDef.iClickTheButton(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on the My Reports button",
  "keyword": "Then "
});
formatter.match({
  "location": "deliveryConfiguration_Tuseef.step_def.MyReports_StepDef.iClickOnTheMyReportsButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I am in the Myreports module",
  "keyword": "And "
});
formatter.match({
  "location": "deliveryConfiguration_Tuseef.step_def.MyReports_StepDef.iAmInTheMyreportsModule()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png", "My Reports");
formatter.after({
  "status": "passed"
});
});