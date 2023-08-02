class Factor {

    boolean isFactor(int a, int b){
        if(b%a == 0) return true;
        else return false;
    }
}


public class TwoPar {

    public static void main(String[] args){

        Factor x = new Factor();
        if(x.isFactor(2,6)) System.out.println("2 is a factor of 6");
        else System.out.println("2 is not a factor of 6");

        if(x.isFactor(3,10)) System.out.println("3 is a factor of 10");
        else System.out.println("3 is not a factor of 10");

    }
    
}
