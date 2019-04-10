package br.com.sta.crud.todo.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Classe de negócio representando a entidade todo do banco de dados.
 * @author Jonathan H. Medeiros
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Entity(name = "todo")
public class Todo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 100, nullable = false)
    private String titulo;
    
    @Column(nullable = false)
    private Boolean status;
    
    @Column(length = 300)
    private String descricao;
    
    @Column(name = "data_criacao")
    private LocalDate dataCriacao;
    
    @Column(name = "data_edicao")
    private LocalDate dataEdicao;
    
    @Column(name = "data_conclusao")
    private LocalDate dataConclusao;
    
}
