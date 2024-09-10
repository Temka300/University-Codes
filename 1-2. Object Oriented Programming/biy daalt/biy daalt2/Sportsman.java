class Sportsman extends Person {
    private double bodyWeight;
    private double height;

    public Sportsman(String name, int age, double bodyWeight, double height) {
        super(name, age);
        this.bodyWeight = bodyWeight;
        this.height = height;
    }

    public void display() {
        super.display();
        System.out.println("Body Weight: " + bodyWeight);
        System.out.println("Height: " + height);
    }
}
