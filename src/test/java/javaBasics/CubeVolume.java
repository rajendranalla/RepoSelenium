package javaBasics;

public class CubeVolume {

	public static void main(String[] args) {

		CubeDimensions cd1 = new CubeDimensions();
		System.out.println(cd1.getCubeVolume());

		CubeDimensions cd2 = new CubeDimensions(30, 30, 30);
		System.out.println(cd2.getCubeVolume());
	}

}
