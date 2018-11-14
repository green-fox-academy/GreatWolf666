package TeacherStudent;

public class Teacher {
  public static String answer;

  public static void answer() {
    answer = "That depends...";
  }

  public void teach() {
    Student.learn();
  }
}
