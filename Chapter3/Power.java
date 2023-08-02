public class Power {
    public static void main(String[] args){
        int result=1;
        for(int i=0;i<=9;i++){
            int e=i;
            result=1;
            while(e>0){
                result=result*2;
                e--;
            }
            System.out.println("2 to the "+i+" power is "+result);
        }   
    }
}
