// Complex Class to store floating point Complex no.(real and imaginery parts) and adding 2 complex no.s 
package televisionAssignment;

public class Complex {

	float real, imaginery;

	// method to set values of real and imaginery parts
	public void set(float real, float imaginery) {
		this.real = real;
		this.imaginery = imaginery;
	}

	// method to display real and imaginery parts
	public void disp() {
		System.out.println(real + " + i" + imaginery);
	}

	public float getReal() {
		return real;
	}

	public float getImaginery() {
		return imaginery;
	}

	// method to add to complex no.s from 2 Objects
	Complex sum(Complex complex1, Complex complex2) {
		Complex complexTemp = new Complex();

		complexTemp.real = complex1.real + complex2.real;
		complexTemp.imaginery = complex1.imaginery + complex2.imaginery;

		return complexTemp;
	}

}
