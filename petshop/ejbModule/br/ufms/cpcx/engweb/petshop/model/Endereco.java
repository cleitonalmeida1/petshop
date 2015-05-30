package br.ufms.cpcx.engweb.petshop.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.ufms.cpcx.engweb.petshop.model.enuns.TipoEnderecoEnum;

@Entity
@Table(name = "tb_endereco")
public class Endereco implements Serializable {

	private static final long serialVersionUID = -1057247002655453427L;
	
	@Id
	@SequenceGenerator(name = "endereco_seq_gen", sequenceName = "endereco_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "endereco_seq_gen", strategy = GenerationType.SEQUENCE)
	
	private Long id;
    private String logradouro;
    private String bairro;
    private Integer n�mero;
    private String complemento;
    private String cep;
    @OneToOne
    private Cidade cidade;
    private String estado;
    
  //tipo endereo
    @Enumerated(EnumType.STRING)
	@NotNull
	private TipoEnderecoEnum tipoEndereco;
    
   

    public Endereco() {
    }

    public Endereco(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

   

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getN�mero() {
        return n�mero;
    }

    public void setN�mero(Integer n�mero) {
        this.n�mero = n�mero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public TipoEnderecoEnum getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(TipoEnderecoEnum tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}
    
    
    
}

