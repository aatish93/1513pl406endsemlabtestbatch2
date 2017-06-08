
public class Constituency {
	Evm[] evm = new Evm[10];

	public Constituency(Evm[] evm) {
		this.evm = evm;
	}
	
	public void ttlvotecount(){
		int[] res={0,0,0};
		int i,j,k;
		for(i=0;i<evm.length;i++){
			for(j=0;j<evm[i].b.button.length;j++){
				res[j]=res[j]+evm[i].c.getcount(i);
				System.out.print(evm[i].b.button[j].name);
				System.out.println(res[j]);
			}
			
		}
		
	}
}
