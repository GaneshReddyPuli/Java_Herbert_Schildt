public class PowersOfTwo {
    public static void main(String[] args){

        int i,j;
        for(i=0;i<=10;i++){
            int n=1;
            for(j=1;j<=i;j++){
                n = n*2;
            }
            System.out.println(n);
        }
    }
}
