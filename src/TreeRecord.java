
public class TreeRecord {
	int id;
	String data;
	TreeRecord left, right;
	public TreeRecord(int k, String d){
		id = k;
		data = d;
	}
	public void printData(){
		System.out.println(id + " contains " + data);
	}
}
