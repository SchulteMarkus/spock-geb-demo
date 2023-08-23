package dev.schulte.spockgebdemo

import geb.Page

class DuckDuckGoStartPage extends Page {

  static at = {
    title.startsWith('DuckDuckGo')
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
