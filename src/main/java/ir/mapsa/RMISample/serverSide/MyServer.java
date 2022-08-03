package ir.mapsa.RMISample.serverSide;

import ir.mapsa.RMISample.common.RMIInterface;
import ir.mapsa.RMISample.common.Student;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class MyServer extends UnicastRemoteObject implements RMIInterface {
    public MyServer() throws RemoteException {
        LocateRegistry.createRegistry(1099);
        LocateRegistry.getRegistry().rebind("server",this);
    }

    @Override
    public String sayHello(String name, String family) {
        System.out.println("Client is connected to sayHello...");
        return "Hello " + name + " " + family;
    }

    @Override
    public String sayBye(String name, String family) {
        System.out.println("Client is connected to sayBye...");
        return "Bye " + name + " " + family;
    }

    @Override
    public Student getByID(long id) {
        System.out.println("Client is connected to getByID...");
        return StudentController.getByID(id);
    }

    @Override
    public List<Student> getAll() {
        System.out.println("Client is connected to getAll...");
        return StudentController.getAll();
    }
}
