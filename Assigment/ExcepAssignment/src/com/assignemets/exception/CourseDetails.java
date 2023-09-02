package com.assignemets.exception;

public class CourseDetails {
	void showCourse(String course) {
		try {
			System.out.println("welcome to course");
			if(course.equals("java")) {
				System.out.println("course is "+course);
			}
			
		} catch (Exception e) {
			System.out.println("Exception");
			
			throw e;
		}
		finally {
			System.out.println("completed");
		}
	}

}
