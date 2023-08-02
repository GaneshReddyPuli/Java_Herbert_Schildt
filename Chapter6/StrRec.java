class Backwards{

    String str;

    Backwards(String s){
        str = s;
    }

    int len = str.length()-1;
    void reverse(int l){

        
        System.out.println(str.charAt(l));
        while(str.length() != 0){
            reverse(len-1);

        }
        

    }

}

public class StrRec {
    public static void main(String[] args){

        Backwards b = new Backwards("This is a demo");
        b.reverse(str.length()-1);
    }
}
