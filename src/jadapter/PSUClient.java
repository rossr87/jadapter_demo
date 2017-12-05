package jadapter;


/*
 * Client
 * 
 * Uses The UKPowerable Interface
 */

public class PSUClient {
	private int voltage;
	private int current;
	private UKPowerable plug;
	
	/*
	 * Sometimes we get a ukplug, sometimes we get a us to uk adapter.
	 */
	
	public void setSocket(UKPowerable plug) {
		this.plug = plug;
	}
	
	/*
	 * Calls the target interface / interface that would be implemented by
	 * all UKPowerAdapters
	 */
	
	private void setVoltage() {
		this.voltage = plug.get240Volts();
	}
	
	private void setCurrent() {
		this.current = plug.get50AC();
	}
	
	public int getVoltage() {
		return this.voltage;
	}
	
	public int getCurrent() {
		return this.current;
	}
	
	public void switchOn() {
		setVoltage();
		setCurrent();
	}
}
