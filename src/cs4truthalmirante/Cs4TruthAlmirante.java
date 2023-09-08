/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4truthalmirante;

/**
 *
 * @author TRUTH
 */
public class Cs4TruthAlmirante {
    
    public static void main(String[] args) {
          String name1 = "Rever";
    String status1 = "Prince";
    int age1 = 18;
    
    String name2 = "Sevik";
    String status2 = "Scholar";
    int age2 = 26;
    
    String name3 = "Alocer";
    String status3 = "Reaper";
    int age3 = 20;

     System.out.println("Character 1" + "\n Name: " + name1 + "\n Status: "+ status1 + "\n Age: " + age1 + "\n");

    System.out.println("Character 2" + "\n Name: " + name2 + "\n Status: "+ status2 + "\n Age: " + age2 + "\n");

    System.out.println("Character 3" + "\n Name: " + name3 + "\n Status: "+ status3 + "\n Age: " + age3 + "\n");

    System.out.println("\n Sevik is older than Rever: " + (age2 > age1));

    System.out.println("\n Sevik and Alocer share the same status: " + (status2 == status3));

    System.out.println("\n How many years older than Rever is Alocer? " + (age3 - age1) + " years older.");

    }
}
