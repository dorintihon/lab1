//Dorin Tihon
import java.util.Scanner;
public class tester {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);


        bedSize bedSize = new bedSize();
        bedThickness bedThickness = new bedThickness();
        bedColor bedColor = new bedColor();


        //Give bed size on X and Y
        boolean size = false;
        while (!size){
        System.out.println("Enter bed size X:");

        int sizeX = scnr.nextInt();
        bedSize.setBedSizeX(sizeX);

        System.out.println("Enter bed size Y:");

        int sizeY = scnr.nextInt();
        bedSize.setBedSizeY(sizeY);

        if (sizeX == 60 && sizeY == 80){
            bedSize.setQueen();
            size = true;
        }
        else if (sizeX == 76 && sizeY == 80){
            bedSize.setKing();
            size = true;
        }
        else {
            System.out.println("We don't have a bed for required size");

        }
            }

        //Give bed thickness

        boolean thick = false;

        while (!thick) {
        System.out.println("Enter preferred mattress thickness in inches:");

        int thickness = scnr.nextInt();
        bedThickness.setBedThickness(thickness);


            if (0 < thickness && thickness <= 5) {
                bedThickness.setSlim();
                thick = true;
            } else if (5 < thickness && thickness <= 10) {
                bedThickness.setThick();
                thick = true;
            } else {
                System.out.println("We don't have a mattress for required thickness");
            }
        }



        //Get preferred color
        System.out.println("Choose bed color:");

        String color = scnr.next();
        bedColor.setBedColor(color);

        //Output
        System.out.println("You need a " + bedSize.getBedName() + " (" +
                bedSize.getBedSizeX() + "inches x " + bedSize.getBedSizeY() + "inches) sized bed");

        System.out.println("Mattress: " + bedThickness.getThicknessName() + " (" + bedThickness.getBedThickness() + " inches)");
        System.out.println("Color: " + bedColor.getBedColor());

    }
}
