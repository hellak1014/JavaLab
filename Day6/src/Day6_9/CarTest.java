package Day6_9;

public class CarTest {
	public static void main(String[] args) {
		
		Car c1 = new Car(); //생성자
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white", "auto", 4); //생성자
		
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door=" + c2.door);
		
	}
}
