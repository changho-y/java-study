package test;

public class AddrDTO {
	private String n;
	private int age;
	private String gender;
	private String address;
	private String tel;
	private String mail;
	
	public AddrDTO(String n, int age, String gender, String address, String tel, String mail) {
		super();
		this.n = n;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.tel = tel;
		this.mail = mail;
	}
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
}
