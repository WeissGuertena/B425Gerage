package vo;

import po.InstitutionPO;

public class InstitutionVO {

	private String institutionID;
	private String city;
	private String name;

	public InstitutionVO(String institutionID, String city, String Name) {
		this.institutionID = institutionID;
		this.name = name;
		this.city = city;

	}

	public InstitutionVO(InstitutionPO po) {
		this(po.getInstitutionID(), po.getCity(), po.getName());
	}

	public InstitutionPO transToPO() {
		return new InstitutionPO(institutionID, city, name);
	}

	public String getInstitutionID() {
		return institutionID;
	}

	public void setInstitutionID(String institutionID) {
		this.institutionID = institutionID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((institutionID == null) ? 0 : institutionID.hashCode());
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
		InstitutionVO other = (InstitutionVO) obj;
		if (institutionID == null) {
			if (other.institutionID != null)
				return false;
		} else if (!institutionID.equals(other.institutionID))
			return false;
		return true;
	}

}
