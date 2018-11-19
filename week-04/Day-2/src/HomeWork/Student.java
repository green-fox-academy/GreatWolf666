package HomeWork;

public class Student {
  String name;
  int age;
  String gender;
  String previousOrganization;
  int skippedDays;


  Student(String name, int age, String gender, String previousOrganization, int skippedDays) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    this.skippedDays = skippedDays;
  }

  Student() {
    this.name = "John Doe";
    this.age = 20;
    this.gender = "male";
    this.previousOrganization = "BME";
    this.skippedDays = 0;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " years old " + gender + " from " + previousOrganization
        + " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

}
