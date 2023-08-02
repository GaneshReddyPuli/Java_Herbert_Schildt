class Block{

    int a,b,c;
    int volume;

    Block(int i, int j, int k){
        a = i;
        b = j;
        c = k;
        volume = a * b * c; 
    }

    boolean sameBlock(Block ob){
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }

    boolean sameVolume(Block ob){
        if(ob.volume == volume) return true;
        else return false;
    }

}

public class PassOb {

    public static void main(String[] args){

        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);

        if(ob1.sameBlock(ob2))
            System.out.println("ob1 and ob2 have same dimensions");
        else
            System.out.println("ob1 and ob2 do not have same dimensions");

        if(ob1.sameBlock(ob3))
            System.out.println("ob1 and ob3 have same dimensions");
        else
            System.out.println("ob1 and ob3 do not have same dimensions");

        if(ob1.sameVolume(ob3))
            System.out.println("ob1 and ob3 have same volume");
        else
            System.out.println("ob1 and ob3 do not have same volume");

    }
    
}
