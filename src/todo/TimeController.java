package todo;


import se.lth.cs.realtime.*;
import done.AbstractWashingMachine;


public class TimeController extends PeriodicThread {
	// TODO: add suitable attributes

	public TimeController(AbstractWashingMachine mach, double speed) {
		super((long) (1000/speed)); // TODO: replace with suitable period
	}

	public void perform() {
		// TODO: implement this method
	}
}
