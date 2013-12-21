/*
 * Copyright (c) 2013. MIDN Luke Searle, RAN
 *
 * University of New South Wales @ the Australian Defence Force Academy
 */

/**
 * Created with IntelliJ IDEA.
 * User: SEARLE
 * Date: 3/12/13
 * Time: 10:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class Door {

	private String name;
	private double width, height;
	private double thickness;
	private boolean open, locked;

	public final static int count = 0;

	public Door() {
		name = "SET A NAME";
		height = -1;
		width = -1;
		thickness = -1;
		locked = false;
		open = false;
	}

	public Door(String name, double height, double width, double thickness, boolean open, boolean locked) {
		this.name = name;
		this.height = height;
		this.width = width;
		this.thickness = thickness;
		this.open = open;
		this.locked = locked;
	}

	public void lock() {
		if (!locked) {
			if (!open) {
				locked = true;
				System.out.println("Door locked");
			} else {
				System.out.println("Can't lock the door while open.");
			}
		} else {
			System.out.println("Door already locked");
		}
	}

	public void unlock() {
		if (locked) {
			if (!open) {
				locked = false;
				System.out.println("Door unlocked");
			} else {
				System.out.println("Can't unlock the door while open.");
			}
		} else {
			System.out.println("Door already unlocked");
		}
	}

	public void open() {
		if (!open) {
			if (!locked) {
				open = true;
				System.out.println("Door opened");
			} else {
				System.out.println("Can't open the door while locked");
			}
		} else {
			System.out.println("Door already open");
		}
	}

	public void close() {
		if (open) {
			open = false;
			System.out.println("Door closed");
		} else {
			System.out.println("Door already closed");
		}
	}

	public double getVolume() {
		//double volume = ;
		return height * width * thickness;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public void setThickness(double thickness) {
		this.thickness = thickness;
	}

	public double getThickness() {
		return thickness;
	}

	public String toString() {
		String result = "\n\nDoor name: " + name + "\nHeight: " + height + "\nWidth: " + width + "\nThickness: " + thickness;
		if (open) {
			result += "\nDoor is open.";
		} else {
			result += "\nDoor is closed";
		}
		if (locked) {
			result += "\nDoor is locked.\n\n";
		} else {
			result += "\nDoor is unlocked\n\n";
		}

		return result;
	}

	public static void main(String[] args) {
		Door d = new Door("front", 100, 45, 3, false, false);
		System.out.println(d.getVolume());


	}
}
