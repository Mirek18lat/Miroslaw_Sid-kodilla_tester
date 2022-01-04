import java.util.Arrays;

public class GradesRunner {
    public static void main(String[] args) {
        Grades g = new Grades();
        Grades a = new Grades();
        a.add(5);
        a.add(7);
        a.add(6);
        a.add(9);
        a.add(8);
        a.add(2);
        a.add(3);
        a.add(1);
        a.add(32);
        a.add(10);
        g.average();
        System.out.println(Arrays.toString(a.getGrades()));
        System.out.println(Arrays.toString(g.average()));
    }
}



