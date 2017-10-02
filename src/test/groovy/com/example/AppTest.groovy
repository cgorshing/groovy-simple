package com.example

import groovy.util.logging.Slf4j
import org.junit.Test

@Slf4j
class AppTest {

  @Test
  void appReturnsTheMeaningOfLife() {
    App app = new App()

    assert 42 == app.run()
  }
}
