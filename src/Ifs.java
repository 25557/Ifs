public class Ifs {
    public static void main(String [] args) {

        int willekeurig = (int) Math.ceil( Math.random() * 10);

        if (willekeurig >= 8 )
        {
            System.out.println("8 of hoger");
        }
        else
        {
            System.out.println("Het is een ander getal");
        }
        System.out.println("Einde Programma");
    }
}