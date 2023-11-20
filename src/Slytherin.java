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
}
