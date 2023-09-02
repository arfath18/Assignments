package com.assignemets.exception;

public class CourMain {

	public static void main(String[] args) {
		CourseDetails course=new CourseDetails();
		course.showCourse("java");
		try {
			
		} catch (Exception e) {
			System.out.println("course details not found");
			
		}
	}

}
