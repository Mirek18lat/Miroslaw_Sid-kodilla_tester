public class Grades {
    private int[] grades;
    private int size;

    public  int [] getGrades() {
        return grades;
    }

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public long[] average() {
        int sum = 0;
        int index = 0;
        while (index < grades.length) {pa
            sum += grades[index];
            index++;
        };
        int average = sum/size;
        return new long[0];
    }

}