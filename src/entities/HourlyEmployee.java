package entities;

public class HourlyEmployee {

	private String name;
	private Integer hours;
	private Double valuePerHour;
	
	public HourlyEmployee() {		
	}
	
	public HourlyEmployee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public double payment() {
		return hours * valuePerHour;
	}
	
	@Override
	public String toString() {
		return name
				+ ", - $ "
				+ String.format("%.2f", payment());
	}
}