class Overload{

    void ovlDemo(){
        System.out.println("No parametres");
    }

    int ovlDemo(int i){
        System.out.print("One parameter: ");
        return i;
    }

    int ovlDemo(int i, int j){

        System.out.println("Two parameters: " + i + " " + j);
        return i+j;
    
    }

    double ovlDemo(double i, double j){

        System.out.println("Two double parameters: " + i + " " + j);
        return i+j;
    
    }
}

public class OverloadDemo {

    public static void main(String[] args){

        Overload od = new Overload();

        od.ovlDemo();

        var res0 = od.ovlDemo(2);
        System.out.println(res0);

        var res1 = od.ovlDemo(4,6);
        System.out.println("Result of ob.ovlDemo(4,6): " + res1);

        var res2 = od.ovlDemo(1.1, 2.32);
        System.out.println("Result of ob.ovlDemo(1.1, 2.32): " + res2);

    }
}
