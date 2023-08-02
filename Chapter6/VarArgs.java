public class VarArgs {

    static void Varargs(int ... v){

        System.out.println("No. of arguments: " + v.length);
        System.out.println("Contents");

        for(int i = 0; i < v.length; i++){
            System.out.println("arg" + i + ":" + v[i]);
        }
    }

    public static void main(String[] args){

        Varargs();
        Varargs(1,2);
        Varargs(3,4,5);

    }
}
