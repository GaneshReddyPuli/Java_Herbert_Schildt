public class SideEffects {
    public static void main(String[] args){
        int i = 1;
        if(false & (++i<100)){
            System.out.println("This won't be displayed");
        }
        System.out.println("If statement executed, i: "+i);
        if(false && (++i<100)){
            System.out.println("This won't be displayed");
        }
        i++;
        System.out.println("If statement executed, i: "+i);
    }
}
