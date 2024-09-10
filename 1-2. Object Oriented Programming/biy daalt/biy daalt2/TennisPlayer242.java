class TennisPlayer242 extends Sportsman242 {
    private String clubName;
    private String degreeOfSportsmanship;
    
    void display() {
        super.display();
        System.out.println("Club Name: " + clubName);
        System.out.println("Degree of Sportsmanship: " + degreeOfSportsmanship);
    }
    
    void changeField(String newSportName, String newClubName) {
        sportName = newSportName;
        clubName = newClubName;
    }
    
    void displayAgeAndClub() {
        System.out.println("Age: " + getAge());
        System.out.println("Sport Name: " + sportName);
        System.out.println("Club Name: " + clubName);
    }
}
