import java.util.Scanner;

public class GeometryMain 
{
    public static void main(String[] args)
    {
        //intializing variable
        int x;

        //instantiating a scanner ibject
        Scanner sc = new Scanner(System.in);

        //getting user input 
        System.out.println("Enter the length of one edge: ");

        //setting user input to variable
        //converting from string to int
        x = Integer.parseInt(sc.nextLine());

        //pluging in this variable surfaceArea method
        int result = Cube.surfaceArea(x);

        //out printing result to the console
        System.out.println("Area is: " + result);
    }

}
