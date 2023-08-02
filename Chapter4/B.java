class A{

    int a=10;
    void display(){
        int a = 2000;
        System.out.println(this.a);
    }
}


public class B {

    public static void main(String[] args){

        A obj = new A();
        obj.display();

    }
    
}
