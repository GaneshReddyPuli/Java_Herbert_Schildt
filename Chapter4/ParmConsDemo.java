class MyClass{
    int x;
    int y;

    MyClass(int i, int j){
    
        x = i;
        y = j;

    }
}

public class ParmConsDemo {

    public static void main(String[] args){

        MyClass t1 = new MyClass(22,44);
        MyClass t2 = new MyClass(66,88);

        System.out.println(t1.x);
        System.out.println(t1.y);
        System.out.println(t2.x);
        System.out.println(t2.y);

    } 
}
