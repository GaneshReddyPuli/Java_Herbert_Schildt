class Ternary {

    public static void main(String[] args){

        int i,result;
        for(i = -5; i < 6; i++){
            result = i != 0 ? 100/i : 0;
            if(i!=0){
                System.out.println("100 / " + i + " is " + result);
            }
            else{

                System.out.println("100 / " + i + " is not possible");

            }
        }
    }
    
}
