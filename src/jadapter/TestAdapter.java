package jadapter;

public class TestAdapter {
	public static void main(String[] args) {
		
		PSUClient ukPsu = new PSUClient();			/* client */
		USSocket usSocket = new USSocket();			/* adaptee - our client can not use us! */
		
		//ukPsu.setSocket(usSocket);				/* we can not use it like this! */
		
		UKPowerable usToUkAdapater = new USUKPowerAdapter(usSocket);
		
		/*
		 * But since classes that implement the UKPowerable interface
		 * promise to provide us with uk power, we know this will work.
		 */
		ukPsu.setSocket(usToUkAdapater);
		
		ukPsu.switchOn();
		
		System.out.println("Voltage: " + ukPsu.getVoltage());
		System.out.println("Current: " + ukPsu.getCurrent());
	}
}
