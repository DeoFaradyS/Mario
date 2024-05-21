import greenfoot.*;  

/**
 * The `Counter` class in Java represents a counter with methods to increment, decrement, set values,
 * and update the displayed image accordingly.
 */
public class Counter extends Actor  
{  
    private static final Color TRANSPARENT = new Color(0, 0, 0, 0);  
    public int value;  
    private Color textColor = Color.WHITE;  
    protected int target;
    private String prefix;

    // The `public Counter()` constructor in the Counter class is initializing the instance variables
    // `value`, `target`, and `prefix` to specific values. It sets `value` and `target` to 0, and
    // assigns the value of `prefix` to itself (which doesn't have any effect as it is not passed as a
    // parameter). Then, it calls the `updateImage()` method to update the image displayed by the
    // Counter object. Finally, it attempts to get the Font object from the GreenfootImage associated
    // with the Counter object, but this code will throw a NullPointerException because `getImage()` is
    // called before the image is set in the constructor.
    public Counter()  
    {  
        value = 0;
        target = 0;
        this.prefix = prefix;
        updateImage();
        GreenfootImage image = getImage();
        Font font = image.getFont();
    }  

    /**
     * The `act` function increments or decrements the `value` towards the `target` and updates the
     * image accordingly.
     */
    public void act() 
    {
        if (value < target) {
            value++;
            updateImage();
        }
        else if (value > target) {
            value--;
            updateImage();
        }
    }

    /**
     * The `updateImage` function sets a new image with specified text, font size, text color, and
     * transparency.
     */
    private void updateImage()  
    {  
        int fontSize =24;
        setImage(new GreenfootImage(prefix+" "+value, fontSize, textColor, TRANSPARENT)); 
    }  

    /**
     * The function `setTextColor` sets the text color to the specified color and updates the image.
     * 
     * @param color The `color` parameter is of type `Color`, which is a class representing a color in
     * Java. It is used to set the text color for a component or element in a graphical user interface.
     */
    public void setTextColor(Color color)  
    {  
        textColor = color;  
        updateImage();  
    }  

    /**
     * The setPrefix method sets a prefix text and updates an image.
     * 
     * @param text The `text` parameter in the `setPrefix` method is a String type parameter that
     * represents the text value that will be assigned to the `prefix` variable.
     */
    public void setPrefix(String text)  
    {  
        prefix = text;  
        updateImage();  
    }  

   // The `public Counter(String text)` constructor in the `Counter` class is a parameterized
   // constructor that takes a `String` parameter `text`. Inside this constructor, it assigns the value
   // of the `text` parameter to the `prefix` instance variable of the `Counter` class. After setting
   // the `prefix`, it then calls the `updateImage()` method to update the image displayed by the
   // `Counter` object with the new prefix value included. This constructor allows you to create a
   // `Counter` object with a specific prefix text provided as an argument during object instantiation.
    public Counter(String text)  
    {  
        prefix = text;  
        updateImage();  
    } 

    /**
     * The `subtract` function in Java subtracts a given score from the target and then updates the
     * image.
     * 
     * @param score The `score` parameter in the `subtract` method represents the value that will be
     * subtracted from the `target` variable.
     */
    public void subtract(int score)  
    {  
        target -= score;
        updateImage();  
    } 

    /**
     * The `setValue` function sets the `target` and `value` variables to a new value and then updates
     * the image.
     * 
     * @param newValue The `newValue` parameter is an integer value that is used to update the `target`
     * and `value` variables in the `setValue` method.
     */
    public void setValue(int newValue)  
    {  
        target = newValue;
        value = newValue;
        updateImage();  
    }  

    /**
     * The `getValue` function in Java returns the value of the `target` variable.
     * 
     * @return The method `getValue()` is returning the value of the variable `target`.
     */
    public int getValue()  
    {  
        return target;  
    }  
} 