import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create the factory object
        SwatterFactory swatterFactory = new SwatterFactory();

        FlySwatter theswatter ;
        FlySwatter swatter ;

        String typeOfSwatter = "NormalSwatter";
        String typeSwatter = "ElectricSwatter";

        swatter = swatterFactory.makeTypeSwater(typeSwatter);
        theswatter = swatterFactory.makeFlySwatter(typeOfSwatter);
        Swatter.swatNormalInsect(theswatter);
        System.out.println();
        Swatter.swatElectricInsect(swatter);

    }



}
