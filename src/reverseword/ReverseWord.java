/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverseword;

/**
 *
 * @author vasam
 */
import java.util.*;
public class ReverseWord {

    
    public static void main(String[] args) {
        System.out.println("pull");
        System.out.println("fetch and merge");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scan.next();
        System.out.println(name);
        char[] reverse = new char[name.length()];
        for (int i = 0; i<name.length(); i++) {
            reverse[i] = name.charAt(i);
        }
        for (int i = reverse.length-1;i>=0;i--){
            System.out.println(reverse[i]);
        }
        
    }
    
}
