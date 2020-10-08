import java.util.Scanner;
/**
 *a search algorithm for an array of 10 numbers
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for input
    Scanner input = new Scanner(System.in);

    //create an array for numbers
    int[] nums = new int[10];

    //ask for intergers
    System.out.println("Please enter in 10 integers to put into the array");

    //get numbers from user and store them in array
    for(int i = 0; i < nums.length; i++){
      nums[i] = input.nextInt();
    }

    //ask for number to find
    System.out.println("Please enter a number to find");
    int search = input.nextInt();

    //find the number
    for(int i = 0; i < nums.length; i++){
      if(nums[i] == search){
        System.out.println(search  + " is located at index " + (i + 1));
      }
    }
    
  }
}
