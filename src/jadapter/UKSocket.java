package jadapter;

public class UKSocket implements UKPowerable {
	private static final int UK_VOLTAGE = 240;
	private static final int UK_AC = 60;
		
	public int get240Volts() {
		return UK_VOLTAGE;
	}
	
	public int get50AC() {
		return UK_AC;
	}
}
