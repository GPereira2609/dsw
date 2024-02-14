package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    @Column(unique = true)
    private String nome;

    @Column
    private String descricao;
}
