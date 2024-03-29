package in.balamt.practice.designpattern.creational.builder;

public class House implements HousePlan {

	private String basement;
	private String structure;
	private String roof;
	private String interior;

	public void setBasement(String basement) {
		this.basement = basement;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}

	public void setInterior(String interior) {
		this.interior = interior;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("House \nbasement=");
		builder.append(basement);
		builder.append(", \nstructure=");
		builder.append(structure);
		builder.append(", \nroof=");
		builder.append(roof);
		builder.append(", \ninterior=");
		builder.append(interior);
		return builder.toString();
	}
	
	

}
