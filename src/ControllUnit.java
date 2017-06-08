
public class ControllUnit {
	DataCable d;
	public void setD(DataCable b2) {
		// TODO Auto-generated constructor stub
		this.d=b2;
	}
	public void voteprocess(int i){
		d.b.button[i].count++;
	}
	public int getcount(int i){
		return d.b.button[i].count;
	}
	public void reset(){
		for(int i=0;i<d.b.button.length;i++){
			d.b.button[i].count=0;
		}
	}
}
