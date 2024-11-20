
package main;

import java.util.Scanner;

public class KoPapirOllo {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       
        System.out.print("egy egész számot kérek: ");
      
        int szam = sc.nextInt();
        
        System.out.println("A bekért szám duplája: " + szam*2);
        
        
        sc.nextLine();
        
       
        System.out.print("szöveges adatot kérek: ");
        
        String szoveg = sc.nextLine();
        
        System.out.println("A bekért szöveg: " + szoveg);
 
    }
    
}
