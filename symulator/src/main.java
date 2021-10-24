public class main {
    public static void main(String[] args) {
        int ilosc_szklanek=5;
        for (int i=1; i<ilosc_szklanek; i++)
        {
            new szklanka(i).start();
        }

    }
}
