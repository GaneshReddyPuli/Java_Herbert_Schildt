public class StringDemo {

    public static void main(String[] args){

        String str = new String("Java string are so powerful");
        String str2 = "Java string are so powerful";
        String str3 = new String(str2);

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
    }
    
}
