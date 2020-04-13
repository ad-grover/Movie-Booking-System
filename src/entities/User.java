package entities;

import java.util.UUID;

public class User {

	public String userId;
	public String userName;
	public int userAge;
	
	public User(String userName, int userAge) {
		super();
		this.userId = UUID.randomUUID().toString();
		this.userName = userName;
		this.userAge = userAge;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	
	
}
