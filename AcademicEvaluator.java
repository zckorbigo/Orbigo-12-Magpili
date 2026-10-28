public class AcademicEvaluator {
    public static void main(String[] args) {

        // Hardcoded student values
        double gwa = 94.5;
        int lowestGrade = 88;

        // Outer if-else statement
        if (gwa >= 90.0) {

            // Nested if-else statement
            if (lowestGrade >= 85) {

                // Check the conditions for High Honors
                if (gwa >= 98.0 && lowestGrade >= 95) {
                    System.out.println("With Highest Honors");
                }
                else if (gwa >= 95.0 && lowestGrade >= 90) {
                    System.out.println("With High Honors");
                }
                else if (gwa >= 90.0 && lowestGrade >= 85) {
                    System.out.println("With Honors");
                }

            } else {
                System.out.println(
                    "Honors Disqualified due to grade below minimum requirement"
                );
            }

        } else {
            System.out.println("Regular Passing Grade");
        }
    }
}