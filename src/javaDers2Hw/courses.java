package javaDers2Hw;

public class courses {
	

	public courses() {	
		
	}
	
	public courses(int id,String name,String instructorName,String description,double price) {
		this();
		this.id=id;
		this.name=name;
		this.instructorName=instructorName;
		this.description=description;
		this.price=price;
	
	}
	public int id;
	public String name;
	public String instructorName;  
	public String description;
	public double price;
}
