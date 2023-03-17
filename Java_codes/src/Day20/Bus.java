package Day20;

public class Bus {
	private int seat;
	private int wheel;

	

	public Bus(int seat, int wheel) {
	
		this.seat = seat;
		this.wheel = wheel;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	@Override
	public String toString() {
		return "Bus [seat=" + seat + ", wheel=" + wheel + "]";
	}
	

}