package products;

import entities.Product;
import java.util.List;

public interface IProductsRepository {

    Product add(Product product);
    Product edit(Product product);
    boolean delete(int productId);
    Product get(int product);
    List<Product> getAll();
}
