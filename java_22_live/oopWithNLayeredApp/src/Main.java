import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DataBaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

    public static void main(String[] args) throws Exception {

        Product product1=new Product(1,"Galaxy 22",10);

       Logger[] loggers={};

        ProductManager productManager=new ProductManager(new JdbcProductDao(),loggers);
        productManager.add(product1);






    }
}