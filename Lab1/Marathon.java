package Lab1;

public class Marathon {
    private int fastTime (int[] time){
        int index = 0;
        for (int i = 1, curr = time[0]; i < time.length; i++){
            if (curr > time[i]) {
                index = i;
                curr = time[i];
            }
        }
        return index;
    }
    public static void main (String[] args) {
        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie",
                "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane",
                "Emily", "Daniel", "Neda", "Aaron", "Kate" };

        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243,
                334, 412, 393, 299, 343, 317, 265};

        Marathon a = new Marathon();
        int indexFast = a.fastTime(times);
        int time = times[indexFast];
        String name = names[indexFast];
        System.out.println("The person with the fastest time is "+ name + " with a time of " + time + " seconds.");
    }
}
