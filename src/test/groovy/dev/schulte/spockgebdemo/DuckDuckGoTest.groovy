package dev.schulte.spockgebdemo

import geb.spock.GebSpec

class DuckDuckGoTest extends GebSpec {

  def 'Visit and use DuckDuckGo'() {
    given:
    to DuckDuckGoStartPage

    when:
    search 'Geb Spock'

    then:
    assert result(0).text().contains('Geb')
  }
}
