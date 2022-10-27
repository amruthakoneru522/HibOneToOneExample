package com.infinite.HibOneToManyExample;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainProg {
	public static void main(String[] args) {
		SessionFactory sessionFactory = 
				new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		 
		Question question1=new Question();
		question1.setQname("What is Java");
		
		
		Answer ans1=new Answer();
		ans1.setAnswerName("Java is a Programming Language");
		ans1.setPostedBy("Prasanna Pappu");
		
		
		Answer ans2=new Answer();
		ans2.setAnswerName("By using java we can make any kind of Application");
		ans2.setPostedBy("Sunil Kumar");
		
		List<Answer> listAnswers1=new ArrayList<Answer>();
		listAnswers1.add(ans1);
		listAnswers1.add(ans2);
		
		question1.setAnswers(listAnswers1);
		session.save(question1);
		transaction.commit();
		System.out.println("Tables Created....");
	}
}
