
package CumulativeActivities;

/**
 *
 * @author ta
 */
public class SummativeSums {
    public static void main(String[] args) {
      int[][] arr=new int[3][];
      arr[0]= new int[]{1, 90, -33, -55, 67, -16, 28, -55, 15 };
      arr[1]=new int[] { 999, -60, -77, 14, 160, 301 };
      arr[2]= new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 }; 
        
      for (int i = 0; i < arr.length; i++) {
              System.out.println("#"+ (i+1) + "Array Sum: " + sum(arr[i]));
      }
  
    }
    
    public static int sum(int arr[]){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        return sum;
    }
}
