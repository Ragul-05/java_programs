package java_basics;
public class JaggedArray {
    public static void main(String[] args) {
        // Jagged Arrays :
        // Contains fixed number of rows
        // but varied number of columns

        int jagarr[][] = new int[3][];  // jagged

        jagarr[0] = new int[3];
        jagarr[1] = new int[4];
        jagarr[2] = new int[2];
        
         
        // generating random numbers in jnums
        // iterating each row with varied no. of columns
        for (int i=0; i<jagarr.length; i++){
            // specify each row's (array) size
            for (int j=0; j<jagarr[i].length; j++){
                jagarr[i][j] = (int)(Math.random() * 10);
            }            
        }

        // enhanced - for loop
       for(int arr[]:jagarr){
        for(int col : arr){
            System.out.print(col + " ");
        }
        System.out.println();
       }
    }
}