package DeserializationUsingJsonPath;

import io.restassured.path.json.JsonPath;

public class DeserializationUsingJsonPath {
	
	public static void main(String[] args) {
		
		String jsonObject = "[{\r\n" + 
				"  \"id\": 1,\r\n" + 
				"  \"first_name\": \"Lothaire\",\r\n" + 
				"  \"last_name\": \"Benazet\",\r\n" + 
				"  \"email\": \"lbenazet0@tinyurl.com\",\r\n" + 
				"  \"gender\": \"Male\"\r\n" + 
				"}, {\r\n" + 
				"  \"id\": 2,\r\n" + 
				"  \"first_name\": \"Shellie\",\r\n" + 
				"  \"last_name\": \"Cowser\",\r\n" + 
				"  \"email\": \"scowser1@163.com\",\r\n" + 
				"  \"gender\": \"Female\"\r\n" + 
				"}]";
		
		JsonPath jsonPath = JsonPath.from(jsonObject);
		
		Employee employee = jsonPath.getObject("[1]", Employee.class);
		System.out.println("Id is         : "+employee.getId());
		System.out.println("First name is : "+employee.getFirst_name());
		System.out.println("Last name is  : "+employee.getLast_name());
		System.out.println("Email id is   : "+employee.getEmail());
		System.out.println("Gender is     : "+employee.getGender());
		
		

	}

}
