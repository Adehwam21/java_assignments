public class Student {
    private String name;
    private int age;
    private double[] grades;

    public Student(String name, int age, double[] grades){
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getGrades() {
       return grades;
    }

    public double getAvg(){
        double sumOfGrades = 0.0;

        for( double grade: grades) {
            sumOfGrades += grade;
        }
        return sumOfGrades / grades.length;
    }

    public static class Main{
        public static void main (String [] args){
            Student[] students = new Student[3];
            students[0] = new Student("Prince Addo", 23, new double[]{54.6, 63.9, 80.4});
            students[1] = new Student("Jeniffer Luck", 23, new double[]{65.6, 78.9, 74.4});
            students[2] = new Student("Aaron Katey", 23, new double[]{70.9, 76.4, 85.6});

            for (Student student : students) {
                System.out.printf(
                        student.getName()+" of age " + student.getAge() +
                        " has an average grade of " + student.getAvg() + "\n"
                );
            }
        }
    }
}

