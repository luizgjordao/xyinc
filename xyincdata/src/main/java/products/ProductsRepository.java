package products;

import entities.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ProductsRepository implements IProductsRepository {

    @Autowired
    private SessionFactory session;

    @Transactional
    public Product add(Product product) {
        session.getCurrentSession().save(product);
        return product;
    }

    @Transactional
    public Product edit(Product product) {
        session.getCurrentSession().update(product);
        return get(product.getId());
    }

    @Transactional
    public boolean delete(int productId) {
        try
        {
            session.getCurrentSession().delete(get(productId));
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }

    @Transactional
    public Product get(int productId) {
        return (session.getCurrentSession().get(Product.class, productId));
    }

    @Transactional
    public List<Product> getAll() {
        return session.getCurrentSession().createQuery("from Product").list();
    }
}
