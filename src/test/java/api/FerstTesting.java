package api;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.get;

public class FerstTesting {
    @Test(description = "GET")
    public void getRequestExampleTest() throws JSONException {
        Response response = get("");
        JSONArray jsonResponse = new JSONArray(response.asString());
        String capital = jsonResponse.getJSONObject(0).getString("capital");
        Assert.assertEquals(capital, "Moscow");
    }
}
