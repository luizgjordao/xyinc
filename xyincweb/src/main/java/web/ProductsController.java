package web;

import entities.Product;
import org.springframework.web.bind.annotation.*;
import products.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ProductsController
{
    @Autowired
    private ProductsRepository productsRepository;

    @RequestMapping(value = "/products/{productId}", method = RequestMethod.GET)
    public Product Get(int productId){
        return productsRepository.get(productId);
    }

    @RequestMapping(value="/products", method=RequestMethod.POST)
    public Product Save(@RequestBody Product input){
        return productsRepository.add(input);
    }

    @RequestMapping(value="/products", method=RequestMethod.PUT)
    public Product Edit(@RequestBody Product input){
        return productsRepository.edit(input);
    }

    @RequestMapping(value = "/products/{productId}", method = RequestMethod.DELETE)
    public boolean Delete(int productId){
        return productsRepository.delete(productId);
    }
}