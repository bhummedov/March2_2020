package March2_2020;

public class CreatTentoTenArray {
  /*  public static void main(String[] args) {
        int[][] arrInt = new int[10][10];
        int counter = 1;
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                arrInt[i][j] = counter;
                counter++;
            }
        }
        for (int[] numberArray : arrInt) {
            for (int number : numberArray) {
                System.out.print("\t"+number);
            }
            System.out.println();
        }
    }
}*/
  public static void main(String[] args) {
      int arrayNumbers[][] = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
      for(int i=0 ; i<arrayNumbers.length;i++){
          for(int j=0 ; j<arrayNumbers[i].length;j++){
              arrayNumbers[i][j] = (int)(Math.random()*1000);
          }
      }
      for(int numberArray[]:arrayNumbers){
          for(int number:numberArray){
              System.out.println(number);
          }
      }
      //Random String array
      String[][] arrayWords = new String[4][7];
      for(int i=0 ; i<arrayWords.length;i++){
          for(int j=0 ; j<arrayWords[i].length ; j++){
              arrayWords[i][j]=RandomArrayForeach.generateRandomWord();
          }
      }
      for(String words[]:arrayWords){
          for(String word:words){
              System.out.format("\t%10s",word);
          }
          System.out.println();
      }


  }
}



