class Phone {

    public static void main(String[] args){

        String[][] numbers = {{"Tom", "555-3322"},
                              {"Mary", "555-8976"},
                              {"John", "555-1037"},
                              {"Rachel", "555-1400"}};

        int i;
        if(args.length != 1){
            System.out.println("Usage: java Phone <name>"); 

        } 
        else{

            for(i = 0; i < numbers.length; i++){
                if(numbers[i][0].equals(args[0])){

                    System.out.println(args[0] + "'s phone number: " + numbers[i][1]);
                }
            }
        }

    }
    
}
