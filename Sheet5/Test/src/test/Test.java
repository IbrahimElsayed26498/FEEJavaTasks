/*
In the name of Allah, the Gracious, the Merciful
 */
package test;
public class Test {

    public static void main(String[] args) {
        char grades[][] = new char[8][10];
        int grade, best = 100;
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[0].length; j++) {
                grade = (int) (Math.random() * 101);
                if (grade >= best - 10) {
                    grades[i][j] = 'A';
                } else if (grade >= best - 20) {
                    grades[i][j] = 'B';
                } else if (grade >= best - 30) {
                    grades[i][j] = 'C';
                } else if (grade >= best - 40) {
                    grades[i][j] = 'D';
                } else {
                    grades[i][j] = 'F';
                }
            }
        }
        
        System.out.print("           ");
        for(int i = 0; i < grades[0].length; i++)
            System.out.print(i + " ");
        System.out.println("\n");
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Student " + i + "  ");
            for (int j = 0; j < grades[0].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }

}
