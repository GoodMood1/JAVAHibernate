package pack;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import pack.entities.UsersEntity;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		String hql = "from UsersEntity";
		Query<UsersEntity> query = session.createQuery(hql, UsersEntity.class);
		System.out.println(query.getQueryString());
		query.list().forEach(System.out::println);
		//session.close();
		UsersEntity user = new UsersEntity(0, "A", "aa", new Date(), true);
		Transaction transaction = session.beginTransaction();
		session.persist(user);
		transaction.commit();
	}
}
