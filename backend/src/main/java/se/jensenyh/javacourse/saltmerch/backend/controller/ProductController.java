package se.jensenyh.javacourse.saltmerch.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.jensenyh.javacourse.saltmerch.backend.model.Product;
import se.jensenyh.javacourse.saltmerch.backend.service.ProductService;

import java.util.List;

@RestController
@CrossOrigin(origins= "http://localhost:3010")
@RequestMapping(path = "/api/v1")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    //    @GetMapping("products/hats")
//    public ResponseEntity getHats(){
//        List<Product>hatsList=productService.selectAllOfCategoryHats();
//        return ResponseEntity.ok(hatsList);
    @GetMapping("products/hats")
    public List<Product> selectAllHats() {
        return productService.selectAllOfCategoryHats();
    }

    @GetMapping("products/bags")
    public List<Product> selectAllBags() {
        return productService.selectAllOfCategoryBags();
    }

    @GetMapping("products/jackets")
    public List<Product> selectAllJackets() {
        return productService.selectAllOfCategoryJackets();
    }
    @GetMapping("products/tshirts")
    public List<Product> selectAllTshirts() {
        return productService.selectAllOfCategoryTshirts();
    }
    @GetMapping("products/{id}")
    public Object getProductById(@PathVariable ("id") int id){
        return productService.selectProductById(id);

    }
}


