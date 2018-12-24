//Television : company, type (LCD, LED, Plasma), 3D enabled, price

public class Television {
	public String company;
	public String type;
	private boolean Dimension;
	public int price;

	public Television(String company, String type, boolean dimension, int price) {
		super();
		this.company = company;
		this.type = type;
		setDimension(false);
		this.price = price;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (Dimension ? 1231 : 1237);
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Television other = (Television) obj;
		if (Dimension != other.Dimension)
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (price != other.price)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type
				+ ", Dimension=" + Dimension + ", price=" + price + "]";
	}

	public boolean isDimension() {
		return Dimension;
	}

	public void setDimension(boolean dimension) {
		Dimension = dimension;
	}

}
