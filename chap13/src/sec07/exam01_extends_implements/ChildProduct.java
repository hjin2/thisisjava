package sec07.exam01_extends_implements;

public class ChildProduct<T,M,C> extends Product<T,M>{
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
}
