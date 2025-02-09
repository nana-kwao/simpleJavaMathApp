public class Main {
    public static void main(String[] args) {
        //get the array
        int[] ages = {44,76,12, 43,66,15,23};

        //loop through for 66
        for (int age:ages){
            if (age==66){
                System.out.println("We found " + age);
            }
        }
        System.out.println("Done");
    }
}