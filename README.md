# Spock Geb demo

This tiny demo demonstrates how to use [Geb](https://www.gebish.org) in combination with
[Spock](https://spockframework.org) for e2e testing.

    ### A Firefox will be launched for testing duckduckgo.com
    $ ./gradlew test -DshowBrowser=true

The demo is minimized, so you won't have problems understanding what happens.

## Basic technologies

- [Gradle](https://gradle.org/) as build tool, [build.gradle](build.gradle) contains the project's
  dependencies
- [Spock](https://spockframework.org) as a [Groovy](https://groovy-lang.org/) testing framework
- [Geb](https://www.gebish.org) for browser automation (uses [Selenium](https://www.selenium.dev/)
  itself)

## e2e testing done

- Testing duckduckgo.com is done
  in [DuckDuckGoTest](src/test/groovy/dev/schulte/spockgebdemo/DuckDuckGoTest.groovy)
  - There are two Geb pages
    [DuckDuckGoStartPage](src/test/groovy/dev/schulte/spockgebdemo/DuckDuckGoStartPage.groovy) and
    [DuckDuckGoResultsPage](src/test/groovy/dev/schulte/spockgebdemo/DuckDuckGoResultsPage.groovy)
    which are used as part of the test
- [GebConfig.groovy](src/test/resources/GebConfig.groovy) sets up the selenium driver
  ([WebDriverManager](https://github.com/bonigarcia/webdrivermanager) is being used here)
