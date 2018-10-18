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
          String[] stringArr = new String[5];
          
          // Take input line-by-line and store it in arr[]
          stringArr[0] = scan.nextLine();
          stringArr[1] = scan.nextLine();
          stringArr[2] = scan.nextLine();
          stringArr[3] = scan.nextLine();
          stringArr[4] = scan.nextLine();
          
          out.printf("%s %s %s %s %s", stringArr[0], stringArr[1], stringArr[2], stringArr[3], stringArr[4]);
          
          
          
          
          
     }
     
}
