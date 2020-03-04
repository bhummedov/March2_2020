package March2_2020;

public class TwoRandomArray {
    public static void main(String[] args) {
        // two dimentional array for Int
     /*   int[][] arrayInt = new int[3][3];
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                arrayInt[i][j] = (int) (Math.random() * 9);
            }
        }
        for (int i = 0; i < arrayInt.length; i++) {
            for (int number : arrayInt[i]) {
                System.out.print("\t" + number);
            }
            System.out.println();
        }
    }
}*/

        //two dimentional array for String
        String[][] arrayString = new String[3][3];
        for (int i = 0; i < arrayString.length; i++) {
            for (int j = 0; j < arrayString[i].length; j++)
                arrayString[i][j] = generateRandomString();
        }
        for (int i = 0; i < arrayString.length; i++)
            for (String word: arrayString[i]) {
                System.out.println("\t"+word);
            }
        System.out.println();
        }
        public static String generateRandomString () {
            String word = " ";
            int wordLength = (int) (Math.random() * 6 + 1);
            for (int i = 0; i < wordLength; i++) {
                word += (char) ((int) (Math.random() * 26 + 97));
            }
            return word;
        }
    }

