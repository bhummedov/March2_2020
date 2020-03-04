package March2_2020;

public class Practice {
    public static void main(String[] args) {
        int[][] numInt = new int[3][3];
        int length = numInt.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < numInt[i].length; j++) {
                numInt[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int arrInt[] : numInt) {
            for (int number : arrInt) {
                System.out.print("\t" + number);
            }
        }
        //public static String arrayString();
        String[][] arrString = new String[3][3];
        for (int i = 0; i < arrString.length; i++) {
            for (int j = 0; j < arrString[i].length; j++) {
                arrString[i][j] =Practice2.generateRandomWord();
            }
        }
        System.out.println("\n");
        for (String arraySt[] : arrString) {
            for (String wordString : arraySt) {
                System.out.print("\t" +wordString);
            }
            System.out.println();
        }
    }
}

