class StaticMethod{

    static int val;
    
    static int valDiv2(){
        return val/2;
    } 
}

public class SDemo2 {
    public static void main(String[] args){

        StaticMethod.val = 1024;
        System.out.println("Static variable: " + StaticMethod.val);
        System.out.println(StaticMethod.valDiv2());

        StaticMethod.val = 4;
        System.out.println("Static variable: " + StaticMethod.val);
        System.out.println(StaticMethod.valDiv2());

    }
    
}