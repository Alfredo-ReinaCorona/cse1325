/*import product.Item;
import product.IceCreamFlavor;
import product.MixInFlavor;
import product.MixInAmount;
import product.MixIn;
import product.Scoop;*/

/*import javax.swing.JFrame;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JButton;*/
import javax.swing.*;
import java.awt.*;

public class MainWin extends JFrame
{
    /*private Emporium emporium;
    private JMenuItem createScoop;
    private JLabel display;*/

    public MainWin()
    {
        super("Ice Cream Emporium");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);
        JMenuBar mainbar= new JMenuBar();


        JMenu file=new JMenu("File");
        JMenuItem quitt=new JMenuItem("Quit");
        JMenu view=new JMenu("View");
        JMenuItem IceCreamFlavor=new JMenuItem("Icecream Flavor");
        JMenuItem MixInFlavor= new JMenuItem("Min In Flavor");
        JMenuItem Scoop_view=new JMenuItem("Scoop");
        JMenu create=new JMenu("Create");
        JMenuItem IceCreamFlavor_create=new JMenuItem("Icecream Flavor");
        JMenuItem MixInFlavor_create=new JMenuItem("Mix In Flavor");
        JMenuItem scoop_create=new JMenuItem("Scoop");
        JMenu help= new JMenu("Help");
        JMenuItem about=new JMenuItem("About");

        file.add(quitt);
        view.add(IceCreamFlavor);
        view.add(MixInFlavor);
        view.add(Scoop_view);
        create.add(IceCreamFlavor_create);
        create.add(MixInFlavor_create);
        create.add(scoop_create);
        help.add(about);
        
        mainbar.add(file);
        mainbar.add(view);
        mainbar.add(create);
        mainbar.add(help);
        
        setJMenuBar(mainbar);
    }    

    /*protected void onQuitClick() 
    {
        System.exit(0);
    }*/


    /*protected void onCreateIceCreamFlavorClick()
    {
        emporium.addIceCreamFlavor(new IceCreamFlavor(
            JOptionPane.showInputDialog(this, "Name?", "Create Ice Cream Flavor", JOptionPane.QUESTION_MESSAGE),
            JOptionPane.showInputDialog(this, "Description?", "Create Ice Cream Flavor", JOptionPane.QUESTION_MESSAGE),
            Integer.parseInt(JOptionPane.showInputDialog(this, "Price?", "Create Ice Cream Flavor", JOptionPane.QUESTION_MESSAGE)),
            Integer.parseInt(JOptionPane.showInputDialog(this, "Cost?", "Create Ice Cream Flavor", JOptionPane.QUESTION_MESSAGE))
        ));
        
        createScoop.setEnabled(true);  // Now we have a flavor, we can create a scoop!
        view(Screen.ICE_CREAM_FLAVORS);         
    }
    protected void onCreateMixInFlavorClick() {
        
        emporium.addMixInFlavor(new MixInFlavor(
            JOptionPane.showInputDialog(this, "Name?", "Create Mix In Flavor", JOptionPane.QUESTION_MESSAGE),
            JOptionPane.showInputDialog(this, "Description?", "Create Mix In Flavor", JOptionPane.QUESTION_MESSAGE),
            Integer.parseInt(JOptionPane.showInputDialog(this, "Price?", "Create Mix In Flavor", JOptionPane.QUESTION_MESSAGE)),
            Integer.parseInt(JOptionPane.showInputDialog(this, "Cost?", "Create Mix In Flavor", JOptionPane.QUESTION_MESSAGE))
        ));  
        view(Screen.MIX_IN_FLAVORS);         
    }*/
    /*protected void onCreateScoopClick() {
        IceCreamFlavor icf = (IceCreamFlavor) JOptionPane.showInputDialog(this, "Ice Cream Flavor?", "New Scoop", JOptionPane.QUESTION_MESSAGE, null, emporium.iceCreamFlavors(), null);
        if(icf != null)
        {
            Scoop scoop = new Scoop(icf);
            if(emporium.mixInFlavors().length > 0) 
            {
                String prompt = "<html>" + scoop + "<br/>Add a mix in?</html>";
                while(true) 
                {
                    MixInFlavor mif = (MixInFlavor) JOptionPane.showInputDialog(this, prompt, 
                        "Add Mix In", JOptionPane.QUESTION_MESSAGE, null, 
                        emporium.mixInFlavors(), null);
                    if(mif == null) break;
                    MixInAmount mia = (MixInAmount) JOptionPane.showInputDialog(this, prompt, 
                        "Add Mix In", JOptionPane.QUESTION_MESSAGE, null, 
                        MixInAmount.values(), MixInAmount.Normal);
                    scoop.addMixIn(new MixIn(mif, mia));
                    prompt = "<html>" + scoop + "<br/>Add another mix in?</html>";
                }
            }
            emporium.addScoop(scoop);
            view(Screen.SCOOPS);         
        }
    }*///Code from prof-rice repository, not sure how to do on my own

    public static void main(String[] args)
    {
        MainWin windowsss=new MainWin();
        windowsss.setVisible(true);
    }
}
