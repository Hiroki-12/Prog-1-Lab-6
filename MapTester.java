
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.HashMap;
import java.util.Set;

public class MapTester
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> contacts;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        // initialise instance variables
        contacts = new HashMap<>();
        fillContacts();
    }
    
    private void fillContacts()
    {
        contacts.put("A", "1");
        contacts.put("B", "2");
        contacts.put("C", "3");
        contacts.put("D", "4");
        contacts.put("E", "5");
        contacts.put("F", "6");
        contacts.put("G", "7");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void enterNumber(String name, String number)    
    {
        // put your code here
        contacts.put(name, number);
    }
    
    public String lookupNumber(String name)
    {
        return contacts.get(name);
    }
    
    public void getNumbers()
    {
       System.out.println(contacts.keySet());
    }
    /*
     * 28. It updates the value. There can be duplicate values but not duplicate keys.
     */
}
