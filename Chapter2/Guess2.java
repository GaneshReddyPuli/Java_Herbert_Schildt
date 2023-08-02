public class Guess2 {
    public static void main(String[] args)
        throws java.io.IOException{
            char ch,answer='K';
            System.out.print("Guess the letter between A-Z: ");
            ch = (char) System.in.read();
            if(ch == answer){
                System.out.println("You're right.");
            }
            else{
                System.out.println("Sorry, you're wrong");
            }
    }
}
