package com.adina.employeemanagementsystem;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="emp_db")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emp_id;
    private String emp_name;
    private String emp_address;
    private String emp_phone;
    private String emp_email;

}
