class Pwr{

    double b;
    int e;
    double val;

    Pwr(double base, int exp){

        this.b = base;
        this.e = exp;

        this.val = 1;
        if(exp == 0) return;
        for( ; exp>0 ; exp--) this.val = this.val*base;
    }
    double getVal(){
        return this.val;
    }
}

public class ThisDemo {

    public static void main(String[] args){

        Pwr x = new Pwr(5.7,0);
        Pwr y = new Pwr(4.0,2);
        Pwr z = new Pwr(2.5,1);
        System.out.println(x.getVal());
        System.out.println(y.getVal());
        System.out.println(z.getVal());

        
    }
}
