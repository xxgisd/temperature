package com.packtpub.mastering.selenium.steps;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;

/**
 * Created by julieGong on 12/27/15.
 */
public class ConversionStepDefs {


    @Given("^I want to  convert (\\d+).(\\d+) degree Fahrenheit to Celsius$")
    public void I_want_to_convert_degree_Fahrenheit_to_Celsius(int arg1, int arg2) throws Throwable {
        // Express the Regexp above with the code you wish you had




        throw new PendingException();
    }

    @When("^I input the value of Fahrenheit as (\\d+).(\\d+) in text field$")
    public void I_input_the_value_of_Fahrenheit_as_in_text_field(int arg1, int arg2) throws Throwable {
        // Express the Regexp above with the code you wish you had

        // new changes here
        throw new PendingException();
    }

    @Then("^It should be converted to Celsius as (\\d+) degree$")
    public void It_should_be_converted_to_Celsius_as_degree(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }


}
