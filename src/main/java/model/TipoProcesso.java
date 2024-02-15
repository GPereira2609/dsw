package model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "tipo_processo")
@Entity(name = "tipo_processo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "nome")
public class TipoProcesso {

    @Id
    @Column(unique = true, nullable = false)
    private String nome;

    @Column
    private String descricao;

    @OneToOne(mappedBy = "tipoProcesso")
    private Processo processo;
}
