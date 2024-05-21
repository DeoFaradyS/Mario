import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Levels extends World
{
    private Counter scoreCounter;
    private Counter lifeCounter;
    public int level;
    public int marioStartX;
    public int marioStartY;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Levels()
    {    
        // Create a new world with 1100x590 cells with a cell size of 1x1 pixels.
        super(1100, 590, 1, false); 
        Greenfoot.setSpeed(50);
        
        //Greenfoot.playSound("mariothemesong.wav");
        scoreCounter = new Counter ("Score:");
        lifeCounter = new Counter ("x");
        lifeCounter.setValue(3);
        setupLevel(1);
        setPaintOrder(HUD.class, Counter.class, Transition.class, Mario.class, MarioDead.class,Ground.class, BgItem.class);
    }
    
    /**
     * The `setupLevel` function in Java sets up different levels in a game by adding objects based on
     * the specified level number.
     * 
     * @param lvl The `setupLevel` method you provided is used to set up different levels in a game.
     * The `lvl` parameter is used to determine which level to set up based on its value.
     */
    public void setupLevel(int lvl)
    {
        removeObjects(getObjects(null));
        level = lvl;
        if (level == 1)
        {
            marioStartX= 15;
            marioStartY = 472;
            worldColorLevel();
            HUD();
            addObject(new Mario(), marioStartX, marioStartY);
            addObject(new Ground(3),650,443);
            addObject(new BgItem(3), 178, 441);
            addObject(new BgItem(4), 349, 178);
            addObject(new BgItem(4), 780, 178);
         
            
            for (int x = 15; x < 351; x += 47)
            {
                for (int y = 520; y <= 570; y += 47)
                {
                    addObject( new Ground(1), x, y);
                }
            }
            
           for (int x = 800; x < 1100; x += 47)
            {
                for (int y = 520; y <= 570; y += 47)
                {
                    addObject( new Ground(1), x, y);
                }
            }
          
        }
        else if (level == 2)
        {
            marioStartX= 15;
            marioStartY = 472;
            worldColorLevel();
             HUD();
            addObject(new Mario(), marioStartX, marioStartY);
            addObject(new Ground(5),540,443);
            addObject(new BgItem(3), 178, 441);
            addObject(new BgItem(4), 349, 178);
            addObject(new BgItem(4), 780, 178);
          
            
            
            for (int x = 15; x < 351; x += 47)
            {
                for (int y = 520; y <= 570; y += 47)
                {
                    addObject( new Ground(1), x, y);
                }
            }
            
           for (int x = 800; x < 1100; x += 47)
            {
                for (int y = 520; y <= 570; y += 47)
                {
                    addObject( new Ground(1), x, y);
                }
            }
            

        }
        else if (level == 3)
        {
            marioStartX= 15;
            marioStartY = 472;
            worldColorLevel();
             HUD();
            addObject(new Mario(), marioStartX, marioStartY);
            addObject(new Ground(3),650,443);
            addObject(new BgItem(4), 349, 178);
            addObject(new BgItem(4), 780, 178);
            
  
            
            for (int x = 15; x < 200; x += 47)
            {
                for (int y = 520; y <= 570; y += 47)
                {
                    addObject( new Ground(1), x, y);
                }
            }
            
            addObject(new Ground(1), 335, 521);
            addObject(new Ground(1), 335, 566);
            
           for (int x = 800; x < 1100; x += 47)
            {
                for (int y = 520; y <= 570; y += 47)
                {
                    addObject( new Ground(1), x, y);
                }
            }
        }
        else if (level == 4)
        {
            marioStartX= 15;
            marioStartY = 472;
            worldColorLevel();
            HUD();
            addObject(new Mario(), marioStartX, marioStartY);
            addObject(new BgItem(1), 850 , 252);
            addObject(new BgItem(2), 500 , 311);
            
            
            for (int x = 15; x < 1100; x += 47)
            {
                for (int y = 520; y <= 570; y += 47)
                {
                    addObject( new Ground(1), x, y);
                }
            }
            
        
        }
        else if (level == -1)
        {
            GreenfootImage background = getBackground();
            background.setColor(new Color(0, 0, 0));
           
            background.fill();
          
        }
    }
    
    /**
     * The `worldColorLevel` function sets the background color of the world to a specific shade of
     * blue.
     */
    public void worldColorLevel()
    {
        GreenfootImage background = getBackground();
        background.setColor(new Color(92, 148, 252));
        background.fill();
            
    }
    
   /**
    * The function `worldColorGameOver` sets the background color of the world to black.
    */
    public void worldColorGameOver()
    {
        GreenfootImage background = getBackground();
        background.setColor(new Color(0,0,0));
        background.fill();
    }
    
    /**
     * lifeCounter reference
     */
    public Counter getLifeCounter()
    {
        return lifeCounter;
    }
    

    
    /**
     * level hud
     */
    public void HUD()
    {
        addObject(lifeCounter, 67,21);
        addObject(new HUD(1), 34,21);
        addObject(new HUD(2), 1010,21);
    }
    
    
}
