package hiber.exam;
// Generated Feb 17, 2020 11:48:10 AM by Hibernate Tools 4.3.1

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Query;
import org.hibernate.Session;



@ManagedBean
@SessionScoped

public class Product  implements java.io.Serializable {


     private String pid;
     private String pname;
     private String brand;
     private String origin;
     private List <Product> allProducts = new ArrayList<Product>();

    public Product() {
    }

	
    public Product(String pid) {
        this.pid = pid;
    }
    public Product(String pid, String pname, String brand, String origin) {
       this.pid = pid;
       this.pname = pname;
       this.brand = brand;
       this.origin = origin;
    }
   
    public String getPid() {
        return this.pid;
    }
    
    public void setPid(String pid) {
        this.pid = pid;
    }
    public String getPname() {
        return this.pname;
    }
    
    public void setPname(String pname) {
        this.pname = pname;
    }
    public String getBrand() {
        return this.brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getOrigin() {
        return this.origin;
    }
    
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public void doInsert() {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(this);
        s.getTransaction().commit();
        s.close();
    }

    public void doUpdate() {
        ProductDAO ob = new ProductDAO();
        ob.doUpdate(this);
    }

    public void doDelete() {
        ProductDAO ob = new ProductDAO();
        ob.doDelete(this);

    }
    public List <Product> getAllProducts() {
        List<Product> li = new ArrayList<Product>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from Product");
        li = q.list();
        return li;
    }

    public void setAllProducts(List <Product> allProducts) {
        this.allProducts = allProducts;
    }




}


