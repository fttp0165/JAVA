package BennyWeb;

import java.io.Serializable;
public class user  implements Serializable{
	private String name;
	private String pw;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getPw() {
		return pw;
	}
	public void setpw(String pw) {
		this.pw=pw;
	}

}
