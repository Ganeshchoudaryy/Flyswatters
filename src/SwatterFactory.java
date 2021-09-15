public class SwatterFactory {

    public FlySwatter makeFlySwatter(String newSwatterType ){

        FlySwatter newSwatter = null;

        if (newSwatterType.equals("NormalSwatter")){

            return new NormalSwater();

        } else

        if (newSwatterType.equals("ElectricSwatter")){

            return new ElectricSwater();

        } else return null;


    }

    public FlySwatter makeTypeSwater(String typeSwatter){

       // FlySwatter typeSwatter = null;

        if (typeSwatter.equals("NormalSwatter")){

            return new NormalSwater();

        } else

        if (typeSwatter.equals("ElectricSwatter")){

            return new ElectricSwater();

        } else return null;

    }
}
