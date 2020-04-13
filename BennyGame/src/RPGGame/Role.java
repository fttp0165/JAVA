package RPGGame;

public class Role {
	
	private  String name;
	private  int Maxblood;
	private  int level;
	private  char gender; //M F
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setMaxblood(int Maxblood) {
		this.Maxblood=Maxblood;
	}
	public int getMaxblood() {
		return Maxblood;
	}
	
	public void setLevel(int level) {
		this.level=level;
	}
	public int getLevel() {
		return level;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public int getGender() {
		return gender;
	}
	
	

}
