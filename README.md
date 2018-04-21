## Table of Contents

- [What Is This ?](#what-is-this)
- [Installation/Setup](#installation-setup)
- [Web FrontEnd](#web-front-end)
- [Node API](#node-api)
- [Cucumber](#cucumber)
- [Selenium](#selenium)
- [Running the Test Suite](#running-test-suite)

## What is This ?

This is a QA Automation Starter Pack.  It uses nginx (web server) and node (api server) for the runtime application component.  Also configured is a cucumber test suite with selenium for browser based testing along with junit for api level testing.  All this is packaged into Docker containers and is intended to be run on your local machine.

This starter pack is just for reference.  You should copy these files onto your project repository.

## Installation / Setup

The only software you need to install is Docker.

* [Mac](https://docs.docker.com/docker-for-mac/install/)
* [Windows](https://docs.docker.com/docker-for-windows/install/)

>NOTE : If you want to commit files onto github, then you will need [git](https://git-scm.com/downloads) as well.

## Web FrontEnd

The frontend nginx webserver will host your html, css, javascript and assets (images, pdfs, etc).  It was created using facebook's create-react-app starter pack.  The nginx web server is also configured to proxy any /api request to be forwarded and serviced by the node api server.

## Node API

The node api server was created using a yeoman [starter pack](https://github.com/diegohaz/rest).  It has a simple /dummy endpoint that will return an empty array.

## Cucumber

The goal of using [cucumber](https://cucumber.io/) is to encourage BDD (behaviour-driven development) and have this tool be used for automated acceptance tests.  

Cucumber allows a clear separation of the 'feature test cases' (written in [Gherkin Syntax](https://github.com/cucumber/cucumber/wiki/Gherkin), aka Plain English) and the actual implementation (aka source code to run the test).  Cucumber supports [various implementations](https://cucumber.io/docs), i.e. Ruby, Javascript and Java.  The samples provided are written in Java.

This model fits very well with Pair Programming, where dev/qa can work on the implementation, while product owners/business analyst (or anyone else) can write the feature test cases.

## Selenium

[Selenium](https://www.seleniumhq.org/) is used for browser based automated tests.  A sample test scenario to open google.com, performs a search and verifies the results are provided.

## Docker

Why do I need Docker ?  Docker is not a hard requirement to run your automation on your local machine.  It just makes things much, much easier.  Without docker, you will have to install Maven, JDK, Selenium Drivers, NPM/Node and maybe more... along with custom configurations in your workspace.  Docker has available "images", which has everything you need without any additional configuration.

For more information on Docker, go [here](https://www.docker.com/).

## Running the Test Suite

Open up your ssh terminal and navigate to the project-source directory.  Run the command below.

```sh
docker-compose up
```

This downloads all the images from the docker image repository.  It will then start up all the containers.  Lastly, it will run `mvn test`.

After all the containers are running, when adding/updating any test cases, execute the following to re-run the test again. (without having to stop the other containers)

```sh
./rerunTest.sh
```

This will ONLY execute `mvn clean test` in another container.

## Common Docker Commands

```sh
docker-compose down (shuts down all the containers)

docker ps -a (list all docker containers)

docker logs THE_CONTAINER_NAME (displays the logs of the container)
```

