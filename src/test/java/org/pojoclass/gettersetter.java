package org.pojoclass;

public class gettersetter {
	private String username;
	private int id;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static void main(String[] args) {
		gettersetter a=new gettersetter();
		a.setId(45);
	a.setUsername("java");
	String string = a.getUsername();
	System.out.println(string);
	int i = a.getId();
	System.out.println(i);
	
	
	}
}
