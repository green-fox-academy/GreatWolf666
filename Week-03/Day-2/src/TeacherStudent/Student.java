package TeacherStudent;

public class Student {
  public static String learn;

  public static void learn() {
    learn = "Am I learning?";
  }

  public void question() {
    Teacher.answer();
  }
}
