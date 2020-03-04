package March2_2020;

public class TwoDimentionalArray {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        int counter=1;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                //assigning number to current element (cell)
                arr[i][j]=counter;
                counter++;
            }
        }
        // print all element of the arr
        for (int i=0; i<arr.length; i++){
            for (int number:arr[i]){ //for every iteration of outer loop it
                System.out.print("\t"+number);
            }
            System.out.println();
        }
    }
}
