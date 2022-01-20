package dev.schulte.spockgebdemo

import geb.Page

class DuckDuckGoResultsPage extends Page {

  static at = {
    title.endsWith(' at DuckDuckGo')
  }

  static content = {
    results { $("#links") }
    resultText { index -> results[index].text() }
    firstResultText { resultText(0) }
  }
}
