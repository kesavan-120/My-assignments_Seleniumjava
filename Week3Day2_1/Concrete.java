package Week3Day2_1;
//By using the implements keyword, we can implement the unimplemented methods from the interface in the concrete class.
public class Concrete implements DatabseConnection {

	public void connect() {
	System.out.println("Connect the database");
		
	}

	public void disconnect() {
		System.out.println("Disconnect the database");
		
	}

	public void executeUpdate() {
		System.out.println("Execute has been updated");
		
	}
	public static void main(String[] args) {
		//We create an object of the concrete class so that we can call and use the implemented methods
		Concrete cc= new Concrete();
		cc.connect();
		cc.disconnect();
		cc.executeUpdate();
		
		
			
		
		
		
	}
	}


