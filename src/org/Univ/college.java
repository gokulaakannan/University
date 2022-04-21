package org.Univ;

public class college extends university {
	
	public void ug(String course) {
		System.out.println("course name is;"+ course);
	
}
	
public void pg(String dept) {
	System.out.println("department name is;"+dept);
}

public static void main(String[] args) {
	college c = new college();
	c.ug("BE mech");
	c.pg("Mechanical");
}

}
