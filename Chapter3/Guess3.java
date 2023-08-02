public class Guess3 {
    public static void main(String[] args)
        throws java.io.IOException{
            char ch,answer='K';
            System.out.print("Guess the letter between A-Z: ");
            ch = (char) System.in.read();
            if(ch == answer){
                System.out.println("You're right.");
            }
            else{
                System.out.print("Sorry, you're ");
                if(ch < answer){
                    System.out.println("too low.");
                }    
                else{
                    System.out.println("too high.");
                }
            }
    }
}
