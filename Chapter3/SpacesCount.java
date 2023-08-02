public class SpacesCount {
    public static void main(String args[]) throws java.io.IOException {
        char ch;
        int spaceCount=0;
        System.out.println("Enter a period(.) to stop");
        do{
            ch = (char) System.in.read();
            if(ch == ' '){
                spaceCount++;
            }
        }while(ch != '.');
        System.out.println("No. of spaces: "+spaceCount);
    }
}
