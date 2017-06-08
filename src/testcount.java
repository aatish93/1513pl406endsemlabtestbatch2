import static org.junit.Assert.*;

import org.junit.Test;

public class testcount {

	@Test
	public void test() {
		Vote[] clist=new Vote[3];
		clist[0]=new Vote("BJP");
		clist[1]=new Vote("Cong");
		clist[2]=new Vote("AAP");
		BallotingUnit b1=new BallotingUnit();
		b1.setButton(clist);
		
		ControllUnit c1=new ControllUnit();
		DataCable d1=new DataCable(b1,c1);
		
		Evm[] evmlist=new Evm[2];
		evmlist[0]=new Evm(b1,c1,d1);
		Constituency panjim=new Constituency(evmlist);
		
		assertEquals(0,evmlist[0].c.getcount(0));
		assertEquals(0,evmlist[0].c.getcount(1));
		assertEquals(0,evmlist[0].c.getcount(2));
	}

}
