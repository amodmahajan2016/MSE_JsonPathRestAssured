package JsonPathForJsonObject;

import io.restassured.path.json.JsonPath;

public class SimpleJsonObject {
	
	public static void main(String[] args) {
		
		String jsonString = "{\r\n" + 
				"  \"firstName\": \"Amod\",\r\n" + 
				"  \"lastName\": \"Mahajan\"\r\n" + 
				"}";
		
		//Get JsonPath instance of above JSON string
		JsonPath jsonPath = JsonPath.from(jsonString);
		
		// Since firstName holds a string value use getString() method and provide json path of firstName
		String firstName = jsonPath.getString("firstName");
		String lastName = jsonPath.getString("lastName");
		
		System.out.println("First name is : "+firstName);
		System.out.println("Last name is : "+lastName);
		
		// Since $ is root node of a JSON, we can get whole JSON string using $ as JSON path
		System.out.println(jsonPath.getString("$"));
		// There are two other ways to do the same thing as above
		System.out.println(jsonPath.getString(""));
		System.out.println(jsonPath.get());
		
	}

}
