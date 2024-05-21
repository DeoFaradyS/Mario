import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Mover extends Actor
{
    protected int speed;
    protected int animationCounter;
    protected int selection;
    protected int movementCounter;
    
    /**
     * Move an object to the right
     */
    protected void moveRight()
    {
        setLocation(getX() + speed, getY());
    }

    /**
     * The `moveLeft` function in Java moves the object to the left by adjusting its X coordinate based
     * on the speed.
     */
    protected void moveLeft()
    {
        setLocation(getX() - speed, getY());
    }
    
    /**
     * The `moveUp` function in Java moves an object upwards by a specified speed.
     */
    protected void moveUp()
    {
        setLocation(getX(), getY()- speed);
    }
    
    /**
     * The `moveDown` function in Java moves an object downwards by adjusting its Y coordinate based on
     * a specified speed.
     */
    protected void moveDown()
    {
        setLocation(getX(), getY() + speed);
    } 
    
    /**
     * The `moveGoomba` function alternates between moving the Goomba left and right within a specified
     * range of movement.
     */
    protected void moveGoomba()
    {
        if (movementCounter <= 250)
        {
            moveLeft();
            
        }
        else if (movementCounter <= 500)
        {
            moveRight();
            
        }
        
        movementCounter++;
        
        if (movementCounter >= 500)
        {
            
            movementCounter = 0;
        }
    }
    
    /**
     * This Java function moves an object up and down while checking for collisions with another object
     * of class Mario and adjusting their position accordingly.
     */
    protected void moveUpAndDown()
    {
        if (movementCounter <= 150)
        {
            setLocation(getX() - 1, getY() );
            Actor Mario = getOneIntersectingObject(Mario.class);
            setLocation(getX() + 1, getY() );
            moveUp();
            
            if (Mario != null)
            {
                Mario.setLocation(Mario.getX() , Mario.getY()- speed);
            }
            
            
        }
        else if (movementCounter <= 300)
        {
            setLocation(getX() - 1, getY());
            Actor Mario = getOneIntersectingObject(Mario.class);
            setLocation(getX() + 1, getY() );
            
            moveDown();
            
            if (Mario != null)
            {
                Mario.setLocation(Mario.getX() , Mario.getY()+ speed);
            }
            
        }
        
        movementCounter++;
        if (movementCounter >= 300)
        {
            
            movementCounter = 0;
        }
    }
    
    /**
     * This Java function moves a platform up and down while checking for collision with a Mario object
     * to adjust its position accordingly.
     */
    protected void moveHFPlatform()
    {
        if (movementCounter <= 150)
        {
            setLocation(getX(), getY() - 1);
            Actor Mario = getOneIntersectingObject(Mario.class);
            setLocation(getX(),getY() + 1);
            moveLeft();
            if (Mario != null)
            {
                Mario.setLocation(Mario.getX() - speed, Mario.getY());
            }
        }
        else if (movementCounter <= 300)
        {
            setLocation(getX(), getY() - 1);
            Actor Mario = getOneIntersectingObject(Mario.class);
            setLocation(getX(),getY() + 1);
            
            moveRight();
            
            if (Mario != null)
            {
                Mario.setLocation(Mario.getX() + speed, Mario.getY());
            }
            
        }
        
        movementCounter++;
        if (movementCounter >= 300)
        {
            
            movementCounter = 0;
        }
    }
    
}
