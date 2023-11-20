public class ComparisonUtils {
    public static void compareStudentsFaculty(HogwartsStudent student1, HogwartsStudent student2, String facultyName) {
        int[] attributes = getAttributesForFaculty(facultyName);

        int totalScoreStudent1 = calculateTotalScore(student1, attributes);
        int totalScoreStudent2 = calculateTotalScore(student2, attributes);

        if (totalScoreStudent1 > totalScoreStudent2) {
            System.out.println(student1.getClass().getSimpleName() + " is a better " + facultyName + " student than " + student2.getClass().getSimpleName() + ".");
        } else if (totalScoreStudent1 < totalScoreStudent2) {
            System.out.println(student2.getClass().getSimpleName() + " is a better " + facultyName + " student than " + student1.getClass().getSimpleName() + ".");
        } else {
            System.out.println(student1.getClass().getSimpleName() + " and " + student2.getClass().getSimpleName() + " are equally skilled " + facultyName + " students.");
        }
    }

    private static int[] getAttributesForFaculty(String facultyName) {
        switch (facultyName) {
            case "Gryffindor":
                return new int[]{90, 85, 95};
            case "Hufflepuff":
                return new int[]{80, 90, 85};
            case "Ravenclaw":
                return new int[]{95, 92, 94};
            case "Slytherin":
                return new int[]{88, 90, 92};
            default:
                throw new IllegalArgumentException("Invalid faculty name: " + facultyName);
        }
    }

    private static int calculateTotalScore(HogwartsStudent student, int[] attributes) {
        int totalScore = 0;
        for (int attribute : attributes) {
            totalScore += attribute;
        }
        totalScore += student.magicPower;
        return totalScore;
    }
}
