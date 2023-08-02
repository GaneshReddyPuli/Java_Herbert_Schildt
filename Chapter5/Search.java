public class Search {

    public static void main(String[] args){

        int val = 50;
        int[] nums = {6, 8 ,3, 7, 5, 6, 1, 4};
        for(int x : nums){
            if(x == val){
                System.out.println("Value found");
                return;
            }
        }
    }
}
