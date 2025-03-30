package ir.digixo.product.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product2")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Product2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String name;
}
