public class Cycle extends Vehicle {


    public Cycle(String brand, int kilometers) {
        super(brand, kilometers);
    }
    @Override
        public String doStuff(){
        return "Je suis " + this.getBrand() + " et je fais gling gling!";
        }

    }