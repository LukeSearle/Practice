/*
 * Copyright (c) 2013. MIDN Luke Searle, RAN
 *
 * University of New South Wales @ the Australian Defence Force Academy
 */

/**
 * Created by SEARLE on 10/12/13.
 */
public class Thai {
	private boolean dumb;
	private String name;
	private String town;
	private int age;

    public Thai() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Please do not use default constructor");
        //test
        // test 2
    }

	public Thai(boolean dumb, String name, String town, int age) {
		this.dumb = dumb;
		this.name = name;
		this.town = town;
		this.age = age;
	}

	// Standard methods
    public boolean isDumb() {
        return dumb;
    }

    public void setDumb(boolean dumb) {
        this.dumb = dumb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
	public String toString() {
		return "Thai{" +
				"dumb=" + dumb +
				", name='" + name + '\'' +
				", town='" + town + '\'' +
				", age=" + age +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Thai thai = (Thai) o;

		if (age != thai.age) return false;
		if (dumb != thai.dumb) return false;
		if (name != null ? !name.equals(thai.name) : thai.name != null) return false;
		if (town != null ? !town.equals(thai.town) : thai.town != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (dumb ? 1 : 0);
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (town != null ? town.hashCode() : 0);
		result = 31 * result + age;
		return result;
	}

}
