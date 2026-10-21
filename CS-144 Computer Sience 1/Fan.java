
public class Fan {
private boolean power;
private int speed;

//constructors
public Fan() {
power = false;
speed = 0;
}
public Fan(int speed) {
	this.speed = speed;
	power = false;
}

public boolean togglePower() {
	power = !power;
	return power;
}
public int increaseSpeed() {
	speed++;
	return speed;
}
public int decreaseSpeed() {
	speed--;
	return speed;
}
public int getSpeed() {
	return speed;
	}
}

