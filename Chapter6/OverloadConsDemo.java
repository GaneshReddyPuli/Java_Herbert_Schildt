class MyClass{
    int x;

    MyClass(){
        System.out.println("Inside MyClass().");
        x = 0;
    }

    MyClass(int i){
        System.out.println("Inside MyClass(int i).");
        x = i;
    }

    MyClass(double i){
        System.out.println("Inside MyClass(double i).");
        x = (int) i;
    }

    MyClass(int i, int j){
        System.out.println("Inside MyClass(int , int).");
        x = i * j;
    }
    
}

public class OverloadConsDemo {

    public static void main(String[] args){
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass(88);
        MyClass t3 = new MyClass(17.23);
        MyClass t4 = new MyClass(2,4);

        System.out.println("t1.x is "+t1.x);
        System.out.println("t2.x is "+t2.x);
        System.out.println("t3.x is "+t3.x);
        System.out.println("t4.x is "+t4.x);

    }
}
