package br.com.ideiasbits.api.domain;


import jakarta.persistence.*;
import lombok.*;

@Data
// A anotação @Data substitui a 3 abaixo comentadas
//@Getter
//@Setter
//@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(unique = true)
    private String email;
    private String password;



}
