public class Hangar {

    public static void main(String[] args){

        Vehicle Peugeot = new Car("208", 10000);
        Vehicle Titanic = new Boat("Odysee", 200000);
        Vehicle Bicyclette = new Cycle("velib",150);

        System.out.println(Peugeot.doStuff());
        System.out.println(Titanic.doStuff());
        System.out.println(Bicyclette.doStuff());
    }
}
