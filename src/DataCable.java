
public class DataCable {

	BallotingUnit b=new BallotingUnit();
	ControllUnit c=new ControllUnit();
	public DataCable(BallotingUnit b2, ControllUnit c2) {
		// TODO Auto-generated constructor stub
		this.b=b2;
		this.c=c2;
		this.c.setD(this);
	}

	public void setC(ControllUnit c) {
		this.c = c;
	}
}
