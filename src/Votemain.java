
public class Votemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vote[] clist=new Vote[3];
		clist[0]=new Vote("BJP");
		clist[1]=new Vote("Cong");
		clist[2]=new Vote("AAP");
		BallotingUnit b1=new BallotingUnit();
		b1.setButton(clist);
		
		Vote[] clist2=new Vote[3];
		clist2[0]=new Vote("BJP");
		clist2[1]=new Vote("Cong");
		clist2[2]=new Vote("AAP");
		BallotingUnit b2=new BallotingUnit();
		b2.setButton(clist2);
		
		ControllUnit c1=new ControllUnit();
		DataCable d1=new DataCable(b1,c1);
		
		ControllUnit c2=new ControllUnit();
		DataCable d2=new DataCable(b2,c2);
		
		Evm[] evmlist=new Evm[2];
		evmlist[0]=new Evm(b1,c1,d1);
		evmlist[1]=new Evm(b2,c2,d2);
		Constituency panjim=new Constituency(evmlist);
		
		evmlist[0].votenow(1);
		evmlist[0].votenow(1);
		evmlist[0].votenow(1);
		panjim.ttlvotecount();
	}
}
