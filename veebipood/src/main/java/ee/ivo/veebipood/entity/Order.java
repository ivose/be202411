package ee.ivo.veebipood.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
//Nii "order" kui ka "user on Postgres juba reserveeritud, seega @Table..
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public Date creation;
    public double totalSum;

    @ManyToMany
    public List<Product> products; // <1>
}
