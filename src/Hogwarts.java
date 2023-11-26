
public class Hogwarts {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor(90, 85, 95, 80, 75);
        Gryffindor hermioneGranger = new Gryffindor(95, 90, 92, 85, 80);
        Gryffindor ronWeasley = new Gryffindor(80, 75, 85, 70, 65);

        Slytherin dracoMalfoy = new Slytherin(92, 85, 90, 88, 95, 85);
        Slytherin grahamMontague = new Slytherin(80, 75, 82, 78, 88, 80);
        Slytherin gregoryGoyle = new Slytherin(75, 70, 78, 72, 85, 75);

        Hufflepuff zachariasSmith = new Hufflepuff(85, 80, 82, 75, 70);
        Hufflepuff cedricDiggory = new Hufflepuff(92, 88, 90, 85, 78);
        Hufflepuff justinFinchFletchley = new Hufflepuff(78, 75, 80, 70, 65);

        Ravenclaw choChang = new Ravenclaw(92, 90, 88, 95, 85, 78);
        Ravenclaw padmaPatil = new Ravenclaw(85, 82, 80, 88, 80, 72);
        Ravenclaw marcusBelby = new Ravenclaw(80, 75, 78, 85, 75, 68);

        harryPotter.compareStudents(hermioneGranger);

        zachariasSmith.compareHufflepuffStudents(justinFinchFletchley);
        System.out.println();
        choChang.compareRavenclawStudents(padmaPatil);
    }

}