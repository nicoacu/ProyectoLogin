/*
ESTO NO LO TERMINE USANDO, SE PUEDE BORRAR
 */
package Main;

import Modelos.Usuarios;
import org.hibernate.Session;

/**
 *
 * @author User
 */
public class Datos {
    
    private Usuarios u;
    private HibernateUtil hibernateUtil;
    private Session session;
    
    public void agregarUsuario(){
        u = new Usuarios("juan", "pass", "juan02", "lopez");
        session = hibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(u);
        session.getTransaction().commit();
        session.close();
    }
    
}
