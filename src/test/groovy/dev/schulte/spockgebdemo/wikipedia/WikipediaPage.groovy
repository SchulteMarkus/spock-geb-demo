package dev.schulte.spockgebdemo.wikipedia

import geb.Page

class WikipediaPage extends Page {

  static url = 'https://en.wikipedia.org/'

  static at = {
    title.startsWith('Wikipedia')
  }

  static content = {
    searchField { $("#searchInput") }
    searchButton(to: WikipediaResultsPage) { $("#searchform > button") }
  }

  void search(String searchTerm) {
    searchField.value searchTerm
    searchButton.click()
  }
}
