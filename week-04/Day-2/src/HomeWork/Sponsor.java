package HomeWork;

public class Sponsor {
  String name;
  int age;
  String gender;
  String company;
  int hiredStudents;


  Sponsor(String name, int age, String gender, String company, int hiredStudents) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
    this.hiredStudents = hiredStudents;
  }

  Sponsor() {
    this.name = "Elon Musk";
    this.age = 46;
    this.gender = "male";
    this.company = "SpaceX";
    this.hiredStudents = 0;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " years old " + gender + " who represents " + company +
        " and hired " + hiredStudents + " students so far.");
  }

  public void hire() {
    hiredStudents++;
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
}
