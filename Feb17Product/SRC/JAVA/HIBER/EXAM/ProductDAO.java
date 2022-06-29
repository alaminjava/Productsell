/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber.exam;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author APCL-LAB-1
 */
public class ProductDAO {
//    public void doAdd(Product stu){
//        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        s.beginTransaction();
//        s.save(stu);
//        s.getTransaction().commit();
//        s.close();
//    }
    public void doUpdate(Product stu){
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(stu);
        s.getTransaction().commit();
        s.close();
    }
    public void doDelete(Product stu){
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(stu);
        s.getTransaction().commit();
        s.close();
    }

//    public List<Product> findAllproduct() {
//        List<Product> li = new ArrayList<Product>();
//        Session s = NewHibernateUtil.getSessionFactory().openSession();
//        Query q = s.createQuery("from Product");
//        li = q.list();
//        return li;
//    }
}
