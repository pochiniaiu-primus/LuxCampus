package homework;

public class TrianglesJustWithTwoLoopsWithOrWithoutIfOrIfElse {
    public static void main(String[] args) {
        /**
         *     *
         *    **
         *   ***
         *  ****
         * *****
         */
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < 5; j++) {
                if (j < i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("=====================================");
        /**
         * *****
         * ****
         * ***
         * **
         * *
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i <= j) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("=====================================");
        /**
         * *
         * **
         * ***
         * ****
         * *****
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("=====================================");
        /**
         * *****
         *  ****
         *   ***
         *    **
         *     *
         */
//      inner loop
        for (int i = 0; i < 5; i++) {
//      outer loop
            for (int j = 0; j < 5; j++) {
                if (i <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



