class Vehicle {

    int passengers;
    int fuelcap;
    int mpg;

    void range(){

        System.out.println("Range is " + fuelcap * mpg);

    }

}

public class AddMeth {
    public static void main(String[] args){

        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        //int range1,range2;

        minivan.passengers = 2;
        minivan.fuelcap = 5;
        minivan.mpg = 10;

        sportscar.passengers = 4;
        sportscar.fuelcap = 10;
        sportscar.mpg = 20;

        System.out.println("Minivan can carry " + minivan.passengers + ". ");

        minivan.range();

        System.out.println("Sportscar can carry " + sportscar.passengers + ". ");

        sportscar.range();

    }
    
}
