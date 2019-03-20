package pro3;

import java.util.List;

//Bean Class
public class Person {

	private String name;
	private String email;
	private String password;
	private String age;
	private String bio;
	private String job;
	private List<String> interest;
	
	public Person() {
		super();
	}

	public Person(String name ,String email ,String password ,String age ,String bio ,String job ,List<String> interest)
	{
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.bio = bio;
		this.password = password;
		this.job = job;
		this.interest = interest;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getBio() {
		return bio;
	}
	
	public void setBio(String bio) {
		this.bio = bio;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public List<String> getInterest() {
		return interest;
	}
	
	public void setInterest(List<String> interest) {
		this.interest = interest;
	}
}

