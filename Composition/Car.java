public class Car {

    // HAS-A relationship
    private Engine engine;

    // Constructor
    public Car() {
        engine = new Engine();
    }

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}
