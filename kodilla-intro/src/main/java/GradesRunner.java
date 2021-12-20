import java.util.Arrays;

public class GradesRunner {
    public static void main(String[] args) {
        Grades g = new Grades();
        Grades a = new Grades();
        g.add(5);
        g.add(7);
        g.add(6);
        g.add(9);
        g.add(8);
        g.add(2);
        g.add(3);
        g.add(1);
        g.add(32);
        g.add(10);
        System.out.println(Arrays.toString(g.getGrades()));
        //a.averageM();
        //System.out.println(averageM);
    }
   }
