class Mazda extends Car {
    
    public Mazda(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void brake() {
        System.out.println("Mazda is braking.");
    }
}