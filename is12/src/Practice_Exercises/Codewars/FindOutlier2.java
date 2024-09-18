/*
package Practice_Exercises.Codewars;

public class FindOutlier2 {
    public static void main(String[] args) {
        */
/*
        [2, 4, 0, 100, 4, 11, 2602, 36] -->  11 (the only odd number)
        [160, 3, 1719, 19, 11, 13, -21] --> 160 (the only even number)
         *//*



        int[] numbers = {160, 3, 1719, 19, 11, 13, -21};
        int outlier = findOutlier(numbers);
        System.out.println("The outlier is: " + outlier);


    }

    public static int findOutlier(int[] integers) {
        int parities = (integers[0] & 1) << 1 | (integers[1] & 1);

        for (int i = 2; i < integers.length; i++) {
            parities = parities << 1 | (integers[i] & 1);

            int off;
            switch (parities & 7) {
                case 3, 4 -> off = 2;
                case 2, 5 -> off = 1;
                case 1, 6 -> off = 0;
                default -> off = -1;
            }

            if (off >= 0)
                return integers[i - off];
        }

        return ~integers[0] & 1;

    }
}




*/
