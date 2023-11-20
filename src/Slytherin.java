class Slytherin extends HogwartsStudent{
    int cunning;
    int determination;
    int ambition;
    int resourcefulness;

    Slytherin(int cunning, int determination, int ambition, int resourcefulness, int magicPower, int transgressionDistance) {
        super(magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
    }

    void displayDescription() {
        System.out.println("Cunning: " + cunning + ", Determination: " + determination + ", Ambition: " + ambition + ", Resourcefulness: " + resourcefulness);
        super.displayDescription();
    }

    void compareSlytherinStudents(Slytherin student) {
        int totalScoreStudent1 = cunning + determination + ambition + resourcefulness ;
        int totalScoreStudent2 = student.cunning + student.determination + student.ambition + student.resourcefulness;

        if (totalScoreStudent1 > totalScoreStudent2) {
            System.out.println("This Slytherin student is better than the other one.");
        } else if (totalScoreStudent1 < totalScoreStudent2) {
            System.out.println("The other Slytherin student is better than this one.");
        } else {
            System.out.println("Both Slytherin students are equally skilled.");
        }
    }
}
