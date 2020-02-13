public class Car {
    public int wheels;
    private int doors;
    private String model;

    // Constructors
    public Car() {
        this(4,4,"Stinger"); // **MUST be 1st statement
        System.out.println("Empty constructor called.");
    }

    public Car(int wheels, int doors, String model) {
        this.wheels = wheels;
        this.doors = doors;
        this.model = model;
    }

    public int getDoors() {
        return this.doors;
    }

}
