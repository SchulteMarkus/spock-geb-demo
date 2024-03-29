package dev.schulte.spockgebdemo.duckduckgo

import geb.Page

class DuckDuckGoPage extends Page {

  static url = 'https://duckduckgo.com/'

  static at = {
    title.startsWith('DuckDuckGo')
    !$('#logo_homepage_link').isEmpty()
  }

  static content = {
    searchField { $("#search_form_input_homepage") }
    searchButton(to: DuckDuckGoResultsPage) { $("#search_button_homepage") }
  }

  void search(String searchTerm) {
    searchField.value searchTerm
    searchButton.click()
  }
}
