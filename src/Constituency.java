
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
				for(k=0;k<evm.length;k++){
					res[j]=res[j]+evm[k].c.getcount(k);
				}
				System.out.print(evm[k].b.button[k].name);
				System.out.println(res[j]);
			}
			
		}
	}
}
