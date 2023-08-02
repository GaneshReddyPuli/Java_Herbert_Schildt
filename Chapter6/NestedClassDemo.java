class Outer{
    int[] nums;

    Outer(int[] n){
        nums = n;
    }

    void analyze(){

        Inner ob2 = new Inner();

        System.out.println(ob2.min());
        System.out.println(ob2.max());
        System.out.println(ob2.avg());

    }

    class Inner{

        int min(){

            int min = nums[0];
            for(int i = 1; i < nums.length; i++){
                if(nums[i] < min) min = nums[i];
            }
            return min;
        }

        int max(){

            int max = nums[0];
            for(int i = 1; i < nums.length; i++){
                if(nums[i] > max) max = nums[i];
            }
            return max;
            
        }

        float avg(){

            float sum = 0;
            for(int i = 0; i < nums.length; i++){
                sum = sum + nums[i];
            }
            return sum / nums.length ;

        }

    }
}

public class NestedClassDemo {

    public static void main(String[] args){

        int[] x = {1, 2, 3, 4, 5, 100};
        Outer ob = new Outer(x);
        ob.analyze();

    }
}
