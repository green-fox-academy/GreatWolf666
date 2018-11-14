package TeacherStudent;

public class Main {
  public static void main(String[] args) {
    Teacher teacher = new Teacher(); //I have no idea what the fuck I'm doing...
    Student student = new Student();

    Student.learn();
    Teacher.answer();
    System.out.println(Student.learn);
    System.out.println(Teacher.answer);
  }
}
