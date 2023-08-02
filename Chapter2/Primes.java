public class Primes {
    public static void main(String[] args){
        int counter=0;
        int i;
        int n;
        for(n=2;n<=100;n++){
            for(i=1;i<=n;i++){
                if(n%i==0){
                    counter++;
                }
            }
            if(counter==2){
                System.out.println(n);
            }
            counter=0;
        }
    }
}

