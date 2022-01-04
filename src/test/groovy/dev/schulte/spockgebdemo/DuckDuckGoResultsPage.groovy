package dev.schulte.spockgebdemo

import geb.Page

class DuckDuckGoResultsPage extends Page {

  static at = {
    title.endsWith(' at DuckDuckGo')
  }

  static content = {
    results { $("#links") }
    result { index -> results[index] }
  }
}
