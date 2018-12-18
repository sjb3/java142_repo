public class Date {
  private int month;
  private int day;
  private int year;

  public Date() {
    month = 1;
    day = 1;
    year = 1900;
  }

  public Date(int newDay, int newMonth, int newYear) {
    this.day = newDay;
    this.month = newMonth;
    this.year = newYear;
  }
  // setter

  public void setMonth(int month) {
    if(month <1 || month >12) {
      throw new IllegalArgumentException();
    }
    this.month = month;
  }
  public void setDay(int day) {
    if((this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 ||
        this.month == 10 || this.month == 12) && this.day < 32 ) {
          this.day = day;
    } else if ((this.month == 2) && this.day < 29) {
      this.day = day;
    } else {
      this.day = day;
    }
  }

  // getter
  public int getMonth() {
    return this.month;
  }
  public int getDay() {
    return this.day;
  }
  public int getYear() {
    return this.year;
  }

  // method
  public boolean equals(Date x) {
    if((this.moneth == x.month) &&
      (this.day == x.day) &&
      (this.year == x.year)) {
        return true;
      } else {
        return false;
      }
  }
  public String toString() {
    return "_" + this.month + "_" + this.day + "_" + this.year;
  }
}

public class MainDate {
  public static void main(String[] args) {
    Date day1 = new Date(5, 25, 1975);
    Date day2 = new Date(12, 14, 1973);

    System.out.println(day1.toString());
    System.out.println(day2.toString());

    String returnVal = "";
    if(day1.equals(day2)) {
      returnVal += true;
    } else {
      returnVal += false;
    }
  }
}
