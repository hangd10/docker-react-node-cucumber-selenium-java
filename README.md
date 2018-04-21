## Table of Contents

- [What Is This ?](#what-is-this)
- [Installation/Setup](#installation-setup)
- [Cucumber](#cucumber)
- [Selenium](#selenium)
- [Running the Test Suite](#running-test-suite)

## What is This ?

This is a QA Automation Starter Pack.  Cucumber test suite with selenium for browser based testing along with junit for api level testing.  This is configured to be run on your local machine.

This starter pack is just for reference.  You should copy these files onto your project repository.

## Installation / Setup

The software you need to install is Docker.

* [Maven](https://maven.apache.org/)
* [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

> You can also configure Docker and avoid the installation software steps above.  See [Master Branch](https://github.com/hangd10/docker-react-node-cucumber-selenium-java) for reference.

>NOTE : If you want to commit files onto github, then you will need [git](https://git-scm.com/downloads) as well.

## Cucumber

The goal of using [cucumber](https://cucumber.io/) is to encourage BDD (behaviour-driven development) and have this tool be used for automated acceptance tests.  

Cucumber allows a clear separation of the 'feature test cases' (written in [Gherkin Syntax](https://github.com/cucumber/cucumber/wiki/Gherkin), aka Plain English) and the actual implementation (aka source code to run the test).  Cucumber supports [various implementations](https://cucumber.io/docs), i.e. Ruby, Javascript and Java.  The samples provided are written in Java.

This model fits very well with Pair Programming, where dev/qa can work on the implementation, while product owners/business analyst (or anyone else) can write the feature test cases.

## Selenium

[Selenium](https://www.seleniumhq.org/) is used for browser based automated tests.  A sample test scenario to open google.com, performs a search and verifies the results are provided.

## Running the Test Suite

> The current [pom.xml](https://github.com/hangd10/docker-react-node-cucumber-selenium-java/blob/aceMobileSettings/project-source/selenium-cucumber/pom.xml) assumes you have JDK 1.8.0_91.  Edit line 33 to match your local jdk installation.

Open up your ssh terminal and navigate to the project-source/selenium-cucumber directory.  Run the command below.

```sh
mvn clean test
```

This will run the test suite as .feature files defined in [featureFiles](https://github.com/hangd10/docker-react-node-cucumber-selenium-java/tree/aceMobileSettings/project-source/selenium-cucumber/src/test/java/dscj/featureFIles)

