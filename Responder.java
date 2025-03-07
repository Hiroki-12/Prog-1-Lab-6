/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */

import java.util.Random;
import java.util.ArrayList;

public class Responder
{
    private Random randomGenerator;
    private ArrayList<String> responses;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        randomGenerator = new Random();
        fillResponses();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return responses.get(randomGenerator.nextInt(5));
    }
    
    private void fillResponses()
    {
        responses = new ArrayList<String>();
        responses.add (new String ("Good luck!"));
        responses.add (new String ("I can't help with that."));
        responses.add (new String ("Try Google."));
        responses.add (new String ("Ask a friend."));
        responses.add (new String ("The answer is right there!"));
    }
    
    /*
     * 23. If the number of responses is lower than the number generated, the program will stop working.
     */
}   

