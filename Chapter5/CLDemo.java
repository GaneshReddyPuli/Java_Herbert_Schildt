class CLDemo {

    public static void main(String[] args){

        System.out.println("These are " + args.length + " command line arguments.");
        for(int i=0; i < args.length; i++){

            System.out.println(args[i]);

        }
        
    }
    
}
