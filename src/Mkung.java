/*
 * Copyright (c) 2013. MIDN Luke Searle, RAN
 *
 * University of New South Wales @ the Australian Defence Force Academy
 */

/**
 * Created by SEARLE on 13/12/13.
 */
public class Mkung {

	private double weight;
	private String lastName;
	private int age;
	private String partner;

	public Mkung(String lastName, double weight, int age, String partner) {
		this.lastName = lastName;
		this.weight = weight;
		this.age = age;
		this.partner = partner;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	@Override
	public String toString() {
		return "Mkung{" +
				"weight=" + weight +
				", lastName='" + lastName + '\'' +
				", age=" + age +
				", partner='" + partner + '\'' +
				'}';
	}

	public static void main(String[] args) {
		Mkung m = new Mkung("Chi", 100, 29, "Prae");
		System.out.println(m);
	}
}
