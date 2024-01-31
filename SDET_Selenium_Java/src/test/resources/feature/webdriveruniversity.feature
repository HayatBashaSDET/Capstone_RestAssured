Feature: WebDriverUniversity


@Test
Scenario: Verify images are changing or not
		Given User Launch chrome driver and open "http://webdriveruniversity.com/index.html" url.
		When User click on "iframe"
		And  new tab has opened and switch to that tab.
		Then user able to see images change while clicking arrows.
	