package br.ufms.cpcx.engweb.petshop.biz;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufms.cpcx.engweb.petshop.dao.FornecedorDAO;
import br.ufms.cpcx.engweb.petshop.model.Fornecedor;

@Stateless
public class CadastroFornecedor {
	@EJB
	private FornecedorDAO fornecedorDAO;

	public Fornecedor cadastrarFornecedor(Fornecedor fornecedor) {
		if (fornecedor.getNome() == null) {
			System.out.println("Raz�o Social n�o pode ser nulo");
		}
		if (fornecedor.getCnpj() == null) {
			System.out.println("CNPJ n�o pode ser nulo");
		}
		if (fornecedor.getIe() == null) {
			System.out.println("Inscri��o Estadual n�o pode ser nulo");
		}
		if (fornecedor.getTelefone() == null) {
			System.out.println("Telefone n�o pode ser nulo");
		}
		if (fornecedor.getEmail() == null) {
			System.out.println("Email n�o pode ser nulo");
		}
		if (fornecedor.getEndereco() == null) {
			System.out.println("Endere�o n�o pode ser nulo");
		}
		return fornecedorDAO.persist(fornecedor);
	}

	public List<Fornecedor> listarFornecedores() {
		return fornecedorDAO.listAll();
	}

	public void removerFornecedor(Fornecedor fornecedor) {
		if (verificarVinculoFornecedorVenda(fornecedor.getId())) {
			// faz o que manda o negocio
		} else {
			fornecedorDAO.removerFornecedor(fornecedor.getId());
		}

	}

	public void removerFornecedor(Long id) {
		if (verificarVinculoFornecedorVenda(id)) {
			// faz o que manda o negocio
		} else {
			fornecedorDAO.removerFornecedor(id);
		}
	}

	private boolean verificarVinculoFornecedorVenda(Long id) {
		// se tiver relacionamento retorna falso
		// sen�o retorna verdadeiro
		return false;
	}
}
