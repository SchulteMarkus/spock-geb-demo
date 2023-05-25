package dev.schulte.spockgebdemo

import geb.spock.GebSpec

class DuckDuckGoTest extends GebSpec {

  def 'Visit and use DuckDuckGo'() {
    given:
    to DuckDuckGoStartPage

    when:
    search 'Geb Spock'

    then:
    at DuckDuckGoResultsPage
    assert firstResultText != null
  }
}
