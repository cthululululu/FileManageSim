import java.io.*;  // Import the File class
  // Import the IOException class to handle errors

public class CreateFile {
  /*public static void main(String[] args) {
    try {
      File myObj = new File("TESTFILE.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }*/
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
}