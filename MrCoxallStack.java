import java.util.ArrayList;

/**
* This class creates an integer stack.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-05-28
*/
public class MrCoxallStack {
  public ArrayList<Integer> stackAsArray = new ArrayList<>();
  
  /**
  * The Push method pushes an integer to the ArrayList.
  */
  public void push(int pushNumber) {
    stackAsArray.add(pushNumber);
    System.out.print("\nComplete!");
  }
  
  /**
  * The showStack method outputs the ArrayList.
  */
  public final void showStack() {
    
  }
}