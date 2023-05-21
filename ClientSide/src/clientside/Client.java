/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientside;
import java.rmi.Naming;
import java.util.Scanner;
import operation.Operation;

/**
 *
 * @author 666Omar
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              // Scanner sc= new Scanner(System.in);
        try{
         Operation p= (Operation)Naming.lookup("rmi://192.168.1.8:1200/calc");
       //  int x=sc.nextInt();
       // int y=sc.nextInt();
        int result= p.sum(3, 3);
            System.out.println("result= "+result);
        }catch(Exception e){
            e.printStackTrace();
            
        }
        
    }
    
}











