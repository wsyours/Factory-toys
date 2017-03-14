/**
 * Created by Администратор on 13.03.2017.
 */
public class ToyFactory

{
    public Toy getToy(String toyType)
    {
        if(toyType == null)
        {
            return null;
        }
        if(toyType.equalsIgnoreCase("BALL"))
        {
            return new Ball();
        }
        else if(toyType.equalsIgnoreCase("DOLL"))
        {
            return new Doll();
        }
        else if(toyType.equalsIgnoreCase("DINOSAUR"))
        {
            return new Dinosaur();
        }
        else if(toyType.equalsIgnoreCase("CAR"))
        {
            return new Car();
        }
        else if(toyType.equalsIgnoreCase("TEDDYBEAR"))
        {
            return new TeddyBear();
        }
        else if(toyType.equalsIgnoreCase("LOCOMOTIVE"))
        {
            return new Locomotive();
        }
        return null;

    }

}
