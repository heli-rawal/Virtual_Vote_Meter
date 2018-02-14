import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


public class MyServer {

	public static void main(String[] args) {
		try {
			VoteInterface vote = new VoteServerImpl();
			int port = 16790;
			String host = "localhost";
			LocateRegistry.createRegistry(port);
			String registryURL = "rmi://" + host + ":" + port + "/vote";
			Naming.rebind(registryURL, vote);
			System.out.println("Vote Server is ready.");
		} catch (Exception e) {
			System.out.println("Addition Server failed: " + e);
		}

	}

}
