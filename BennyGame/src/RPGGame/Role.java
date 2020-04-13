package RPGGame;

public class Role {
	
	private  String name;  // set role's name
	private  int Maxblood; // role's life 
	private  int level;    //default 1
	private  char gender;  //M F 
	
	
	public void setName(String name) {
		this.name = name;
	}
	// get the role name
	public String getName() {
		return name;
	}
	//set max blood ; use on first create role or level up
	public void setMaxblood(int Maxblood) {
		this.Maxblood=Maxblood;
	}
	//get current max blood
	public int getMaxblood() {
		return Maxblood;
	}
	//set level; use on first create role or level up
	public void setLevel(int level) {
		this.level=level;
	}
	//get current level
	public int getLevel() {
		return level;
	}
	//set sex
	public void setGender(char gender) {
		this.gender=gender;
	}
	//get current sex
	public int getGender() {
		return gender;
	}
	
	

}
