package com.nt.dao;

import java.util.List;

import com.nt.domain.Person;
import com.nt.domain.Student;

public interface IPersonMgmt {
  public List<Person> loadDataUsingPesion();
  public void saveData(List<Person> list) throws Exception;
  public List<Student> loadDataUsingStudent();
}
