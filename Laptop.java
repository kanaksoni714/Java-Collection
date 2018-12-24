//Laptop : company, model, operatingSystem, processor
public class Laptop {
	public String company;
	public int model;
	public int operatingSystem;
	public int processor;

	public Laptop(String company, int model, int operatingSystem, int processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + model;
		result = prime * result + operatingSystem;
		result = prime * result + processor;
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
		Laptop other = (Laptop) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model != other.model)
			return false;
		if (operatingSystem != other.operatingSystem)
			return false;
		if (processor != other.processor)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model
				+ ", operatingSystem=" + operatingSystem + ", processor="
				+ processor + "]";
	}

}
