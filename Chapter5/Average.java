public class Average {

    public static void main(String[] args){

        double sum = 0;
        double avg;
        double[] nums = {6.1, 6.2 ,6.3, 6.4, 6.5, 6.6, 6.7, 6.8, 6.9, 7.0};

        for(double x : nums){

            sum += x;

        }
        avg = sum / 10.0;
        System.out.println(avg);
    }
}
