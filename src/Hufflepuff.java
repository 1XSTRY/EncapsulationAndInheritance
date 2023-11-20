class Hufflepuff extends HogwartsStudent {
    int diligence;
    int loyalty;
    int honesty;

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
}
