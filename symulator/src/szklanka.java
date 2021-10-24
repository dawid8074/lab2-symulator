import java.util.Random;

public class szklanka extends Thread {
    int numer;
    int procent_wypelnienia;
    Random rand;
    szklanka(int numer)
    {
        this.numer=numer;
        rand=new Random();
        procent_wypelnienia=rand.nextInt(100);
    }
    public void run()
    {
        System.out.println("w szklance numer "+numer+" jest w "+procent_wypelnienia+"% pelna");
        while (procent_wypelnienia<=100)
        {
            if (procent_wypelnienia>=80)
            {
                System.out.println("szklanka "+numer+" prawie pelna");
                wypij();
            }
            System.out.println("dolawem do szklanki numer "+numer+" obecny stan: "+procent_wypelnienia+" %");
            procent_wypelnienia+=rand.nextInt(25);
            if (procent_wypelnienia>100)
            {
                System.out.println("nalano zbyt duzo. rozlało sie");
            }
        }
    }
    void wypij()
    {
        System.out.println("wypito zawartosc szklanki nr: "+numer);
        procent_wypelnienia=0;
    }
}
