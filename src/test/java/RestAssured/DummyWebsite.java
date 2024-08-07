package RestAssured;
import io.restassured.RestAssured;


import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;


public class DummyWebsite {
	@Test(enabled=true, priority = 0)
	public void loginToGetToken() {
		JSONObject js = new JSONObject();
		js.put("username", "emilys");
		js.put("password", "emilyspass");
		js.put("expiresInMins", "30");
		
		given().contentType("application/json").body(js.toJSONString()).when().post("https://dummyjson.com/auth/login").then().log().all();
		
	}
	
	@Test(enabled=true, priority = 1)
	public void getAuthUser() {
		
//		eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwidXNlcm5hbWUiOiJlbWlseXMiLCJlbWFpbCI6ImVtaWx5LmpvaG5zb25AeC5kdW1teWpzb24uY29tIiwiZmlyc3ROYW1lIjoiRW1pbHkiLCJsYXN0TmFtZSI6IkpvaG5zb24iLCJnZW5kZXIiOiJmZW1hbGUiLCJpbWFnZSI6Imh0dHBzOi8vZHVtbXlqc29uLmNvbS9pY29uL2VtaWx5cy8xMjgiLCJpYXQiOjE3MTcyMjU3MjgsImV4cCI6MTcxNzIyNzUyOH0.nTfZ9UUSVlU6vkdVw0D6Fmn_eT8JWEEajdGoTUEerZ8
		
		given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwidXNlcm5hbWUiOiJlbWlseXMiLCJlbWFpbCI6ImVtaWx5LmpvaG5zb25AeC5kdW1teWpzb24uY29tIiwiZmlyc3ROYW1lIjoiRW1pbHkiLCJsYXN0TmFtZSI6IkpvaG5zb24iLCJnZW5kZXIiOiJmZW1hbGUiLCJpbWFnZSI6Imh0dHBzOi8vZHVtbXlqc29uLmNvbS9pY29uL2VtaWx5cy8xMjgiLCJpYXQiOjE3MTcyMjU3MjgsImV4cCI6MTcxNzIyNzUyOH0.nTfZ9UUSVlU6vkdVw0D6Fmn_eT8JWEEajdGoTUEerZ8")
		.contentType(ContentType.JSON).when().get("https://dummyjson.c-0om/auth/me").then().log().all();
	}
	
	@Test(enabled=true, priority = 2)
	public void refreshAuthSession() {
		
		JSONObject js = new JSONObject();
		js.put("expiresInMins", "30");
		
		given().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwidXNlcm5hbWUiOiJlbWlseXMiLCJlbWFpbCI6ImVtaWx5LmpvaG5zb25AeC5kdW1teWpzb24uY29tIiwiZmlyc3ROYW1lIjoiRW1pbHkiLCJsYXN0TmFtZSI6IkpvaG5zb24iLCJnZW5kZXIiOiJmZW1hbGUiLCJpbWFnZSI6Imh0dHBzOi8vZHVtbXlqc29uLmNvbS9pY29uL2VtaWx5cy8xMjgiLCJpYXQiOjE3MTcyMjU3MjgsImV4cCI6MTcxNzIyNzUyOH0.nTfZ9UUSVlU6vkdVw0D6Fmn_eT8JWEEajdGoTUEerZ8")
		.contentType(ContentType.JSON).body(js.toJSONString()).when().post("https://dummyjson.com/auth/refresh").then().log().all();
		
	}
	
	@Test(enabled=true, priority = 3)
	public void getAllProducts() {
		given().contentType("application/json").when().get("https://dummyjson.com/products").then().log().all();
	}
	
	@Test(enabled=true, priority = 4)
	public void getaSingleProduct() {
		given().contentType("application/json").when().get("https://dummyjson.com/products/1").then().log().all();
	}
	
	@Test(enabled=true, priority = 5)
	public void searchForAproduct() {
		given().contentType("application/json").when().get("https://dummyjson.com/products/search?q=phone").then().log().all();
	}
	
	
	@Test(enabled=true, priority = 6)
	public void limitandskipaProduct() {
		given().contentType("application/json").when().get("https://dummyjson.com/products?limit=10&skip=10&select=title,price").then().log().all();
	}
	
	@Test(enabled=true, priority = 7)
	public void sorttheProduct() {
		given().contentType("application/json").when().get("https://dummyjson.com/products?sortBy=title&order=asc").then().log().all();
	
	}
	
	
	@Test(enabled=true, priority = 8)
	public void getAlltheProduct() {
		given().contentType("application/json").when().get("https://dummyjson.com/products/categories").then().log().all();
	
	}
	
	@Test(enabled=true,priority = 9)
	public void getProductCategoryList() {
		given().contentType("application/json").when().get("https://dummyjson.com/products/category-list").then().log().all();
	
	}
	
	@Test(enabled=true, priority = 10)
	public void getProductBycategory() {
		given().contentType("application/json").when().get("https://dummyjson.com/products/category/smartphones").then().log().all();
	
	}
	
	@Test(enabled=true, priority = 11)
	public void AddAProduct() {
		
		JSONObject js = new JSONObject();
		js.put("title", "BMW Pencil");
		
		given().contentType("application/json").body(js.toJSONString()).when().post("https://dummyjson.com/products/add").then().log().all();
	
	}
	@Test(enabled=true, priority = 12)
     public void updateAProduct() {
		
		JSONObject js = new JSONObject();
		js.put("title", "iPhone Galaxy +1");
		
		given().contentType("application/json").body(js.toJSONString()).when().put("https://dummyjson.com/products/1").then().log().all();
	
	}
	
	@Test(enabled=true, priority = 13)
	public void DeleteAProduct() {
		given().contentType("application/json").when().delete("https://dummyjson.com/products/1").then().log().all();
	
	}
	
	
	
	
	
	
	
	
	
	

}

}
