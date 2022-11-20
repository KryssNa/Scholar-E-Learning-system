package models;

public class Student{
    // creation of instance variable
    private int std_id;
    private String std_name;
    private int std_age;
    private String std_address;
    private int std_contacr;

    // creation of public getter and setter --> for student ID
	public int getStd_id() {
		return this.std_id;
	}

	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}

    // creation of public getter and setter --> for student Name
	public String getStd_name() {
		return this.std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

    // creation of public getter and setter --> for student Age
	public int getStd_age() {
		return this.std_age;
	}

	public void setStd_age(int std_age) {
		this.std_age = std_age;
	}

    // creation of public getter and setter --> for student Address
	public String getStd_address() {
		return this.std_address;
	}

	public void setStd_address(String std_address) {
		this.std_address = std_address;
	}

    // creation of public getter and setter --> for student Contact
	public int getStd_contacr() {
		return this.std_contacr;
	}

	public void setStd_contacr(int std_contacr) {
		this.std_contacr = std_contacr;
	}


    // creation of public constructor
    public Student(int std_id, String std_name, int std_age, String std_address, int std_contacr){
        this.std_id = std_id;
        this.std_name = std_name;
        this.std_age = std_age;
        this.std_address = std_address;
        this.std_contacr = std_contacr;
    }

   

}