
/**
 * Write a description of class SortingTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.Arrays;

public class SortingTest
{
    // instance variables - replace the example below with your own
    private ArrayList<Integer> numbers;

    /**
     * Constructor for objects of class SortingTest
     */
    public SortingTest()
    {
        // initialise instance variables
        numbers = new ArrayList<Integer>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sortNumbers(int[] numbers)
    {
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
