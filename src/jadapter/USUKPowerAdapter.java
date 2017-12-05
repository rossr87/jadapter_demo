package jadapter;

public class USUKPowerAdapter implements UKPowerable {
	
	USSocket myUsSocket;
	
	USUKPowerAdapter(USSocket myUsSocket) {
		this.myUsSocket = myUsSocket;
	}
	
	public int get240Volts() {
		return myUsSocket.get120Volts() * 2;
	}
	
	public int get50AC() {
		return myUsSocket.get60AC() - 10;
	}
}
