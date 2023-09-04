package dev.schulte.spockgebdemo.duckduckgo

import geb.spock.GebSpec
import spock.lang.Ignore

class DuckDuckGoTest extends GebSpec {

  @Ignore
  def 'Visit and search on DuckDuckGo'() {
    given:
    to DuckDuckGoPage

    when:
    search 'Geb Spock'

    then:
    at DuckDuckGoResultsPage
    assert firstResultText != null
  }
}
