package com.app.stepdef;

import com.app.pages.LoginPage;
import com.app.pages.ProductsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    @When("^enter user name \"([^\"]*)\"$")
    public void enterUserName(String username) throws InterruptedException {
        new LoginPage().enterUserName(username);


    }
    @When("^enter the password as \"([^\"]*)\"$")
    public void enterThePasswordAs(String password) {
        new LoginPage().enterPassword(password);

    }
    @When("login")
    public void login() {
        new LoginPage().pressLoginBtn();
    }


    @Then("^should get error message \"([^\"]*)\"$")
    public void shouldGetErrorMessage(String err) {
        Assert.assertEquals(new LoginPage().getErrTxt(), err);

    }

    @Then("^should see Products page with title \"([^\"]*)\"$")
    public void shouldSeeProductsPageWithTitle(String title) {
        Assert.assertEquals(new ProductsPage().getTitle(), title);

    }

}
