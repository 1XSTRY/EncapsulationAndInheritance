 class Gryffindor extends HogwartsStudent {
     int nobility;
     int honor;
     int bravery;

     Gryffindor(int nobility, int honor, int bravery, int magicPower, int transgressionDistance) {
         super(magicPower, transgressionDistance);
         this.nobility = nobility;
         this.honor = honor;
         this.bravery = bravery;
     }

     void displayDescription() {
         System.out.println("Nobility: " + nobility + ", Honor: " + honor + ", Bravery: " + bravery);
         super.displayDescription();
     }

     void compareGryffindorStudents(Gryffindor student) {
         int totalScoreStudent1 = nobility + honor + bravery;
         int totalScoreStudent2 = student.nobility + student.honor + student.bravery;

         if (totalScoreStudent1 > totalScoreStudent2) {
             System.out.println("This Gryffindor student is better than the other one.");
         } else if (totalScoreStudent1 < totalScoreStudent2) {
             System.out.println("The other Gryffindor student is better than this one.");
         } else {
             System.out.println("Both Gryffindor students are equally skilled.");
         }
     }
}
