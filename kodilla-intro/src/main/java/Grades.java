public class Grades {

    private int size;
    private int sum;
    private int index;
    private double average;


    public int[] getGrades() {
        return grades;
    }
    public Grades() {
        this.grades = new int [10];
        this.size = 0;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
            this.grades[this.size] = value;
            this.size++;
    }
    public int[] averageGrades() {
        return grades;
    }
    public double averageM() {
        while (this.index < grades.length) {
            this.sum += grades[index];
            this.index++;
        }
        this.average = sum/grades.length;
        return average;
    }
}
