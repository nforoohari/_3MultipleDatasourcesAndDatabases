package ir.digixo.employee.entity;


import lombok.*;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {


    @Id
    //1
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //2
    // @GeneratedValue(strategy = GenerationType.TABLE,generator = "product_gen")
    // @TableGenerator(name = "product_gen",table = "id_gen",pkColumnName = "gen_name",valueColumnName = "gen_val",allocationSize = 100)

  /*  @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_generator")
    @SequenceGenerator(name="employee_generator", sequenceName = "employee_seq", allocationSize=50)*/
    private Long id;
    @NonNull
    private String name;




}
