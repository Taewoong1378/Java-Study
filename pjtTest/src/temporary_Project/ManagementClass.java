package temporary_Project;

public class ManagementClass {

	private String name;
	private int score;
	
	public ManagementClass(String n, int s) {
		System.out.println("Management Program Start!!!");
		this.name = n;
		this.score = s;
	}
	
	public void Info() {
		System.out.println("Name : " + name);
		System.out.println("Score : " + score);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if (score < 50) {
			System.out.println("Cannot revise it");
		} else {
			this.score = score;
		}

	}
	
	
}
