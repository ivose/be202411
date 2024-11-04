package ee.ivo.veebipood.controller;

import ee.ivo.veebipood.repository.ProductRepository;
import ee.ivo.veebipood.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    //sama mis
    //private final ProductRepository productRepository;
    //public ProductController(ProductRepository productRepository) {
    //    this.productRepository = productRepository;
    //}



    //List <Product> products = new ArrayList<>(Arrays.asList(
    //        new Product("Coca", 1.5, true, "coca.jpg"),
    //        new Product("Fanta", 1.5, true, "fanta.jpg"),
    //        new Product("Sprite", 1.5, true, "sprite.jpg")
    //));

    @GetMapping("products")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @GetMapping("add-product")
    public List<Product> addProduct(@RequestParam String name) {
        //products.add(new Product(name, 1.5, true, "coca.jpg"));
        //return products.getLast();
        productRepository.save(new Product(name, 1.5, true, "coca.jpg"));
        return productRepository.findAll();
    }


    @GetMapping("delete-product/{name}")
    public List<Product> deleteProduct(@PathVariable String name) {
        //Product product = products.stream().filter(p -> p.getName().equals(name)).findFirst().orElse(null);
        //products.remove(product);
        productRepository.deleteById(name);
        return productRepository.findAll();
    }

    @GetMapping("delete-product")
    public Product deleteProduct() {
        List<Product> products = productRepository.findAll();
        Random random = new Random();
        int index = random.nextInt(products.size());
        return products.get(index);
    }

}
