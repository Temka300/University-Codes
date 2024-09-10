class Sportsman242 extends Person242 {
    protected String sportName;
    private double bodyWeight;
    private double height;
    
    void display() {
        super.display();
        System.out.println("Sport Name: " + sportName);
        System.out.println("Body Weight: " + bodyWeight);
        System.out.println("Height: " + height);
    }
    
    void changeField(double newBodyWeight) {
        bodyWeight = newBodyWeight;
    }
}