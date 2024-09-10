class BiyDaalt21 {
    public static void main(String[] args) {
        Person[] persons = new Person[4];

        persons[0] = new Person("John", 35);
        persons[1] = new Sportsman("Mike", 28, 80.5, 180.0);
        persons[2] = new TennisPlayer("Anna", 24, 60.2, 165.0, "XYZ Tennis Club", "Professional");
        persons[3] = new Teacher("Sarah", 40, "Mathematics", 50000.0);

        for (Person person : persons) {
            person.display();
            System.out.println();
        }
    }
}