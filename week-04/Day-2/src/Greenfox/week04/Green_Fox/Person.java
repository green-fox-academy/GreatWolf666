package Greenfox.week04.Green_Fox;

public class Person {
  String name;
  int age;
  String gender;

  Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;

  }

  Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + " a " + age + " years old " + gender + ".");
  }
  public void getGoal(){
    System.out.println("My goal is: Live for the moment.");

  }
  protected final String getName(){
    return this.name;
  }
  protected final String getGender(){
    return this.gender;
  }
  protected final int getAge(){
    return this.age;
  }
}
