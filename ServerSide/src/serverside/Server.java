/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/
package serverside;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Server {

    
    public static void main(String[] args) {
        try{
            System.out.println("waiting");
        Registry r = LocateRegistry.createRegistry(1200);
        Calculator calc= new Calculator();
        r.rebind("calc", calc);

}catch(RemoteException e){
    
}
    }
    
}
