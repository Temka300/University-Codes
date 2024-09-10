class TennisPlayer extends Sportsman {
    private String clubName;
    private String sportsmanshipDegree;

    public TennisPlayer(String name, int age, double bodyWeight, double height, String clubName, String sportsmanshipDegree) {
        super(name, age, bodyWeight, height);
        this.clubName = clubName;
        this.sportsmanshipDegree = sportsmanshipDegree;
    }

    public void display() {
        super.display();
        System.out.println("Club Name: " + clubName);
        System.out.println("Sportsmanship Degree: " + sportsmanshipDegree);
    }
}