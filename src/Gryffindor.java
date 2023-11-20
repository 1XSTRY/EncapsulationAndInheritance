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
}
