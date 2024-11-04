package ee.ivo.veebipood.repository;

import ee.ivo.veebipood.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
