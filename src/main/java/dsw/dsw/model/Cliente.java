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
    @Column(unique = true, nullable = false, length = 14)
    private String cpf;

    @Column(nullable = false)
    private String nome;

    @Column
    private String email;

    @Column
    private String endereco;

    @Column
    private Integer telefone;

    @OneToOne(mappedBy = "cliente")
    private Processo processo;
}
