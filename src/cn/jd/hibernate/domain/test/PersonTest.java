package cn.jd.hibernate.domain.test;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import cn.jd.hibernate.domain.Person;

public class PersonTest {
	@Test
	public void addPerson(){
		Person p = new Person();
		p.setName("Test");
		p.setBirthday(new Date());
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		 Transaction tx = session.beginTransaction();
		session.save(p);
		tx.commit();
		session.close();
		sessionFactory.close();
	}
}
