
public class Evm {
	BallotingUnit b=new BallotingUnit();
	ControllUnit c=new ControllUnit();
	DataCable d=new DataCable(b,c);
	public Evm(BallotingUnit b, ControllUnit c, DataCable d) {
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public void votenow(int i){
		c.voteprocess(i);
	}
}
