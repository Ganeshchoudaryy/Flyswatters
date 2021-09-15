public abstract class FlySwatter {

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }

    public void trap(){
        System.out.println(getName() + " is trapping the insect");
        System.out.println("Focusing .........");

    }

    public void catchInsect(){

        System.out.println(getName() + " is catching the insect");
        System.out.println( "catches the insect.........");

    }

    public void Kill() {

        System.out.println(getName() + " kills the insect");



    }

    //electric flyswatter
    //functions
    public void touch(){

        System.out.println(getName() + " is touching the insect");

    }


    public void flash(){

        System.out.println(getName() + " is flashing the light to the insect");

    }

    public void Incenereate() {

        System.out.println(getName() + "incenerates  and kills the insect");



    }

}