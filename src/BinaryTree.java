
public class BinaryTree {
	private TreeRecord treeRoot;	
	public BinaryTree(){
			treeRoot = null;
	}
	public void insertRecord(int value, String data){
		System.out.println("getting... " + value+"----" + data);
		treeRoot = addRecord(treeRoot, value, data);
		
	}
	private TreeRecord addRecord(TreeRecord rec, int value, String data){
		if(rec == null){
			System.out.println(value + "added as root");
			return new TreeRecord(value, data);
		}
		else if(value<rec.id){
			System.out.println(value + "added to left");
			rec.left = addRecord(rec.left, value, data);
		}
		else{
			System.out.println(value + "added to right");
			rec.right = addRecord(rec.right, value, data);
		}
		return rec;
	}
	
	private TreeRecord searchTreeFor(TreeRecord rec, int value){
		if(rec == null){
			return null;
		}
		else if(rec.id == value){
			return rec;
		}
		else if(rec.id < value){
			return searchTreeFor(rec.right, value);
		}
		else{
			return searchTreeFor(rec.left, value);
		}
	}
	
	public TreeRecord findRecord(int value){
		return searchTreeFor(treeRoot, value);
	}
	
	private void doPreorder(TreeRecord rec){
		if(rec==null){
			return;
		}else{
			rec.printData();
			doPreorder(rec.left);
			doPreorder(rec.right);
		}
	}
	public void preorder(){
		doPreorder(treeRoot);
	}
	
	
}
