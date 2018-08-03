//Class having distance in feets and inches & a sum method to add 2 distances
package televisionAssignment;

public class Distance {

	int feet;
	float inches;

	// method to set values of feet and inches
	public void set(int feet, float inches) {
		this.feet = feet;
		this.inches = inches;
	}

	public int getFeet() {
		return feet;
	}

	public float getInches() {
		return inches;
	}

	// method to display distance in feets and inches
	public void disp() {
		System.out.println(feet + " feet " + inches + " inches");
	}

	// method to add 2 distances from 2 objects
	Distance sum(Distance distance1, Distance distance2) {
		Distance distanceTemp = new Distance();

		distanceTemp.feet = distance1.feet + distance2.feet;
		distanceTemp.inches = distance1.inches + distance2.inches;

		if (distanceTemp.inches > 12) {
			distanceTemp.feet++;
			distanceTemp.inches -= 12;
		}
		return distanceTemp;
	}

}
