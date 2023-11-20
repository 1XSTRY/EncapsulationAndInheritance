 class HogwartsStudent {
        int magicPower;
        int transgressionDistance;

        HogwartsStudent(int magicPower, int transgressionDistance) {
            this.magicPower = magicPower;
            this.transgressionDistance = transgressionDistance;
        }

        void displayDescription() {
            System.out.println("Magic Power: " + magicPower + ", Transgression Distance: " + transgressionDistance);
        }
}
