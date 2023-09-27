import java.util.Scanner;
public class bar 
{
    public static void main (String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int art, bob, cal, dan, eli;
        System.out.print("Enter points earned by A >> ");
        art = input.nextInt();
        System.out.print("Enter points earned by B >> ");
        bob = input.nextInt();
        System.out.print("Enter points earned by C >> ");
        cal = input.nextInt();
        System.out.print("Enter points earned by D >> ");
        dan = input.nextInt();
        System.out.print("Enter points earned by E >> ");
        eli = input.nextInt();
        System.out.println("\nPoints for Game\n");

        System.out.print("\nA  ");        
        for (int num = 0; num < art; num += 1)
        {
            System.out.print("*");
        }

        System.out.print("\nB  ");
        for (int num = 0; num < bob; num += 1)
        {
            System.out.print("*");
        }

        System.out.print("\nC  ");
        for (int num = 0; num < cal; num += 1)
        {
            System.out.print("*");
        }

        System.out.print("\nD  ");
        for (int num = 0; num < dan; num += 1)
        {
            System.out.print("*");
        }

        System.out.print("\nE  ");
        for (int num = 0; num < eli; num += 1)
        {
            System.out.print("*");
        }
    }
}