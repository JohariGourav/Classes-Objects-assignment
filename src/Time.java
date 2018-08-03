//Class having Time in hours and minutes & method to add 2 Times
package televisionAssignment;

public class Time {

	int hours;
	int minutes;

	// method to set Time in hours and minutes
	public void setTime(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}

	public int getFeet() {
		return hours;
	}

	public int getInches() {
		return minutes;
	}

	// method to display time
	public void showTime() {
		System.out.println(hours + " hours " + minutes + " minutes");
	}

	// method to add two Times using 2 Objects
	Time sum(Time time1, Time time2) {
		Time timeTemp = new Time();

		timeTemp.hours = time1.hours + time2.hours;
		timeTemp.minutes = time1.minutes + time2.minutes;

		if (timeTemp.minutes > 60) {
			timeTemp.hours++;
			timeTemp.minutes -= 60;
		}
		return timeTemp;
	}

}
