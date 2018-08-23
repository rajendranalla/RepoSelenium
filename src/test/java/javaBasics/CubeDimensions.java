package javaBasics;

public class CubeDimensions {
	int length;
	int breadth;
	int height;

	public int getCubeVolume() {

		return (length * breadth * height);
	}

	CubeDimensions() {
		length = 10;
		breadth = 20;
		height = 30;
	}

	CubeDimensions(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;

	}

}
