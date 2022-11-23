import java.io.IOException;

public class Person 
{
    protected String name;
    protected string phone;

    public person(String name, String phone)
    {
        this.name=name;
        this.phone=phone;
    }
    public person(BuffredReader in) throws IOException
    {
        this.name=in.readline;
        this.phone=in.readLine;

    }
    public save(BufferedWriter out)
    {
        out.write(name);
        out.write(phone);

    }
    public String toString()
    {
        return phone;
    }
    public boolean equals(Person x)
    {
        
    }
    public int hashcode()
    {

    }
}

