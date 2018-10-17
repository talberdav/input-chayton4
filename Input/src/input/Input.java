/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;

import java.io.File;
import java.io.IOException;
import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author rbowlen
 */
public class Input {

     /**
      * @param args the command line arguments
      * @throws java.io.IOException
      */
     public static void main(String[] args) throws IOException {
          Scanner scan = new Scanner(new File("stuff.txt"));
          
          // Create an Array
          String[] arr = new String[5];
          
          // Take input line-by-line and store it in arr[]
          arr[0] = scan.nextLine();
          arr[1] = scan.nextLine();
          arr[2] = scan.nextLine();
          arr[3] = scan.nextLine();
          arr[4] = scan.nextLine();
          
          out.printf("%s %s %s %s %s", arr[0], arr[1], arr[2], arr[3], arr[4]);
          
          
          
          
          
     }
     
}
