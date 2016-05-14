import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JFileChooser;

public class MainCls {
	private static ArrayList<String> list = new ArrayList<String>();
	private static BinaryTree binaryTree;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getData();
		binaryTree = new BinaryTree();
		
			for(int i = 0;i<list.size();i++){
				String pom[] = list.get(i).split(" ");		
				binaryTree.insertRecord(Integer.parseInt(pom[0]), pom[1]);	
			}
			binaryTree.preorder();
		}
	
	private static void getData(){
		JFileChooser fc = new JFileChooser();
		File file = null;
		int returnVal = fc.showOpenDialog(null);
	    if (returnVal == JFileChooser.APPROVE_OPTION) {
	    	file = fc.getSelectedFile();
	    } else {
	    	System.exit(0);
	    }
	    try{
	    	String line;
	    	BufferedReader read = new BufferedReader(new FileReader(file));
	    	while((line=read.readLine())!= null){
	    		list.add(line);
	    	}
	    	read.close();
	    }catch(Exception e){
	    	System.out.println(e.toString());
	    }
	}

}
