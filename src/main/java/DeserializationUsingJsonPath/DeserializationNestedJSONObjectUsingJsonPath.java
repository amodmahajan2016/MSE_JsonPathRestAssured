package DeserializationUsingJsonPath;

import io.restassured.path.json.JsonPath;

public class DeserializationNestedJSONObjectUsingJsonPath {
	
	public static void main(String[] args) {
		
		String jsonObject = "{\r\n" + 
				"  \"id\": 1,\r\n" + 
				"  \"first_name\": \"Lothaire\",\r\n" + 
				"  \"last_name\": \"Benazet\",\r\n" + 
				"  \"email\": \"lbenazet0@tinyurl.com\",\r\n" + 
				"  \"gender\": \"Male\"\r\n" + 
				"}";
		
		JsonPath jsonPath = JsonPath.from(jsonObject);
		
		Employee employee = jsonPath.getObject("", Employee.class);
		System.out.println("Id is         : "+employee.getId());
		System.out.println("First name is : "+employee.getFirst_name());
		System.out.println("Last name is  : "+employee.getLast_name());
		System.out.println("Email id is   : "+employee.getEmail());
		System.out.println("Gender is     : "+employee.getGender());
		
		// Another way
		Employee employee1 = jsonPath.getObject("$", Employee.class);
		System.out.println("Id is         : "+employee1.getId());
		System.out.println("First name is : "+employee1.getFirst_name());
		System.out.println("Last name is  : "+employee1.getLast_name());
		System.out.println("Email id is   : "+employee1.getEmail());
		System.out.println("Gender is     : "+employee1.getGender());

	}

}
