import java.util.ArrayList;
import product.mixInFlavor;
import poduct.IceCreamFlavor;
import product.Item;
import product.MixInAmount;
import product.Scoop;

public class Emporium
{
    private ArrayList<MixInFlavor> mixinFlavors=new ArrayList<>();
    private ArrayList<IceCreamFlavor> icecreamFlavor=new ArrayList<>();
    private ArrayList<Scoop> scoops=new ArrayList<>();

    public addMixInFlavor(MixInFlavor flavor)
    {
        mixInFlavors.add(flavor);
    }
    public addIceCreamFlavor(IceCreamFlavor flavor)
    {
        iceCreamFlavors.add(flavor);
    }
    public addScoop(Scoop scoop)
    {
        scoops.add(scoops);
    }
    public Object[] mixinFlavors()
    {
        return this.micInFlavors.toArray();
    }
    public Object[] icecreamFlavor()
    {
        return this.icecreamFlavors.toArray();
    }
    public Object[] scoops()
    {
        return this.scoops.toArray();
    }
}
