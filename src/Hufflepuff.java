public class Hufflepuff extends HogwartsStudent {
    private int diligence;
    private int loyalty;
    private int honesty;

    Hufflepuff(int diligence, int loyalty, int honesty, int magicPower, int transgressionDistance) {
        super(magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    void displayDescription() {
        System.out.println("Diligence: " + diligence + ", Loyalty: " + loyalty + ", Honesty: " + honesty);
        super.displayDescription();
    }

    void compareHufflepuffStudents(Hufflepuff student) {
        int totalScoreStudent1 = diligence + loyalty + honesty;
        int totalScoreStudent2 = student.diligence + student.loyalty + student.honesty;

        if (totalScoreStudent1 > totalScoreStudent2) {
            System.out.println("This Hufflepuff student is better than the other one.");
        } else if (totalScoreStudent1 < totalScoreStudent2) {
            System.out.println("The other Hufflepuff student is better than this one.");
        } else {
            System.out.println("Both Hufflepuff students are equally skilled.");
        }
    }
}
