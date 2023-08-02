public class NestVar {
    public static void main(String[] args){
        int count;
        for(count=0;count<10;count++){
            System.out.println("count is: "+count);
            int count;
            for(count=0;count<2;count++)
                System.out.println("this program is an error");
        }
    }
    
}
