package com.nt.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.domain.Person;
import com.nt.domain.Student;
import com.nt.utials.HibernateUtials;

public class IPersonMgmtImpl implements IPersonMgmt {

	@Override
	public List<Person> loadDataUsingPesion() {
		String QetPersonDetail_pesion = "from Person";
		String QetPersonDetail_Student = "from Student";
		List<Person> listperson = null;
		Session ses = HibernateUtials.getSession();
		try {
			Query query = ses.createQuery(QetPersonDetail_pesion);
			listperson = ((org.hibernate.query.Query) query).list();
		} catch (HibernateException e) {
			// TODO: handle exception
		}
		return listperson;
	}

	

	@Override
	public void saveData(List<Person> list) throws Exception {
		Session ses = HibernateUtials.getSession();
		Boolean flag = false;
		// create transaction object
		Transaction tx = ses.beginTransaction();

		try {
			list.forEach(p -> {
				ses.save(p);
				System.out.println("savend");
			});
			flag = true;
		} catch (HibernateException e) {
			flag = false;
			e.printStackTrace();

		} finally {
			if (flag) {
				tx.commit();
				System.out.println(list.size() + " details saved");
			} else {
				tx.rollback();
				System.out.println("object are not saved");
			}
		}
	}

	@Override
	public List<Student> loadDataUsingStudent() {
		String QetPersonDetail_pesion = "from Person";
		String QetPersonDetail_Student = "from Student";
		List<Student> listperson = null;
		Session ses = HibernateUtials.getSession();
		try {
			Query query = ses.createQuery(QetPersonDetail_Student);
			listperson = ((org.hibernate.query.Query) query).list();
		} catch (HibernateException e) {
			// TODO: handle exception
		}
		return listperson;
	}

}
