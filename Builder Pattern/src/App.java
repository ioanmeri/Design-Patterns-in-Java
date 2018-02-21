
public class App {
	
	public static void main(String args[]) {
		//User websiteUser = new User.Builder("bobMax", "bobMax@gmail.com").build();
		//I can also pass the firstName
		
		//User websiteUser = new User.Builder("bobMax", "bobMax@gmail.com").firstName("bob").lastName("Max").build();
	
		User websiteUser = new User.Builder("bobMax","bobMax@gmail.com")
				.firstName("bob")
				.lastName("Max")
				.phoneNumber(1234567)
				//.address("Some Place 1111")
				.build();
		
		System.out.println(websiteUser);
	}

}
