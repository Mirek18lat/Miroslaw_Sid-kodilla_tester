import java.util.Arrays;

public class UserM {
    String name;
    int age;
    int i;
    int numbers;
    public UserM (String name, int age){
        this.name = name;
        this.age = age;
    }
    public void sum (int[] users) {
        int sumage = 0;
        int i = 0;
        for (i = 0; 0<users.length; i++ ) {
            sumage += age;
        }
        double av = sumage / users.length;
       System.out.println(av);
    }
 }
