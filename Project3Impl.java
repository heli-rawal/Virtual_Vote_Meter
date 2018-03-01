import java.rmi.*;
import java.rmi.server.*;

public class Project3Impl extends UnicastRemoteObject implements ProjectInterface {
 


public Project3Impl() throws RemoteException {
    super( );
  }
  


public int add(int a, int b) throws RemoteException {
       int c3= a + b;
       return c3;
}


public int subtract(int a, int b) throws RemoteException {
	int c1= a - b;
	return c1;
}


public int multiply(int a, int b) throws RemoteException {
	int c2= a * b;

	return c2;
}


public int divide(int a, int b) throws RemoteException {
		int c = 0;
		if(b!=0)
		 c = a/b;
		 return c;
		}


public int gcd(int a, int b) throws RemoteException {
	 while(a!=0 && b!=0) 	  {
	     int t = b;
	     b = a%b;
	     a = t;
	  }
	 int c4= a+b;
	  return c4; 
	}



public int lcm(int a, int b) throws RemoteException {
	int c5= a*b / gcd(a,b);
	return c5;
}  
}