public class AverageCalculator {

    public static double calcItOne(int[] nums, int min, int max) {
        int sum = 0;
        //did <= when it should be < and k = 1 should be k = 0
        for (int k = 0; k < nums.length; k++) {
            sum = sum + nums[k];
        }
        return (double) sum / nums.length;
    }

    public static double calcItTwo(int[] nums, int min, int max) {
        // need to initialize sum as 0
        int sum = 0;
        int counter = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] >= min && nums[k] <= max) {
                sum = sum + nums[k];
                counter++;
            }
        }
        //needs to cast sum or counter as double first
        double average = (double) sum / counter;
        return average;
    }

    public static double calcItThree(int[] nums, int min, int max) {
        double sum = 0;
        int counter = 0;
        for (int k = 0; k < nums.length; k++) {
            // needs to be <= and >=
            if (nums[k] >= min && nums[k] <= max) {
                sum = sum + nums[k];
                counter++;
            }
        }
        return sum / counter;
    }

    public static double calcItFour(int[] nums, int min, int max) {
        double sum = 0;
        int counter = 0;
        for (int val : nums) {
            if (val >= min && val <= max) {
                sum = sum + val;
                counter++;
            }
           
        }
        double average = sum / counter;
        return average;
    }
}


