class NoChange {

    public static void main(String[] args){

        int[] nums = {1,2,3,4,5};
        for(int i: nums){
            System.out.print(i + " ");
            i = i * 10;
        }
        System.out.println();


        for(int i: nums){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
