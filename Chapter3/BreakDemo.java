public class BreakDemo {
    public static void main(String[] args){
        int i,num=100;
        for(i=0;i<num;i++){
            if(i*i >= 100) break;
            else{
                System.out.print(i + " ");
            }
        }
        System.out.println("Loop complete");
    }
    
}
