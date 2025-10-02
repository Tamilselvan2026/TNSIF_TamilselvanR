package day3.entityclass;

public class Customer {
    private int id;       // Customer ID
    private String cname; // Customer Name
    private String city;  // Customer City

    // Getter & Setter for id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // Getter & Setter for cname
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }

    // Getter & Setter for city
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
	@Override
	public String toString() {
		return "Customer [id=" + id + ", cname=" + cname + ", city=" + city + "]";
	}
    
}
