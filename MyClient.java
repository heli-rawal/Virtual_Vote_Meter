import java.rmi.*;
import java.util.*;
public class MyClient{
	public static void main(String args[]){
		VoteInterface vote;
		try {
			int port = 16790;
			String host = "localhost";
			String registryURL = "rmi://" + host + ":" + port + "/vote";
			vote = (VoteInterface) Naming.lookup(registryURL);
			MyClient cli = new MyClient();
			cli.action(vote);
		} catch (Exception e) {}
	}
	public void action(VoteInterface project3) {
		Scanner sc = new Scanner(System.in);
			System.out.println("What is your vote?[yes|no] : ");
			String action = sc.nextLine();
			try {
				switch (action.toLowerCase()) {
				case "yes":
					System.out.println( project3.castVote('Y'));
					break;
				case "no":
					System.out.println( project3.castVote('N'));
					break;
				}
			} catch (RemoteException rex) {}
		sc.close();
	}
}
