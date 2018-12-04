/*
CSC 142
Justin Byun No partner at this time
HW#08 Last updated 11/18
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
*/

public class TimeSpan {
  // firelds
  private int hours;
  private int minutes;

  // Constructs a time span with the given interval.
  // pre: hours >= 0 && minutes >= 0
  public TimeSpan(int hours, int minutes) {
      this.hours = 0;
      this.minutes = 0;
      substract(hours, minutes);
  }

  public void substract(int hours, int minutes) {
  // As you don't know how much will be substracted, convert to minute first
    int finalMin = (this.hours * 60) + (this.minutes) - (hours * 60) + minutes;

    this.hours = finalMin / 60;
    this.minutes = finalMin % 60;
}
//   Returns whether o is a TimeSpan representing the same
//   number of hours and minutes as this TimeSpan object.
  public boolean equals(Object o) {
      if (o instanceof TimeSpan) {
          TimeSpan other = (TimeSpan) o;
          return hours == other.hours &&
                 minutes == other.minutes;
      } else {   // not a TimeSpan object
          return false;
      }
  }

  // Returns a String for this time span such as "6h15m".
  public String toString() {
      return hours + "h" + minutes + "m";
  }
}
