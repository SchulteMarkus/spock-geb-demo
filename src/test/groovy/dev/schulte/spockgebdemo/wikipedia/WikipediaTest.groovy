package dev.schulte.spockgebdemo.wikipedia


import geb.spock.GebSpec

class WikipediaTest extends GebSpec {

  def 'Visit and search on Wikipedia'() {
    given:
    to WikipediaPage

    when:
    search 'Geb Spock'

    then:
    at WikipediaResultsPage
    assert firstResultText != null
  }
}
