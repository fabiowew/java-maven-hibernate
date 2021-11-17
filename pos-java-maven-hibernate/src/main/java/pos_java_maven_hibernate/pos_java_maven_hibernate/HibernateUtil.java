package pos_java_maven_hibernate.pos_java_maven_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

	public static EntityManagerFactory factory = null;
	
	static {
		init();
	}
	
	private static void init() {
		
		
		try {

			if(factory == null) {
				factory = Persistence.createEntityManagerFactory("pos-java-maven-hibernate");
			}

		} catch (Exception e) {
			
		    e.printStackTrace();
		}
		
		
	}
	
	public static EntityManager getEntityManager() {
		
		return factory.createEntityManager();// Prove a parte de persistencia para o sistema

	}
	
	public static Object getPrimaryKey(Object entity) { //retorna a primary kay
		return factory.getPersistenceUnitUtil().getIdentifier(entity);
		
	}
	
}
