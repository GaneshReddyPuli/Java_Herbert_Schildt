class StringArrays {

    public static void main(String[] args){

        String[] str = {"This", "is", "a", "test"};
        System.out.print("Original array: ");
        for(String s: str){
            System.out.print(s + " ");
        }
        System.out.println();
        str[1] = "was";
        str[3] = "test, too!";

        System.out.print("Modified array: ");

        for(String s: str){

            System.out.print(s + " ");
        
        }
        System.out.println();
    }
}

