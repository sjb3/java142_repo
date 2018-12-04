/*
CSC142
Justin Byun,  No partner at this time
HW#09 Last updated 11/27
Used IDE: MS VS_Code
*/

public class Employee {
  public void applyForVacation() {
    System.out.println("Use the yellow vacation form.");
  }
  public void showHours() {
    System.out.println("I work 40 hours per week.");
  }
  public void showSalary() {
    System.out.prinlnt("My salary is $40,000.0");
  }
  public void showVacation() {
    System.out.println("I receive 2 weeks vacation.");
  }
}

public class Marketer extends Employee {
  // override here
  public void showSalary() {
    System.out.println("My salary is $50,000.0");
  }
  public void advertise() {
    System.out.println("Act now, while supplies last!");
  }
}