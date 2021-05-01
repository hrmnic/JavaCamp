package javaDers2Hw;

public class Main {

	public static void main(String[] args) {
		
		courses course1=new courses(1,"Java + React","Engin Demiroğ","Java Yazılım geliştirme kampı",0);
		
		courses course2=new courses(2,"C# + Angular","Engin Demiroğ","C# Yazılım geliştirme kampı",0);
		
		courses[] courseList= {course1,course2};
		for(courses courselist : courseList) {
			System.out.println(courselist.id +" "+courselist.name+","+courselist.instructorName+","+courselist.description+","+courselist.price);
			
		}	
		coursesManager CourseManager=new coursesManager();
		CourseManager.addToCourse(course1);
		CourseManager.removed(course2);
		
	}
}
