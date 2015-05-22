// pig latin source code

import java.io.*;
import java.util.Scanner;

public class PigLin {
  public static void main(String args[]){
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter a word to translate to Pig Latin:");
    System.out.println(pY(keyboard.next()));
  }
  
  public static String pY(String pY){ 
    String result = " ";
      if(pY.charAt(0) == 'a' ||
         pY.charAt(0) == 'e' || 
         pY.charAt(0) == 'i' ||
         pY.charAt(0) == 'o' ||
         pY.charAt(0) == 'u'){
        System.out.print(pY + "way ");
      } else if(pY.charAt(1) == 'a' ||
         pY.charAt(1) == 'e' || 
         pY.charAt(1) == 'i' ||
         pY.charAt(1) == 'o' ||
         pY.charAt(1) == 'u'){
        System.out.print(pY.substring(1) + pY.substring(0,1) + "ay ");
       }else if(pY.charAt(2) == 'a' ||
         pY.charAt(2) == 'e' || 
         pY.charAt(2) == 'i' ||
         pY.charAt(2) == 'o' ||
         pY.charAt(2) == 'u'){
        System.out.print(pY.substring(2) + pY.substring(0,2) + "ay ");
        }else if(pY.charAt(3) == 'a' ||
         pY.charAt(3) == 'e' || 
         pY.charAt(3) == 'i' ||
         pY.charAt(3) == 'o' ||
         pY.charAt(3) == 'u'){
        System.out.print(pY.substring(3) + pY.substring(0,3) + "ay ");
        }else if(pY.charAt(4) == 'a' ||
         pY.charAt(4) == 'e' || 
         pY.charAt(4) == 'i' ||
         pY.charAt(4) == 'o' ||
         pY.charAt(4) == 'u'){
        System.out.print(pY.substring(4) + pY.substring(0,4) + "ay ");
        }
        return result;
    }
  }
