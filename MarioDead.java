import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MarioDead extends Mover
{
    private final GreenfootImage dead = new GreenfootImage("mario-dead.gif");

    /**
     * MarioDead Constructor
     */
    public MarioDead()
    {
        setImage(dead);
        dead.scale(45,45);
    }

    /**
     * Act - do whatever the MarioDead wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animateDeath();
    }    

    /**
     * The `animateDeath` function increases the `movementCounter`, moves the object up until a certain
     * point, then moves it down until it reaches a specific position, triggering a level reset and
     * sound effect.
     */
    private void animateDeath()
    {
        movementCounter ++;
        
        
        if (movementCounter <= 150)
        {
            
            this.speed = 5;
            moveUp();
            
        }
        else if (getY() >= getWorld().getHeight() + 100)
        {
        Levels L = (Levels) getWorld();    
        L.setupLevel(L.level);
        Greenfoot.playSound("smb_mariodie.wav");
        }
        
        else if (movementCounter > 150)
        {
            this.speed = 5;
            moveDown();
        }
    }

}
