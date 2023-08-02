public class LogicalOpTable {
    public static void main(String[] args){
        System.out.println("a"+"\t"+"b"+"\t"+"a&b"+"\t"+"a|b"+"\t"+"a^b"+"\t"+"!a");
        boolean a = true;
        boolean b = true;
        System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b)+"\t"+(a^b)+"\t"+(!a));
        a = true;
        b = false;
        System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b)+"\t"+(a^b)+"\t"+(!a));
        a = false;
        b = true;
        System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b)+"\t"+(a^b)+"\t"+(!a));
        a = false;
        b = false;
        System.out.println(a+"\t"+b+"\t"+(a&b)+"\t"+(a|b)+"\t"+(a^b)+"\t"+(!a));
    }
}
