/***********************
*         Fan          *
* ---------------------*
* +SLOW: int           *
* ----------           *
* +MEDIUM: int         *
* ------------         *
* +FAST: int           *
* ----------           *
* -speed: int          *
* -on: boolean         *
* -radius: double      *
* +color: String       *
* +Fan()               *
* +setSpeed(int)       *
* +turnOn()            *
* +turnOff()           *
* +setRadius(double):  *
* +setColor(String):   *
* +getSpeed(): String  *
* +isOn(): boolean     *
* +getRadius(): double *
* +getColor(): String  *
* +toString(): String  *
***********************/

public class Fan {

	final int slow = 1;
	final int medium = 2;
	final int fast = 3;
	 
	private int speed = slow;
	private boolean on = false;
	private double radius = 5;
	private String color = "Blue";
	
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void setOn(boolean on) {
		this.on=on;
	}
	public boolean getOn() {
		return on;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	
	Fan() {
		speed = slow;
		on = false;
		radius = 5;
		color = "Blue";
	}
	public String toString() {
		if(on == true) {
			return speed+"\n"+color+"\n"+radius+"\nFan is On";
		} else {
			return color+"\n"+radius+"\nFan is Off";
		}
	}
}