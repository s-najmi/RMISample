package ir.mapsa.RMISample.clientSide;
import ir.mapsa.RMISample.common.RMIInterface;

import java.rmi.Naming;

public class ClientDemo {
    public static void main(String[] args) {
        try {
            RMIInterface rmi = (RMIInterface) Naming.lookup("//localhost/server");
            System.out.println(rmi.sayHello("soheila", "najmi"));
            System.out.println(rmi.sayBye("soheila", "najmi"));
            //----------
            System.out.println(rmi.getByID(5));
            System.out.println(rmi.getAll());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}