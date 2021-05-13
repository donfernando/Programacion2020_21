package ficheros;

import java.io.FileReader;
import java.util.Arrays;

public class Main_v2 {
  public static void main(String[] args) {

    // Creates an array of character
    char[] array = new char[100];
//    Arrays.fill(array, '-');
    int leidos;
    String fr;
    
    try {
      // Creates a reader using the FileReader
      FileReader input = new FileReader("input.txt");

      System.out.println("Data in the file: ");
      System.out.print("<<");
      //Lectura anticipada abreviada
      while((leidos=input.read(array))!=-1) {
          fr=new String(array,0,leidos);
          System.out.print(fr);
      }
      System.out.println(">>");

      // Closes the reader
      input.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}