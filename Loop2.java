public class Loop2 {
    public static void main(String[] args) {
        int counter = 0;
        int total = 0;
        while(counter <= 10){
            total += counter;
            counter += 1;
        }
        System.out.println(total);
    }
}
