public class FindFac {

    public static void main(String[] args){

        int num,i;
        for(num=2;num<=100;num++){
            System.out.print("Factors of "+num+" are ");
            for(i=2;i<=(num/2);i++){
                if(num%i==0){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
    
}
