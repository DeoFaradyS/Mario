import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mario here.
 * 
 * @author Mark Mauro 
 * @version 1.8
 */
public class Mario extends Mover
{

    private final GreenfootImage walk1Right = new GreenfootImage("mario-walk1.gif");
 
    private final GreenfootImage walk1Left = new GreenfootImage(walk1Right);
  

    private final GreenfootImage jumper = new GreenfootImage("mario-jump.gif");

    private boolean facingRight;
    private boolean isKeyPressed;

    private int verticalSpeed;
    private int acceleration = 1;
    private int marioBottomCentre;
    private int jumpDistance = 15;
    private boolean isJumping;
    public static boolean isDead;

    public Mario()
    {
        this.speed = 7;
        this.facingRight = true;
        this.isJumping = false;
        this.isDead = false;

        walk1Right.scale(48,50);
       

 
        walk1Left.scale(48,50);
        

        jumper.scale(48,50); 

        
        walk1Left.mirrorHorizontally();

        marioBottomCentre = getImage().getHeight() / 2;
    }

    public void act()
    {
        if (isDead == false)
        {

            checkKeys();
            
            boundary();

            if(getWorld() != null && !checkGround())
            {
                fall();
            }
            else
            {
                isJumping = false;
            }

        }
        else if (isDead == true)
        {
            Greenfoot.playSound("smb_pipe.wav");
            playDead();
        }
    }

    /**
     * level restrictions
     */

    private void boundary()
    {
        Levels L = (Levels)getWorld();
        if (getX() <= 21)
        {
            setLocation(21, getY());
        }
        else if (getX() >= 1100)
        {
            L.setupLevel(L.level + 1);
        }
        else if (L.level == 4 && getX() >= 1090)
        {
            setLocation(1090,getY());
        }
    }

    private void checkKeys()

    {
        isKeyPressed = false;

        if (Greenfoot.isKeyDown("right"))
        {
            animationCounter ++;
            walkRight();
         
            isKeyPressed = true;
            facingRight = true;
        }
        else if (Greenfoot.isKeyDown("left"))
        {
            animationCounter ++;
            walkLeft();
            
            isKeyPressed = true;
            facingRight = false;
        }

        if(Greenfoot.isKeyDown("up")&& isJumping == false)
        {
            isKeyPressed = true;
            jump();
        }

    
    }

    private void fall()
    {
        setLocation (getX(),getY() + verticalSpeed);
        verticalSpeed = verticalSpeed + acceleration;
        isJumping = true;
        checkGround();
        if (facingRight)
        {
            setImage(jumper);
        }
        else
        {
            setImage(walk1Left);
        }
        if (getY() >= getWorld().getHeight() + 100)
        {
            isDead = true;
            playDead();
        }
    }

    /**
     * Create a buffer to ensure Mario does not sink into the ground when standing on it
     */
    private boolean checkGround()
    {
        if (getOneObjectAtOffset (-17, marioBottomCentre, Ground.class) == null && getOneObjectAtOffset(17,
            marioBottomCentre, Ground.class) == null)
        {
            return false; 
        }
        while (getOneObjectAtOffset (-17, marioBottomCentre - 1, Ground.class) != null || 
        getOneObjectAtOffset(17,
            marioBottomCentre - 1, Ground.class) != null)
        {
            setLocation (getX(), getY() - 1);
            verticalSpeed = 0;
            return true;
        }
        verticalSpeed = 0;
        return true;
    }

    private void jump()
    {
        Greenfoot.playSound("smb_jump-small.wav");
        verticalSpeed = verticalSpeed - jumpDistance;
        fall();
    }

    /**
     * plays dead mario animation
     */
    private void playDead()
    {
        Levels L = (Levels)getWorld();
        Counter lifeCounter = L.getLifeCounter();
        lifeCounter.subtract(1);
        Greenfoot.delay(50);
        getWorld().addObject(new MarioDead(), getX(), getY());
        getWorld().removeObject(this);
    }
    
    
    
    
    private void walkRight()
    {
        moveRight();


         if (animationCounter < 8)
        {
            setImage(walk1Right);
        }
       
        else if (animationCounter < 16)
        {
          
            animationCounter = 0;
            return;
        }
    }

    private void walkLeft()
    {
        moveLeft();
     

        
        if (animationCounter < 16)
        {
       
            animationCounter = 0;
            return;
        }
    }
}
