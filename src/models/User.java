package models;

public class User{
    // creation of instance variable
    private String username;
    private String password;



    // creation of public getter and setter --> for username
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
    // creation of public getter and setter --> for passsword
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


    // creation of public constructor
    public User( String username, String password){
        this.username = username;
        this.password = password;

    }}