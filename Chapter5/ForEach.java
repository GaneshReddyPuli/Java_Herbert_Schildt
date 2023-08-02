public class ForEach {

    public static void main(String[] args){

        int[] nums = {1,2,3,4,5};
        int sum=0;
        for(int i: nums){
            System.out.println(i);
        }

        for(int i: nums){
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
