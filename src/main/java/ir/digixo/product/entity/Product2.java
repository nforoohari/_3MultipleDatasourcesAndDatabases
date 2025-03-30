package ir.digixo.product.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "product2")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Product2 {


    @Id
    //1
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //2
    // @GeneratedValue(strategy = GenerationType.TABLE,generator = "product_gen")
    // @TableGenerator(name = "product_gen",table = "id_gen",pkColumnName = "gen_name",valueColumnName = "gen_val",allocationSize = 100)
    //3
   /* @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_generator")
    @SequenceGenerator(name="product_generator", sequenceName = "product_seq", allocationSize=50)*/
    private Long id;
    @NonNull
    private String name;

}
