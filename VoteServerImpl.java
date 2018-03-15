import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class VoteServerImpl extends UnicastRemoteObject implements VoteInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int yesCount=0;
	int noCount=0;
	protected VoteServerImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String castVote(char vote) throws RemoteException {
		
		if(vote == 'Y'){
			yesCount++;
		}
		if(vote=='N'){
			noCount++;
		}
		
		return "Yes = "+yesCount+"; No = "+noCount;
	}

}