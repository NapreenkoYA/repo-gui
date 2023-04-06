
// Valid POST Request using Rest Assured
public void UserRegistrationSuccessful() 
{ 
    RestAssured.baseURI =" https://test-stand.gb.ru/gateway/login"; 
    RequestSpecification request = RestAssured.given(); 
    JSONObject requestParams = new JSONObject();
    requestParams.put("userName", "GB202303616b94");
    requestParams.put("password", "d0cf321a2e"); 
    request.body(requestParams.toJSONString());
    Response response = request.put("/User"); 
    ResponseBody body = response.getBody();
    System.out.println(response.getStatusLine());
    System.out.println(body.asString());
     
}

//. InValid POST Request using Rest Assured
public void UserRegistrationUnSuccessful() 
{ 
    RestAssured.baseURI =" https://test-stand.gb.ru/gateway/login"; 
    RequestSpecification request = RestAssured.given(); 
    JSONObject requestParams = new JSONObject();
    requestParams.put("userName", "test_rest");
    requestParams.put("password", "Testrest@123"); 
    request.body(requestParams.toJSONString());
    Response response = request.put("/User"); 
    ResponseBody body = response.getBody();
    System.out.println(response.getStatusLine());
    System.out.println(body.asString());
}
