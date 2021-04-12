package com.nt.test;

import java.util.ArrayList;
import java.util.List;

import com.nt.dao.IPersonMgmt;
import com.nt.dao.PersionDaoFactory;
import com.nt.domain.Employee;
import com.nt.domain.Person;
import com.nt.domain.Student;

public class PersonMainTest {
	public static void main(String[] args) throws Exception {
      List<Person> listOfPerson= new ArrayList<Person>();
      Student st=new Student();
      st.setPersonNemae("shailendra");
      st.setAddress("patna");
      st.setCourse("java");
      st.setFee(2000.9);
      Employee emp=new Employee();
      emp.setPersonNemae("shamsad");
      emp.setDeptNo(10);
      emp.setDisignation("develope");
      emp.setSalary(10000.0);
      Student st1=new Student();
      st1.setPersonNemae("shailendra");
      st1.setAddress("patna");
      st1.setCourse("php");
      st1.setFee(1500.9);
      Employee emp1=new Employee();
      emp1.setPersonNemae("puspal");
      emp1.setDeptNo(10);
      emp1.setDisignation("salesman");
      emp1.setSalary(10000.0);
      listOfPerson.add(emp1);
      listOfPerson.add(emp);
      listOfPerson.add(st1);
      listOfPerson.add(st);
      //create dao class object
      IPersonMgmt dao= PersionDaoFactory.getInstance();
      dao.saveData(listOfPerson);;
      System.out.println(dao.loadDataUsingPesion());
      System.out.println(dao.loadDataUsingStudent());
	}
}
