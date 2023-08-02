class Vehicle{

    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return fuelcap * mpg;
    }
}

class RetMeth{
    public static void main(String[] args){

        Vehicle minivan = new Vehicle ();
        Vehicle sportscar = new Vehicle ();
        int range1, range2;

        minivan.passengers = 4;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 8;
        sportscar.mpg = 10;

        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range1);

        System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + range2);
        
    }
}


