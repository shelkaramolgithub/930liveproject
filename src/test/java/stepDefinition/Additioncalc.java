package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Additioncalc {
	int a,b,sum;
	@Given("^get (\\d+) and (\\d+)$")
	public void get_and(int num1, int num2) throws Throwable {
	    a=num1;
	    b=num2;
	}

	@When("^calculate a\\+b$")
	public void calculate_a_b() throws Throwable {
	    sum=a+b;
	}

	@Then("^print the reults$")
	public void print_the_reults() throws Throwable {
	    System.out.println("results are="+sum);
	}



}
