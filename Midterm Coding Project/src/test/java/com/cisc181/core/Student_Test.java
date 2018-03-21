package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {


	static ArrayList<Student> students = new ArrayList<Student>();
	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Semester> semesters = new ArrayList<Semester>();
	static ArrayList<Section> sections = new ArrayList<Section>();

	static ArrayList<Enrollment> chem111 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> chem112 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> phyysics207 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> physics208 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> nurse111 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> nurse222 = new ArrayList<Enrollment>();


	public static Date newDate(int yr, int mon, int day) {
		Calendar cal2 = Calendar.getInstance();
		cal2.set(yr, mon, day);
		return cal2.getTime();
	}

	@BeforeClass
	public static void setup() throws PersonException {
		Course chem = new Course(UUID.randomUUID(), "Chem", 100, eMajor.CHEM);
		Course physics = new Course(UUID.randomUUID(), "Phyics", 100, eMajor.PHYSICS);
		Course nurse = new Course(UUID.randomUUID(), "Nursing", 100, eMajor.NURSING);

		courses.add(chem);
		courses.add(physics);
		courses.add(nurse);

		Semester fall17 = new Semester(UUID.randomUUID(), newDate(2017, 9, 1), newDate(2017, 12, 14));
		Semester spring18 = new Semester(UUID.randomUUID(), newDate(2018, 2, 5), newDate(2018, 5, 24));

		semesters.add(spring17);
		semesters.add(fall16);

		Section fallchem = new Section(chem.getCourseID(), fall16.getSemesterID(), UUID.randomUUID(), 101);
		Section fallphysics = new Section(physics.getCourseID(), fall16.getSemesterID(), UUID.randomUUID(), 102);
		Section fallns = new Section(ns.getCourseID(), fall16.getSemesterID(), UUID.randomUUID(), 103);

		Section springchem = new Section(chem.getCourseID(), spring17.getSemesterID(), UUID.randomUUID(), 104);
		Section springphysics = new Section(physics.getCourseID(), spring17.getSemesterID(), UUID.randomUUID(), 105);
		Section springCns = new Section(ns.getCourseID(), spring17.getSemesterID(), UUID.randomUUID(), 106);

		sections.add(fallchem);
		sections.add(fallphysics);
		sections.add(fallnurse);
		sections.add(springchem);
		sections.add(springphysics);
		sections.add(springnurse);

		Student stud1 = new Student("Alex", "Cray", "Kuzokowski", newDate(1997, 1, 13), eMajor.COMPSI, "CHEME",
				"(302)-486-3470", "niceboi", UUID.randomUUID());

		Student stud2 = new Student("Ryan","Spicy","Wood", newDate(1998, 3, 2), eMajor.COMPSI,
				"BIO", "(326)-334-8869", "cool", UUID.randomUUID());

		Student stud3 = new Student("Luke","Jedi","Walker"", newDate(1988, 3, 3), eMajor.CHEM,
				"Eleg", "(425)-444-0868", "king", UUID.randomUUID());
		Student stud4 = new Student("Marty","J"," Mcfly", newDate(1997, 4, 11), eMajor.NURSING, "TimeTravel",
				"(302)-550-4240", "spaceboi", UUID.randomUUID());
		Student stud5 = new Student("Spid", "ER", "Man", newDate(1997, 5, 5), eMajor.PHYSICS,
				"Webby", "(245)-088-7240","spidey", UUID.randomUUID());
		Student stud6 = new Student("Jak", "E", "4Chan", newDate(1996, 11, 7), eMajor.NURSING,
				"jackiefu", "(720)-799-3456", "fightme", UUID.randomUUID());
		Student stud7 = new Student("Pennywise ","Mc","Clown", newDate(1998, 7, 7), eMajor.PHYSICS, "crap",
				"(666)-66-888", "nightmare", UUID.randomUUID());
		Student stud8 = new Student("Ben","H","Swolo", newDate(1997, 9, 16), eMajor.BUSINESS, "dark",
				"(264)-554-9287", "killthisdad", UUID.randomUUID());
		Student stud9 = new Student("Spongebob","S","Squarepants", newDate(1999, 12, 25), eMajor.COMPSI,
				"youlikekrabbypattiesdontyaaa", "(308)-000-6640", "bikiniboi", UUID.randomUUID());
		Student stud10 = new Student("Ten","Is","Toomuch", newDate(1995, 10, 11), eMajor.CHEM, "tedious",
				"(124)-678-1212", "codingsboring", UUID.randomUUID());
		students.add(stud1);
		students.add(stud2);
		students.add(stud3);
		students.add(stud4);
		students.add(stud5);
		students.add(stud6);
		students.add(stud7);
		students.add(stud8);
		students.add(stud9);
		students.add(stud10);
		ArrayList<Integer> gradeSet1 = new ArrayList<Integer>(Arrays.asList(91, 88, 66));
		ArrayList<Integer> gradeSet2 = new ArrayList<Integer>(Arrays.asList(87, 79, 50));
		ArrayList<Integer> gradeSet3 = new ArrayList<Integer>(Arrays.asList(99, 88, 87));
		for (int k = 0; k < students.size(); k++) {
			chem111.add(new Enrollment(sections.get(0).getSectionID(), students.get(k).getStudentID()));
			chem111.get(k).setGrade(gradeSet1.get(k));
			chem112.add(new Enrollment(sections.get(1).getSectionID(), students.get(k).getStudentID()));
			chem112.get(k).setGrade(gradeSet2.get(k));
			phyysics207.add(new Enrollment(sections.get(2).getSectionID(), students.get(k).getStudentID()));
			phyysics207.get(k).setGrade(gradeSet3.get(k));
			physics208.add(new Enrollment(sections.get(3).getSectionID(), students.get(k).getStudentID()));
			physics208.get(k).setGrade(gradeSet1.get(k));
			nurse111.add(new Enrollment(sections.get(4).getSectionID(), students.get(k).getStudentID()));
			nurse111.get(k).setGrade(gradeSet2.get(k));
			nurse112.add(new Enrollment(sections.get(5).getSectionID(), students.get(k).getStudentID()));
			nurse112.get(k).setGrade(gradeSet3.get(k));
		}
	}
	public double calcStudentGPA(ArrayList<Enrollment> chem111, ArrayList<Enrollment> chem112, ArrayList<Enrollment> phyysics207,
			ArrayList<Enrollment> physics208, ArrayList<Enrollment> nurse111, ArrayList<Enrollment> nurse222, int Student) {
		
		final int COURSENUM = 6;
		
		double GPAAVG = 0;
		if ((chem111.get(Student).getGrade() + chem112.get(Student).getGrade() + physics207.get(Student).getGrade()
				+ phyysics207.get(Student).getGrade() + nurse111.get(Student).getGrade() + nurse222.get(Student).getGrade())
				/ COURSENUM >= 95) {
			GPAAVG = 4.0;
		} else if ((chem111.get(Student).getGrade() + chem112.get(Student).getGrade() + physics207.get(Student).getGrade()
				+ phyysics207.get(Student).getGrade() + nurse111.get(Student).getGrade() + nurse222.get(Student).getGrade())
				/ COURSENUM >= 90) {
			GPAAVG = 3.75;
		} else if ((chem111.get(Student).getGrade() + chem112.get(Student).getGrade() + physics207.get(Student).getGrade()
				+ phyysics208.get(Student).getGrade() + nurse111.get(Student).getGrade() + nurse222.get(Student).getGrade())
				/ COURSENUM >= 85) {
			GPAAVG = 3.50;
		} else if ((chem1.get(Student).getGrade() + chem112.get(Student).getGrade() + physics207.get(Student).getGrade()
				+ phyysics208.get(Student).getGrade() + nurse111.get(Student).getGrade() + nurse222.get(Student).getGrade())
				/ COURSENUM >= 80) {
			GPAAVG = 3.00;
		} else if ((chem1.get(Student).getGrade() + chem2.get(Student).getGrade() + physics207.get(Student).getGrade()
				+ phyysics208.get(Student).getGrade() + nurse111.get(Student).getGrade() + nurse222.get(Student).getGrade())
				/ COURSENUM >= 75) {
			GPAAVG = 2.50;
		} else if ((chem111.get(Student).getGrade() + chem112.get(Student).getGrade() + physics207.get(Student).getGrade()
				+ phyysics208.get(Student).getGrade() + nurse111.get(Student).getGrade() + nurse222.get(Student).getGrade())
				/ COURSENUM >= 70) {
			GPAAVG = 2.00;
		} else if ((chem111.get(Student).getGrade() + chem112.get(Student).getGrade() + physics207.get(Student).getGrade()
				+ phyysics208.get(Student).getGrade() + nurse111.get(Student).getGrade() + nurse222.get(Student).getGrade())
				/ COURSENUM >= 65) {
			GPAAVG = 1.50;
		} else if ((chem111.get(Student).getGrade() + chem112.get(Student).getGrade() + physics207.get(Student).getGrade()
				+ phyysics208.get(Student).getGrade() + nurse111.get(Student).getGrade() + nurse222.get(Student).getGrade())
				/ COURSENUM >= 60) {
			GPAAVG = 1.00;
		} else {
			GPAAVG = 0.00;
		}
		return GPAAVG;
	}
	@Test
	public void StudentGPATest() {
		assertEquals(4.0, calcStudentGPA(chem111, chem112, physics207, phyysics208, nurse111, nurse222, 0), .001);
		assertEquals(2.0, calcStudentGPA(chem111, chem112, physics207, phyysics208, nurse111, nurse222, 1), .001);
		assertEquals(0.0, calcStudentGPA(chem111, chem112, physics207, phyysics208, nurse111, nurse222, 2), .001);
		assertEquals(3.75, calcStudentGPA(chem111, chem112, physics207, phyysics208, nurse111, nurse222, 3), .001);
		assertEquals(2.0, calcStudentGPA(chem111, chem112, physics207, phyysics208, nurse111, nurse222, 4), .001);
		assertEquals(3.5, calcStudentGPA(chem111, chem112, physics207, phyysics208, nurse111, nurse222, 5), .001);
		assertEquals(2.5, calcStudentGPA(chem111, chem112, physics207, phyysics208, nurse111, nurse222, 6), .001);
		assertEquals(1.5, calcStudentGPA(chem111, chem112, physics207, phyysics208, nurse111, nurse222, 7), .001);
		assertEquals(3.0, calcStudentGPA(chem111, chem112, physics207, phyysics208, nurse111, nurse222, 8), .001);
		assertEquals(1.0, calcStudentGPA(chem111, chem112, physics207, phyysics208, nurse111, nurse222, 9), .001);
	}
	public static double CourseGr(ArrayList<Enrollment> courses) {
		double avg = 0;
		double courseAvg = 0;
		for (int y = 0; y < students.size(); y++) {
			avg += courses.get(y).getGrade();
			courseAvg = (avg / students.size());
		}
		return courseAvg;
	}
	@Test
	public void testCourseGr() {
		assertEquals(75.4, CourseGr(chem111), .01);
		assertEquals(76.7, CourseGr(chem112), 01);
		assertEquals(75.2, CourseGr(physics207), .01);
		assertEquals(75.4, CourseGr(phyysics208), .01);
		assertEquals(76.7, CourseGr(nurse111), 01);
		assertEquals(75.2, CourseGr(nurse222), .01);
	}
	public static void ChangeOfMajor(eMajor maj, Student stu) {
		stu.setMajor(maj);
	}
	@Test
	public void testMajorChangeStudent() {
		ChangeOfMajor(eMajor.CHEM, students.get(5));
		assertEquals(eMajor.CHEM, students.get(5).getMajor());
	}
}
