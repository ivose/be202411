package ee.ivo.veebipood.repository;

import ee.ivo.veebipood.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;//kõik omadused
//import org.springframework.data.jpa.repository.CrudRepository;//vajalikud omadused
//import org.springframework.data.jpa.repository.Sorting;
//import org.springframework.data.jpa.repository.PagingAndSortingRepository;


public interface ProductRepository extends JpaRepository<Product, String> {
}
