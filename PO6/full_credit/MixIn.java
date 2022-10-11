public class MixIn 
{
    private mixInFlavor flavor;
    private MixInAmount amount;

    public MixIn(MixInFlavor flavor, MixInAmount amount)
    {
        this.flavor=flavor;
        this.amount=amount;
    }
    @Override
    public String toString() 
    {
        if(MixInAmount.normal) return flavor;

        else
        {
            return flavor+" "+amount;
        }
        
    }
}



