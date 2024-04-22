package Dir1;
import java.util.*;
import java.io.*;

public class CreateFilDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public void mkfil(){
		    try {
		        File myObj = new File("TESTFILEE.txt");
		        if (myObj.createNewFile()) {
		          System.out.println("File created: " + myObj.getName());
		        } 
		      } catch (IOException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		      }
		    }
		  public void mkfilspec(){
			    try {  
			        File OBJ = new File("C:\\Users\\KarlfromAllState\\eclipse-workspace\\439Proj\\Dir1\\SpecificFile.txt");  
			        if (OBJ.createNewFile()) {  
			          System.out.println("File created: " + OBJ.getName());  
			          System.out.println("Absolute path: " + OBJ.getAbsolutePath());  
			        } else {  
			          System.out.println("File already exists.");  
			        }  
			      } catch (IOException e) {
			        System.out.println("An error occurred.");
			        e.printStackTrace();  
			      }  
			  }

}
