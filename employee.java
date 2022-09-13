
public class employee {
	int id;
	String name;
	double bal;
	String dptname;
	String location;
	public employee() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public employee(int id, String name, double bal,String dptname,String location) {
		super();
		this.id = id;
		this.name = name;
		this.bal = bal;
		this.dptname=dptname;
		this.location=location;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public String getDptname() {
		return dptname;
	}
		public void setDptname(String dptname) {
			this.dptname = dptname;
		}
			public String getLocation() {
				return location;
			}
				public void setLocation(String location) {
					this.location = location;
	

}
}