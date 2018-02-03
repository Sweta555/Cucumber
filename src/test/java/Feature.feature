Feature: Naukri.com Testing

  Scenario: Validate Login
    Given Go to URL
    When Verify title
    When Click login icon
    When Username "<Swetasharma@hotmail.com>" and Password "<Me@tcs1989>"
    When Click Login button
    Then Login Success
    When Verify Home page
    When Click My Profile
    Then Logout from Naukri app
