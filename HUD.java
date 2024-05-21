import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class HUD extends Mover
{
    private final GreenfootImage life = new GreenfootImage ("life.gif");
    
    /**
     * Act - do whatever the HUD wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animationCounter++;
        
    }    
    

    // This part of the code is a constructor for the HUD class in Java. When an instance of the HUD
    // class is created, this constructor is called with an integer parameter `selection`.
    public HUD(int selection)
    {
        this.selection = selection;
        if (selection == 1)
        {
            setImage(life);
            life.scale(35,35);
        }
    }
}
