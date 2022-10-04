public class MixIn 
{
    private mixInFlavor flavor;
    private MixInAmount amount;

    publix MixIn(MixInFlavor flavor, MixInAmount amount)
    {
        this.flavor=flavor;
        this.amount=amount;
    }
    @Override
    public String toString() 
    {
        if(MixInAmount.normal) return;

        else
        {
            return flavor+" "+amount;
        }
        
    }
}

