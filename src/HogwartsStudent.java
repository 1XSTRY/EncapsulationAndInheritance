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

     void compareStudents(HogwartsStudent student) {
         int totalScoreStudent1 = magicPower + transgressionDistance;
         int totalScoreStudent2 = student.magicPower + student.transgressionDistance;

         if (totalScoreStudent1 > totalScoreStudent2) {
             System.out.println("This student is more powerful and daring than the other one.");
         } else if (totalScoreStudent1 < totalScoreStudent2) {
             System.out.println("The other student is more powerful and daring than this one.");
         } else {
             System.out.println("Both students are equally skilled in magic and daring.");
         }
     }
}
