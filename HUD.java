import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HUD here.
 * 
 * @author Mark Mauro
 * @version 1.8
 */
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
