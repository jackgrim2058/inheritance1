/**
 * Dog class that tests abstract methods.
 * 
 * @author Jackson Grimsland
 * @version 05/02/2024
 */
public class Dog extends Canine implements Pet
{
    @SuppressWarnings("unused")
    private String name;

    /**
     * No arg constructor 
     */
    public Dog()
    {
        name = "Bruiser";
    }

    /**
     * Method pet from the pet interface.
     */
    @Override
    public void pet()
    {
        System.out.println("Wags tail");
        bark(); // Bark method from Canine.
    }

    /**
     * Method setName from the Animal abstract class
     * 
     * @param name name to be set.
     */
    @Override
    public void setName(String name)
    {
        if (name == null)
        {
            throw new NullPointerException("Name must not be null");
        }

        this.name = name;
    }
    
}
