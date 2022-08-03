package ir.mapsa.RMISample.common;

import java.rmi.Remote;
import java.util.List;

public interface RMIInterface extends Remote {
    String sayHello(String name, String family) throws Exception;
    String sayBye(String name, String family) throws Exception;
    Student getByID(long id) throws Exception;
    List<Student> getAll() throws Exception;
}
