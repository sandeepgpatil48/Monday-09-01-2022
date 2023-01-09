package in.sandeep.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TicketResponse {

	private String name;
	private String dob;
	private String gender;
	private String doj;
	private String to;
	private String train;
	private String status;
	private Double price;
        private String address;
	
	public TicketResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTrain() {
		return train;
	}

	public void setTrain(String train) {
		this.train = train;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "TicketResponse [name=" + name + ", dob=" + dob + ", gender=" + gender + ", doj=" + doj + ", to=" + to
				+ ", train=" + train + ", status=" + status + ", price=" + price + "]";
	}
	
	
	
}
