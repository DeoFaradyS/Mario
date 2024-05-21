import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * The `BgItem` class in Java initializes background objects based on a selection parameter provided to
 * its constructor.
 */

public class BgItem extends Mover
{
    private final GreenfootImage sBush = new GreenfootImage("bush-small-bg.gif");
    private final GreenfootImage Castle = new GreenfootImage("castle.gif");
    private final GreenfootImage lCloud = new GreenfootImage("cloud-large-bg.gif");

    private final GreenfootImage Flag = new GreenfootImage("flag.gif");
    private final GreenfootImage Flagpole = new GreenfootImage("flagpole.gif");

    // Konstruktor `public BgItem(int selection)` di kelas `BgItem` ini bertanggung jawab untuk 
    // menginisialisasi objek `BgItem` berdasarkan parameter `selection` yang dioperkan kepadanya. 
    // Berikut ini yang dilakukannya berdasarkan nilai `selection`:
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
    * Bertindak - lakukan apapun yang ingin dilakukan bgitem.Metode ini dipanggil kapan saja
     * Tombol 'ACT' atau 'Run' ditekan di lingkungan.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
