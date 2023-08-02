public class IfDemo {
    public static void main(String[] args){

        int a,b,c;
        a=2;
        b=3;
        if(a<b)
        System.out.println("a is less than b");
        c = a-b;
        System.out.println("c contains "+c);
        if(c<0)
        System.out.println("c is negative");
        if(c>=0)
        System.out.println("c is non-negative");

        c = b-a;
        System.out.println("c contains "+c);
        if(c>=0)
        System.out.println("c is non-negative");
        if(c<0)
        System.out.println("c is negative");
    }
    
}
