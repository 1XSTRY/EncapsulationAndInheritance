 class Ravenclaw  extends HogwartsStudent{
     int intelligence;
     int wisdom;
     int wit;
     int creativity;

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
}
