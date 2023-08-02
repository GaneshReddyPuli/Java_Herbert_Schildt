public class VarArgsSum {

    static int sum(int ... v){
        int sum = 0;
        for(int i = 0; i < v.length; i++){
            sum = sum + v[i];
        }
        return sum;   
    }

    public static void main(String[] args){     //Since main is a static method sum() should also be declared static 
                                                //cuz static methods can't be called from a static context.

        System.out.println(sum(1, 3, 5, 7, 9));

    }
    
}
