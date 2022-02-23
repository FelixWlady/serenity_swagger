package swaglabs.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import swaglabs.model.SwaglabasUser;
import swaglabs.tasks.authentication.Login;
import swaglabs.tasks.navigate.Navigate;


public class AuthenticationStepDefinitions {

    @Given("{actor} is on the login page")
    public void is_on_the_login_page(Actor actor) {
        actor.attemptsTo(Navigate.toTheLoginPage());
    }

    @When("{actor} logs in with valid credentials")
    public void logs_in_with_valid_credentials(Actor actor) {
        actor.attemptsTo(
                Login.asA(SwaglabasUser.STANDARD_USER)
        );
    }

    @Given("{actor} has logged on to the application")
    public void is_logged_on(Actor actor) {
        actor.attemptsTo(
                Navigate.toTheLoginPage(),
                Login.asA(SwaglabasUser.STANDARD_USER)
        );
    }

    @Then("{actor} should be present in the product catalog")
    public void should_be_present_in_the_product_catalog(Actor actor) {
        actor.attemptsTo(
                Ensure.that(Text.of(".title")).isEqualToIgnoringCase("Products")
        );
    }

    @And("{actor} is browsing the catalog")
    public void heIsBrowsingTheCatalog(Actor actor) {
    }
}
