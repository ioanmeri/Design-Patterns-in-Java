
public class User {
	
	private String userName; //Required
	private String emailAddreess; //Required
	
	private String firstName; //Optional
	private String lastName; //Optional
	private int phoneNumber; //Optional
	private String address; //Optional
	
	
	//private constructor, Can't be called from them App
	private User(Builder builder) {
		this.userName = builder.userName;
		this.emailAddreess = builder.emailAddreess;
		this.firstName = builder.firstName;
		this.lastName= builder.lastName;
		this.phoneNumber = builder.phoneNumber;
		this.address = builder.address;
	}
	
	
	
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", emailAddreess=" + emailAddreess + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
	
	
	public static class Builder{
		
		private String userName; //Required
		private String emailAddreess; //Required
		
		private String firstName; //Optional
		private String lastName; //Optional
		private int phoneNumber; //Optional
		private String address; //Optional
		
		public Builder(String userName, String email) {
			this.userName = userName;
			this.emailAddreess = email;
		}
		
		public Builder firstName(String value) {
			this.firstName = value;
			//returns an instance of Builder
			return this;
		}
		
		public Builder lastName(String value) {
			this.lastName = value;
			return this;
		}
		
		public Builder phoneNumber(int value) {
			this.phoneNumber = value;
			return this;
		}
		
		public Builder address(String value) {
			this.address = value;
			return this;
		}
		
		//return the Builder
		public User build() {
			return new User(this);
		}
		
	}
	

}
