package ir.mapsa.RMISample.serverSide;

public class ServerDemo {
    public static void main(String[] args) {
        System.out.println("Server Launched....");
        try {
            MyServer myServer = new MyServer();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
