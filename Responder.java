/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */

import java.util.Random;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class Responder
{
    private Random randomGenerator;
    private ArrayList<String> responses;
    private HashMap<String, String> responsesMap;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        randomGenerator = new Random();
        fillResponses();
        responsesMap = new HashMap<>();
        fillResponsesMap();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> words)
    {
        String pickDefaultResponse = "I am unable to help you.";
        
        for (String word : words)
        {
            String response = responsesMap.get(word);
            if(response != null)
            {
                return response;
            }
        }
        
        return pickDefaultResponse;
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
    
    private void fillResponsesMap()
    {
        responsesMap.put("crash", "Restart");
        responsesMap.put("Help", "Good luck!");
        responsesMap.put("frozen", "That is unfortunate");
    }
    
    /*
     * 23. If the number of responses is lower than the number generated, the program will stop working.
     */
}   

