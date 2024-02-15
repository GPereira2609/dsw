package model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Table(name = "processo")
@Entity(name = "processo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Processo {

    @Id
    @Column(nullable = false)
    private Date dataInicio;

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cpfCliente", referencedColumnName = "cpf")
    private Cliente cliente;

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nomeTipoProcesso", referencedColumnName = "nome")
    private TipoProcesso tipoProcesso;

    @Column(nullable = true)
    private Date dataFim;

    @Column(nullable = false)
    private Status status;
}
