package org.system;

public class Desktop extends Computer {
public byte desktopSize() {
	return 24;
}
public static void main(String[] args) {
	Desktop des=new Desktop();
	des.computerModel();
	des.desktopSize();
	System.out.println(des.computerModel());
}
}
