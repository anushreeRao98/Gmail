package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObjects.Gmail;
import pageObjects.LaunchBrowser;

public class MyStepdefs {
    public WebDriver driver;
    Gmail gmail = new Gmail();

    public MyStepdefs() {

        this.driver = LaunchBrowser.driver;
    }


    @Given("^User launches the Gmail application$")
    public void user_launches_the_Gmail_application() {

        gmail.clickOnSignInButton();
    }

    @And("^User enters valid credentials to login$")
    public void User_enters_valid_credentials_to_login() {
        gmail.enterEmailId("testautomationcucumberid@gmail.com");
        gmail.clickOnButton("Next");
        gmail.enterPassword("Testautomation@2024");
        gmail.clickOnButton("Next");

    }

    @Given("^User searches for the email$")
    public void User_searches_for_the_email() {
        gmail.searchForEmail("test Gmail");
    }


    @Then("^User clicks on the email found$")
    public void User_clicks_on_the_email_found() {
        gmail.selectTheEmail();
    }

    @And("^User verifies the navigation to the email selected$")
    public void User_verifies_the_navigation_to_the_email_selected() {
        gmail.verifyEmail();
    }

    @Then("^User reads the contents of the email and prints$")
    public void User_reads_the_contents_of_the_email_and_prints() {
        gmail.readAndPrint();
    }

}
