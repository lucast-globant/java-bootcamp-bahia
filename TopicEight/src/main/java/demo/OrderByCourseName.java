package demo;

import java.util.Comparator;

public class OrderByCourseName implements Comparator<Course> {

	@Override
	public int compare(Course arg0, Course arg1) {
		return arg0.getName().compareTo(arg1.getName());
	}
}
