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

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public int Get(){
        return productsRepository.get(1).getId();
    }

    @RequestMapping(value="/products", method=RequestMethod.POST)
    public Product Save(@RequestBody Product input){
        return productsRepository.add(input);
    }

    @RequestMapping(value="/products", method=RequestMethod.PUT)
    public Product Edit(@RequestBody Product input){
        return productsRepository.edit(input);
    }

    @RequestMapping(value = "/products", method = RequestMethod.DELETE)
    public boolean Delete(int productId){
        return productsRepository.delete(productId);
    }
}