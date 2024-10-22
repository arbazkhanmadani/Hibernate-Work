package com.hib.tut.calls;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

import com.hib.tut.dao.InternsDAO;
import com.hib.tut.dao.ManyToManyEmpDepDAO;
import com.hib.tut.dao.OneManyEmpDepDAO;
import com.hib.tut.dao.StudentsDAO;
import com.hib.tut.entities.Department;
import com.hib.tut.entities.Developer;
import com.hib.tut.entities.Employee;
import com.hib.tut.entities.Interns;
import com.hib.tut.entities.Joining;
import com.hib.tut.entities.Project;
import com.hib.tut.entities.Students;
import com.hib.tut.helper.SessionFactoryProvider;

public class App {
	
	
    @SuppressWarnings("deprecation")
	public static void main( String[] args ){
    
    	
    	/*===================JOINS EXAMPLE===================*/
    	
    	/*=========OneToOne================*/
    	/*Students student = new Students();
    	student.setRollNo(100);
    	student.setAge(22);
    	student.setName("Arbaz");
    	student.setCollege("LNCt");
    	student.setFee(61000.0);
    
    	Interns intern = new Interns();
    	intern.setInternId(1000);
    	intern.setDepartment("Software Engineer");
    	intern.setRole("Web Developer");
    	intern.setStudents(student);
    	student.setInterns(intern);
    	
    	StudentsDAO.save(student);
    	//InternsDAO.save(intern);
    	
    	

    	/*=========OneToMany================*/
    	/*Employee e1 = new Employee();
    	e1.seteId(100);
    	e1.seteAge(22);
    	e1.seteName("Arbaz Khan");
    	e1.seteSalary(100000);
    	
    	Employee e2 = new Employee();
    	e2.seteId(101);
    	e2.seteAge(21);
    	e2.seteName("Sarfaraz Khan");
    	e2.seteSalary(100000);
    	
    	Employee e3 = new Employee();
    	e3.seteId(102);
    	e3.seteAge(22);
    	e3.seteName("Tabish dehlvi");
    	e3.seteSalary(100000);
    	
    	Employee e4 = new Employee();
    	e4.seteId(104);
    	e4.seteAge(22);
    	e4.seteName("Adnan Khan");
    	e4.seteSalary(100000);
    	
    	Set<Employee> set = Set.of(e1,e2,e3,e4);
    	
    	Department d = new Department();
    	d.setDepId(1000);
    	d.setDepDesignation("Software Enginer");
    	d.setDepRole("Backend Developer");
    	d.setEmployee(set);
    	
    	e1.setDepartment(d);
    	e2.setDepartment(d);
    	e3.setDepartment(d);
    	e4.setDepartment(d);
    	
    	OneManyEmpDepDAO.saveDep(d);
    	*/
    	
    	
    	/*=========ManyToMany================*/
    	/*Developer d1 = new Developer();
    	d1.setDevId(100);
    	d1.setDevAge(22);
    	d1.setDevName("Arbaz Khan");
    	d1.setDevSalary(100000);
    	
    	Developer d2 = new Developer();
    	d2.setDevId(101);
    	d2.setDevAge(21);
    	d2.setDevName("SARFARAZ Khan");
    	d2.setDevSalary(100000);
    	
    	Project p1 = new Project();
    	p1.setProId(1000);
    	p1.setProName("Sopify website");
    	p1.setProDuration("12 month");
    	
    	Project p2 = new Project();
    	p2.setProId(2000);
    	p2.setProName("Gemobi application");
    	p2.setProDuration("24 month");
    	
    	Set<Developer> s1 = Set.of(d1,d2);
    	List<Project> s2 = List.of(p1,p2);
    	
    	d1.setProject(s2);
    	d2.setProject(s2);
    	p1.setDevloper(s1);
    	p2.setDevloper(s1);
    	
    	//ManyToManyEmpDepDAO.saveDev(d1);
    	Developer dev = ManyToManyEmpDepDAO.fetchDev(100);
    	System.out.println(dev.getDevId()+" | "+dev.getDevName()+" | "+dev.getDevSalary()+" | "+dev.getDevAge());
    	
    	//here we have to it bcz the return type is LIST.
    	List<Project> al = dev.getProject();
    	al.forEach((o)->System.out.println(o.getProDuration()+" | "+o.getProName()));
    	*/
    	
    	
    	/*==============QueryEcample================*/
    	//OneManyEmpDepDAO.saveDep(d1);
    	//OneManyEmpDepDAO.saveDep(d2);
    	
    	//Add======
    	Date d = new Date(0, 0, 0);
    	d.setHours(12);
    	d.setMinutes(30);
    	d.setSeconds(50);
    	Students stud = new Students(102,22,"Arbaz","MU",61000.0);
    	
    	Joining j = new Joining(new Date(2024, 6, 20), new Date(2024, 12, 20),d);
    	Interns i = new Interns(2002,"Project Management","DevOps", stud,j);
    	stud.setInterns(i);
    	StudentsDAO.save(stud);
    	//InternsDAO.save(i);
    	/*
    	
    	//Update====
    	Students stud1 = new Students(109,21,"Sarfaraz Khan","MU",185000);
    	StudentsDAO.update(stud1);
    	
    	
    	//delete=====
    	//boolean flag = StudentsDAO.delete(s);
    	
    	
    	//Fetch=====
    	Students s = StudentsDAO.fetch(105);
    	System.out.println(s);
    	
    	//FetchAll=====
    	List al = StudentsDAO.fetchAll();
    	al.forEach(o->System.out.println(o));
    	
    	//fetchAllRollNoGTThan104=========
    	List<Students> l = StudentsDAO.fetchAllRollNoGTThan104();
    	l.forEach(o->System.out.println(o.getRollNo()));
    	
    	//ExampleOfNamedQuery=======
    	List<Students> al2 = StudentsDAO.namedQueryExample();
    	al2.forEach(o->System.out.println(o.getCollege() +" | "+ o.getName()));
    	*/
    	
    	SessionFactoryProvider.closeSession();
    	
    	}
}
