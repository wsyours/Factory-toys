/**
 * Created by Администратор on 13.03.2017.
 */
public class Client
{
    public static void main(String[]args)
    {
        ToyFactory toyFactory = new ToyFactory();

        Toy toy1 = toyFactory.getToy("BALL");
        toy1.playing();

        Toy toy2 = toyFactory.getToy("DOLL");
        toy2.playing();

        Toy toy3 = toyFactory.getToy("DINOSAUR");
        toy3.playing();

        Toy toy4 = toyFactory.getToy("CAR");
        toy4.playing();

        Toy toy5 = toyFactory.getToy("TEDDYBEAR");
        toy5.playing();

        Toy toy6 = toyFactory.getToy("LOCOMOTIVE");
        toy6.playing();

        Toy toy7 = toyFactory.getToy("TOYFACTORY");
        toy7.playing();
    }
}
