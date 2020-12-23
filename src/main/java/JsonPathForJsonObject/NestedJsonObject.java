package JsonPathForJsonObject;

import io.restassured.path.json.JsonPath;

public class NestedJsonObject {
	
	public static void main(String[] args) {
		
		String jsonString = "{\r\n" + 
				"  \"firstName\": \"Amod\",\r\n" + 
				"  \"lastName\": \"Mahajan\",\r\n" + 
				"  \"address\": {\r\n" + 
				"    \"houseNo\": 404,\r\n" + 
				"    \"buildingName\": \"Not Found\",\r\n" + 
				"    \"streetName\": \"Gumnam gali\",\r\n" + 
				"    \"city\": \"Bengaluru\",\r\n" + 
				"    \"state\": \"Karnataka\",\r\n" + 
				"    \"country\": \"India\"\r\n" + 
				"  },\r\n" + 
				"  \"skills\": {\r\n" + 
				"    \"language\": {\r\n" + 
				"      \"name\": \"Java\",\r\n" + 
				"      \"proficiency\": \"Medium\"\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}";
		
		//Get JsonPath instance of above JSON string
		JsonPath jsonPath = JsonPath.from(jsonString);
		
		// Since houseNo holds an int value use getInt() method and provide json path of houseNo
		int houseNo = jsonPath.getInt("address.houseNo");
		System.out.println("House no is : "+houseNo);
		
		String name = jsonPath.getString("skills.language.name");
		System.out.println("Name is : "+name);
		
	}

}
