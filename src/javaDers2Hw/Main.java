package javaDers2Hw;

public class Main {

	public static void main(String[] args) {
		
		courses course1=new courses(1,"Java + React","Engin Demiro�","Java Yaz�l�m geli�tirme kamp�",0);
		
		courses course2=new courses();
		course2.id=2;
		course2.name="C# + Angular";
		course2.instructorName="Engin Demiro�";
		course2.description="C# Yaz�l�m geli�tirme kamp�";
		course2.price=0;
		
		courses[] courseList= {course1,course2};
		for(courses courselist : courseList) {
			System.out.println(courselist.id +" "+courselist.name+","+courselist.instructorName+","+courselist.description+","+courselist.price);
			
		}
		
		
		
		category category1=new category(5,"Programlama");
		

	}

}
