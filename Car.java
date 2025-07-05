// Follow me closely here
public class Car extends Vehicle{

    //Obviously from here The parent class is vehicle whilst the child class is Car
    @Override
    //By now you can see we overrode the drive method and extended
    // it's functionality by asking it to print something
    void drive() {
        super.drive();
        System.out.print("Repairing a Car");

    }

    //for this section you were asked to check fuel level see your
    // lecturer won't tell you everything. hence descretionn is what you implore in
    //handling some questions  for this you know you need a metric scale
    // or a number to collectto determine whether it's high or low

    //Now this line of code beneath is a method with an argunent called fuel level
    void gauger(int fuel_level){
        //Now this is a condition given to the funtion that if fuel level is <= 50 it should go ahead and print
        //Else it should print the other one
        if (fuel_level <= 50){
            System.out.print("Your Fuel level is low");
        }
        else {
            System.out.println("Your fuel level is okay");
        }
    }

    //Now we overrode Engine Status and printed out something by now you suppose don dey turn guru small small
    @Override
    void Engine_Status() {
        super.Engine_Status();
        System.out.println("Your Engine status is okay");
    }
     //Fuel_E = Fuel Efficiency
    // Fuel_P = Fuel Price
//tc = Trip cost

    //We were also asked to calculate trip cost so how do we handle this?

    //I went to GPT to give me a formula for calculating trip cost based off fuel consumption
    //the formula GPT gave me was Distance / Fuel_E   * Fuel Price
    // then i used the paramters it gave me as arguments here
    void Trip_cost(double Distance, double Fuel_E, double Fuel_P){

        //and gave a formula here so whatever you pass into it after calculation is loaded into tc
        double tc = (Distance/Fuel_E) * Fuel_P;
        //Then you have your results printed out
        System.out.println("The Transportation cost is: "+tc);
    }
//Also here is explanatory if you have been following what
// I have been saying all this while, I'd leave you to understand this yourself
    @Override
    void Speed(double speed) {
        System.out.println("The Speed is Uniform");
    }
}
