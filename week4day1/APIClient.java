package week4day1;

public class APIClient {
	// Method named sendrequest with single string arugument pass
	public void sendRequest(String endpoint) {
		System.out.println("Sending request to end point" + endpoint);
	}

	// Creating same method name with different aruguments passing
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Sending request to end point" + endpoint);
		System.out.println("Sending request to requestbody" + requestBody);
		if (requestStatus) {
			System.out.println("Request success");

		} else {
			System.out.println("Request failed");
		}
	}

	public static void main(String[] args) {
		// Creating object to call the same method with different arguments is called
		// method overloading
		APIClient client = new APIClient();
		client.sendRequest("Sendrequest");
		client.sendRequest("My request", "{ \"key\": \"value\" }", true);

	}
}