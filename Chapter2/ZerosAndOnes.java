public class ZerosAndOnes {
    public static void main(String[] args){
        System.out.println("a"+"\t"+"b"+"\t"+"a&b"+"\t"+"a|b"+"\t"+"a^b"+"\t"+"!a");
        boolean a = true;
        boolean b = true;
        if(a==true) System.out.print("1"+"\t");
        else System.out.print("0"+"\t");
        if(b==true) System.out.print("1"+"\t");
        else System.out.print("0"+"\t");
        if(a&b==true) System.out.print("1"+"\t");
        else System.out.print("0"+"\t");
        if(a|b==true) System.out.print("1"+"\t");
        else System.out.print("0"+"\t");
        if(a^b==true) System.out.print("1"+"\t");
        else System.out.print("0"+"\t");
        if(!a==true) System.out.println("1"+"\t");
        else System.out.println("0"+"\t");

        a = true;
        b = false;
        if(a==true) System.out.print("1"+"\t");
        else System.out.print("0"+"\t");
        if(b==true) System.out.print("1"+"\t");
        else System.out.print("0"+"\t");
        if(a&b==true) System.out.print("1"+"\t");
        else System.out.print("0"+"\t");
        if(a|b==true) System.out.print("1"+"\t");
        else System.out.print("0"+"\t");
        if(a^b==true) System.out.print("1"+"\t");
        else System.out.print("0"+"\t");
        if(!a==true) System.out.println("1"+"\t");
        else System.out.println("0"+"\t");

        a = false;
        b = true;
        if(a==true) System.out.print("1"+"\t");
        else System.out.print("0"+"\t");
        if(b==true) System.out.print("1"+"\t");
        else System.out.print("0"+"\t");
        if(a&b==true) System.out.print("1"+"\t");
        else System.out.print("0"+"\t");
        if(a|b==true) System.out.print("1"+"\t");
        else System.out.print("0"+"\t");
        if(a^b==true) System.out.print("1"+"\t");
        else System.out.print("0"+"\t");
        if(!a==true) System.out.println("1"+"\t");
        else System.out.println("0"+"\t");

        a = false;
        b = false;
        if(a==true) System.out.print("1"+"\t");
        else System.out.print("0"+"\t");
        if(b==true) System.out.print("1"+"\t");
        else System.out.print("0"+"\t");
        if(a&b==true) System.out.print("1"+"\t");
        else System.out.print("0"+"\t");
        if(a|b==true) System.out.print("1"+"\t");
        else System.out.print("0"+"\t");
        if(a^b==true) System.out.print("1"+"\t");
        else System.out.print("0"+"\t");
        if(!a==true) System.out.println("1"+"\t");
        else System.out.println("0"+"\t");
    }
}