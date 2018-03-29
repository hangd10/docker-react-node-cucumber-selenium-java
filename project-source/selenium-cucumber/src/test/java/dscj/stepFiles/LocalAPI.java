package dscj.stepFiles;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class LocalAPI {
	private String httpStatus = "";

	@Before
	public void setup() {

	}
	
	@After
	public void tearDown() {

	}
	
	@Given("^API call to dummy endpoint")
	public void client_api_invokation() throws Throwable {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet request = new HttpGet("http://nginx/api/dummies");
		HttpResponse httpResponse = httpClient.execute(request);
		httpStatus = httpResponse.getStatusLine().getStatusCode()+ "";
	}

	@Then("^Status code of 200 should be returned")
	public void status_code_verification() throws Throwable {
		Assert.assertEquals(httpStatus, "200");
	}
}
