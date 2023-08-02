class Vehicle{

    int passengers;
    int fuelcap;
    int mpg;


    double FuelNeeded(int miles){
        return (double) miles/mpg;
    }
}


public class CompFuel {

    public static void main(String[] args){

        Vehicle truck = new Vehicle();
        truck.passengers = 8;
        truck.fuelcap = 30;
        truck.mpg = 12;

        System.out.println("truck requires " + truck.FuelNeeded(24) + " gallons");

    }
    
}
