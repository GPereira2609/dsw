package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private String cpf;

    @NotBlank
    private String nome;

    private String email;

    private Integer telefone;
}
