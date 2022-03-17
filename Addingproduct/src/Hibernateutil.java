import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Hibernateutil {

	static SessionFactory sessionFactory;

	public static SessionFactory buildSessionFactory() {

		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Product.class);
			

			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}
}