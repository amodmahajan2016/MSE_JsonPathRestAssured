package JsonPathForJsonArray;

import java.util.List;
import java.util.Map;

import io.restassured.path.json.JsonPath;

public class NestedJsonArray {

	public static void main(String[] args) {
		
		String jsonArrayString = "{\r\n" + 
				"  \"firstName\": \"Amod\",\r\n" + 
				"  \"lastName\": \"Mahajan\",\r\n" + 
				"  \"address\": [\r\n" + 
				"    [\r\n" + 
				"      {\r\n" + 
				"        \"type\": \"permanent\",\r\n" + 
				"        \"city\": \"Bengaluru\",\r\n" + 
				"        \"state\": \"KA\"\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"type\": \"temp\",\r\n" + 
				"        \"city\": \"Bhopal\",\r\n" + 
				"        \"state\": \"MP\"\r\n" + 
				"      }\r\n" + 
				"    ],\r\n" + 
				"    [\r\n" + 
				"      {\r\n" + 
				"        \"type\": \"communication\",\r\n" + 
				"        \"city\": \"Delhi\",\r\n" + 
				"        \"state\": \"DL\"\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"type\": \"old\",\r\n" + 
				"        \"city\": \"Kanpur\",\r\n" + 
				"        \"state\": \"UP\"\r\n" + 
				"      }\r\n" + 
				"    ]\r\n" + 
				"  ]\r\n" + 
				"}";
		
		
		
		//Get JsonPath instance of above JSON string
		JsonPath jsonPath = JsonPath.from(jsonArrayString);
		
		// Since address holds nested JSON arrays we can get particular indexed element using index
		// followed by another index
		String addressType1 = jsonPath.getString("address[0][0].type");
		System.out.println("Address type is : "+addressType1);
		
		String addressType2 = jsonPath.getString("address[0][1].type");
		System.out.println("Second address type is : "+addressType2);
		
		String addressType3 = jsonPath.getString("address[1][0].type");
		System.out.println("Third type is : "+addressType3);
		
		String addressType4 = jsonPath.getString("address[1][1].type");
		System.out.println("Fourth address type is : "+addressType4);
		
		// We can get address types from first array of address
		List<String> allAddressTypesOfFirstElementOfArray = jsonPath.getList("address[0].type");
		System.out.println(allAddressTypesOfFirstElementOfArray);
		
		// We can get address types from second array of address
		List<String> allAddressTypesOfSecondElementOfArray = jsonPath.getList("address[1].type");
		System.out.println(allAddressTypesOfSecondElementOfArray);
		
		// We can get address types from all elements of array of address
		List<String> allAddressTypes = jsonPath.getList("address.type");
		System.out.println(allAddressTypes);
		
	}
}
