package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Table(name = "clientes")
@Entity(name = "clientes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "cpf")
public class Cliente {

    @Id
    @NotBlank
    @Min(14)
    @Max(14)
    @Column(unique = true)
    private String cpf;

    @NotBlank
    @Column
    private String nome;

    @Column
    private String email;

    @Column
    private Integer telefone;
}
