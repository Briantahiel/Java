public class Scope {
    public static void main(String[] args) {
        int age = 21;
        int amountPeople = 2;
        boolean couple;
        if(amountPeople > 1){
            couple = true;
           System.out.println(couple); 
        }
        else{
            couple = false;
            System.out.println(couple); 
        }
        boolean answer = age >= 18 && couple;
        System.out.println(couple); 
        if(answer){
            System.out.println("You are welcome!");
        }
        else{
            System.out.println("You are not authorized!");
        }
        
    }
}
