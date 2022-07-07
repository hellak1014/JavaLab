package Day6_10;

public class Car {

	String color;
	String gearType;
	int door;
	
	Car() {
		this("White", "auto", 4);
	}
	
	Car(String color) {
		this(color, "auto", 4);
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
}