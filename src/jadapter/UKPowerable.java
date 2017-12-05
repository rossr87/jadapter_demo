package jadapter;

/*
 * This is the Target in the adapter pattern.
 * 
 * Implemented by:
 * 
 * UKPowerSockets
 * 
 * Clients will be:
 * 
 * Power Supply Units. These will have a reference to an object that 
 * implement this interface.
 */

public interface UKPowerable {
	public int get240Volts();
	public int get50AC();
}