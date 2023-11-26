 public class Ravenclaw  extends HogwartsStudent{
     private int intelligence;
     private int wisdom;
     private int wit;
     private int creativity;

     Ravenclaw(int intelligence, int wisdom, int wit, int creativity, int magicPower, int transgressionDistance) {
         super(magicPower, transgressionDistance);
         this.intelligence = intelligence;
         this.wisdom = wisdom;
         this.wit = wit;
         this.creativity = creativity;
     }

     void displayDescription() {
         System.out.println("Intelligence: " + intelligence + ", Wisdom: " + wisdom + ", Wit: " + wit + ", Creativity: " + creativity);
         super.displayDescription();
     }

     void compareRavenclawStudents(Ravenclaw student) {
         int totalScoreStudent1 = intelligence + wisdom + wit + creativity;
         int totalScoreStudent2 = student.intelligence + student.wisdom + student.wit + student.creativity;

         if (totalScoreStudent1 > totalScoreStudent2) {
             System.out.println("This Ravenclaw student is better than the other one.");
         } else if (totalScoreStudent1 < totalScoreStudent2) {
             System.out.println("The other Ravenclaw student is better than this one.");
         } else {
             System.out.println("Both Ravenclaw students are equally skilled.");
         }
     }
}
