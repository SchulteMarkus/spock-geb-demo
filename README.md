[![Conventional Commits](https://img.shields.io/badge/Conventional%20Commits-1.0.0-pink.svg)](https://conventionalcommits.org)
[![.github/workflows/run-e2etests.yml](https://github.com/SchulteMarkus/spock-geb-demo/actions/workflows/run-e2etests.yml/badge.svg)](https://github.com/SchulteMarkus/spock-geb-demo/actions/workflows/run-e2etests.yml)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=SchulteMarkus_spock-geb-demo&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=SchulteMarkus_spock-geb-demo)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=SchulteMarkus_spock-geb-demo&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=SchulteMarkus_spock-geb-demo)

# Spock Geb demo

This tiny demo demonstrates how to use [Geb](https://www.gebish.org) in combination with
[Spock](https://spockframework.org) for e2e testing.

    ### A Firefox will be launched for testing https://en.wikipedia.org/
    $ ./gradlew test -DshowBrowser=true

The demo is minimized, so you won't have problems understanding what happens.

## Basic technologies

- [Gradle](https://gradle.org/) as build tool, [build.gradle](build.gradle) contains the project's
  dependencies
- [Spock](https://spockframework.org) as a [Groovy](https://groovy-lang.org/) testing framework
- [Geb](https://www.gebish.org) for browser automation (uses [Selenium](https://www.selenium.dev/)
  itself)

## e2e testing done

- Testing https://en.wikipedia.org/ is done in
  [WikipediaTest](src/test/groovy/dev/schulte/spockgebdemo/wikipedia/WikipediaTest.groovy)
  - There are two Geb pages
    1. [WikipediaPage](src/test/groovy/dev/schulte/spockgebdemo/wikipedia/WikipediaPage.groovy) and
    2. [WikipediaResultsPage](src/test/groovy/dev/schulte/spockgebdemo/wikipedia/WikipediaResultsPage.groovy)

    which are used as part of the test
- [GebConfig.groovy](src/test/resources/GebConfig.groovy) sets up the selenium driver
  ([WebDriverManager](https://github.com/bonigarcia/webdrivermanager) is being used here)

# Further reading

See https://github.com/geb/geb-example-gradle for a similar example, but created/maintained by the
original Geb author(s).
