package Dir1;
import java.util.*;
import java.io.*;

public class CreateFilDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public void mkf(){
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
		  public void mkdir(){
			    boolean folder = new File("\\Users\\KarlfromAllState\\eclipse-workspace\\439Proj\\Dir1").mkdirs();
			  }

}
