class Vehicle{

    int passengers;
    int fuelcap;
    int mpg;

    Vehicle(int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    double FuelNeeded(int dist){
        return (double) dist/mpg;
    }

    int range() {
        return fuelcap * mpg;
    }

}


public class VehicleConsDemo {

    public static void main(String[] args){

        int dist = 252;

        Vehicle minivan = new Vehicle(7, 16, 21);
        System.out.println("Minivan requires " + minivan.FuelNeeded(dist) + " to go " + dist + " miles");

        Vehicle sportscar = new Vehicle(2, 14, 12);
        System.out.println("Sportscar requires " + sportscar.FuelNeeded(dist) + " gallons to go " + dist + " miles");

    }
    
}

