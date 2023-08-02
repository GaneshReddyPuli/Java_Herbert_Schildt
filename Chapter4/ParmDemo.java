class ChkNum {

    boolean isEven(int a){
        if (a%2 == 0) return true;
        else return false;
    }
    
}

public class ParmDemo{

    public static void main(String[] args){

        ChkNum e = new ChkNum();

        System.out.println("The statement 5 is even is " + e.isEven(5));

        System.out.println("The statement 10 is even is " + e.isEven(10));

    }
}
