package homework;

public class Triangles {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i <= j) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("=====================================");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("=====================================");
        for (int i = 0; i < 5; i++) { // outer loop to handle number of rows
            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j = 2 * (5 - i); j >= 0; j--) {
                // printing spaces
                System.out.print(" ");
            }
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j = 0; j <= i; j++) {
                // printing stars
                System.out.print("* ");
            }
            // ending line after each row
            System.out.println();
        }
        System.out.println("=====================================");
//      inner loop
        for (int i = 1; i <= 5; i++) {
//      outer loop
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("=====================================");
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                {
                    System.out.print(" ");
                }
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

