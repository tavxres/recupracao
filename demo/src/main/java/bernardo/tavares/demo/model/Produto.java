package bernardo.tavares.demo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Size(max = 50)
    private String nome;

    @NotNull
    private String marca;

    @NotNull
    private String validade;

    public Produto(){

    }

    public Produto(String nome, String marca, String validade){
        this.nome = nome;
        this.marca = marca;
        this.validade = validade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return marca;
    }

    public void setTurma(String turma) {
        this.marca = turma;
    }

    public String getAno() {
        return validade;
    }

    public void setAno(String ano) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return nome;
    }
}

