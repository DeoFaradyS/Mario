import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BgItem here.
 * 
 * @author Mark Mauro
 * @version 1.8
 */
public class BgItem extends Mover
{
    private final GreenfootImage sBush = new GreenfootImage("bush-small-bg.gif");
    private final GreenfootImage Castle = new GreenfootImage("castle.gif");
    private final GreenfootImage lCloud = new GreenfootImage("cloud-large-bg.gif");

    private final GreenfootImage Flag = new GreenfootImage("flag.gif");
    private final GreenfootImage Flagpole = new GreenfootImage("flagpole.gif");

    public BgItem(int selection)
    {
        this.selection = selection;
        if (selection == 1)
        {
            setImage(Castle);
            Castle.scale(500,500);
        }
        else if (selection == 2)
        {
            setImage(Flagpole);
            
        }
        else if (selection == 3)
        {
            setImage(sBush);
            sBush.scale(250,110);
        }
        else if (selection == 4)
        {
            setImage(lCloud);
            lCloud.scale(350,150);
        }
    }
    
    /**
     * Act - do whatever the BgItem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
