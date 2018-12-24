//CellPhone : company, model, description, operatingSstem, price

public class CellPhone {
	private String company;
	private int model;
	private String description;
	private String operatingSystem;
	private int price;

	public CellPhone(String company, int model, String description,
			String operatingSystem, int price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + model;
		result = prime * result
				+ ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
		result = prime * result + price;
		return result;
	}

	/* (non-Javadoc)
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
		CellPhone other = (CellPhone) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (model != other.model)
			return false;
		if (operatingSystem == null) {
			if (other.operatingSystem != null)
				return false;
		} else if (!operatingSystem.equals(other.operatingSystem))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CellPhone [company=" + company + ", model=" + model
				+ ", description=" + description + ", operatingSystem="
				+ operatingSystem + ", price=" + price + "]";
	}
}
