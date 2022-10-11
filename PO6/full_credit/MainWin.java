import javax.swing.JFrame;
import javax.swing.JMenuItem;

public class MainWin extends JFrame
{
    public MainWin()
    {
        setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
        JMenu file=new Jmenu("File");
        JMenu view=new Jmenu("View");
        JMenuItem IceCreamFlavor=new JMenuItem("Icecream Flavor");
        JMenuItem MixInFlavor= new JMenuItem("Min In Flavor");
        JMenuItem Scoop=new JMenuItem("Scoop");
        JMenu create=new Jmenu("Create");
        JMenuItem IceCreamFlavorr=new JMenuItem(" Icecream Flavor");
        JMenuItem MixInFlavorr=new JMenuItem("Mix In Flavor");
        JMenuItem scooop=new JMenuItem("Scoop");
    }    
}

