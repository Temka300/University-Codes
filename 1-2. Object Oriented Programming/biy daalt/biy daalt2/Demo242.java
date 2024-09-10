class Demo242 {
    public static void main(String[] args) {
        Person242 person = new Person242();
        person.display();
        System.out.println();
        
        Sportsman242 sportsman = new Sportsman242();
        sportsman.display();
        System.out.println();
        
        sportsman.changeField(75.5);
        sportsman.changeField(28);
        sportsman.displayAgeAndClub();
        System.out.println();
        
        TennisPlayer242 tennisPlayer = new TennisPlayer242();
        tennisPlayer.display();
        System.out.println();
        
        tennisPlayer.changeField("Tennis", "ABC Club");
        tennisPlayer.changeField(68.2);
        tennisPlayer.changeField(25);
        tennisPlayer.displayAgeAndClub();
        System.out.println();
        
        Teacher242 teacher1 = new Teacher242("John", 35);
        Teacher242 teacher2 = new Teacher242("Jane", 40, "Assistant Teacher");
        teacher1.determineSalary();
        teacher2.determineSalary();
        
        teacher1.changeField(36);
        
        teacher1.display();
        System.out.println();
        teacher2.display();
    }
}