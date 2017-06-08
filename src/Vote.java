
public class Vote {
	String name;
	int count;
	public String getName() {
		return name;
	}

	public Vote(String name) {
		this.name = name;
		this.count=0;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setVote(int count) {
		this.count = count;
	}
	
}
