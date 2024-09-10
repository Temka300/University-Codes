class Person242 {
    private String name;
    private int age;
    
    Person242(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    void changeField(int newAge) {
        age = newAge;
    }
    
    int getAge() {
        return age;
    }
}