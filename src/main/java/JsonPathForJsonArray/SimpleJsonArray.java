package JsonPathForJsonArray;

import java.util.List;
import java.util.Map;

import io.restassured.path.json.JsonPath;

public class SimpleJsonArray {

	public static void main(String[] args) {
		
		String jsonArrayString = "{\r\n" + 
				"  \"firstName\": \"Amod\",\r\n" + 
				"  \"lastName\": \"Mahajan\",\r\n" + 
				"  \"address\": [\r\n" + 
				"    {\r\n" + 
				"      \"type\": \"permanent\",\r\n" + 
				"      \"city\": \"Bengaluru\",\r\n" + 
				"      \"state\": \"KA\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"type\": \"temp\",\r\n" + 
				"      \"city\": \"Bhopal\",\r\n" + 
				"      \"state\": \"MP\"\r\n" + 
				"    }\r\n" + 
				"  ]\r\n" + 
				"}";
		
		
		
		//Get JsonPath instance of above JSON string
		JsonPath jsonPath = JsonPath.from(jsonArrayString);
		
		// Since address holds a JSON array we can get particular indexed element using index
		String addressType1 = jsonPath.getString("address[0].type");
		System.out.println("Address type is : "+addressType1);
		
		String addressType2 = jsonPath.getString("address[1].type");
		System.out.println("Another address type is : "+addressType2);
		
		// We can get address types as a list as well
		List<String> allAddressTypes = jsonPath.getList("address.type");
		System.out.println(allAddressTypes);
		
		// We can get complete address array as List
		// Since it holds Json objects which can be a Map
		List<Map<String,Object>> allAddress = jsonPath.getList("address");
		for(Map<String,Object> address : allAddress)
		{
			System.out.println(address);
		}
	}
}
