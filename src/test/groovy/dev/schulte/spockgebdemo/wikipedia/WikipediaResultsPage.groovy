package dev.schulte.spockgebdemo.wikipedia

import geb.Page

class WikipediaResultsPage extends Page {

  static url = '/w/index.php'

  static at = {
    title.endsWith(' - Wikipedia')
  }

  static content = {
    results { $("#mw-content-text .searchresults") }
    resultText { index -> results[index].text() }
    firstResultText { resultText(0) }
  }
}
