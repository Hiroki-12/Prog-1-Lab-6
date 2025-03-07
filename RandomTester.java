
/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Random;
import java.util.ArrayList;

public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random randomGenerator;
    private ArrayList<String> answers;
    
    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        // initialise instance variables
        randomGenerator = new Random();
        
        answers = new ArrayList<String>();
        answers.add (new String ("Yes"));
        answers.add (new String ("No"));
        answers.add (new String ("Maybe"));
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printOneRandom()
    {
        // put your code here
        System.out.println("New random: " + randomGenerator.nextInt(1000));
    }
    
    public void printMultiRandom(int howMany)
    {
        int count = 0;
        while (count < howMany)
        {
            printOneRandom();
            count++;
        }
    }
    
    public void throwDice()
    {
        System.out.println("The dice rolled a " + randomGenerator.nextInt(1, 7));
    }
    
    public void getResponse()
    {
        System.out.println(answers.get(randomGenerator.nextInt(3)));
    }
    
    public void getNumber1(int max)
    {
        System.out.println(randomGenerator.nextInt(1, max + 1));
    }
    
    public void getNumber2(int min, int max)
    {
        System.out.println(randomGenerator.nextInt(min, max + 1));
    }
    
    /*
     * 15. From 0 to 99
     * 
     */

}
