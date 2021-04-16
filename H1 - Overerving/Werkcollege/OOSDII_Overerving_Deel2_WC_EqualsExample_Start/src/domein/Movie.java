package domein;

// A class 'Movie' that implements Comparable 
public class Movie {

	private Double rating;
	private String name;
	private int year;

	public Movie(String nm, double rt, int yr) {
		setName(nm);
		setRating(rt);
		setYear(yr);
	}

	public Double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	private void setRating(Double rating) {
		this.rating = rating;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return String.format("%s %.2f %d", getName(), getRating(), getYear());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
}
