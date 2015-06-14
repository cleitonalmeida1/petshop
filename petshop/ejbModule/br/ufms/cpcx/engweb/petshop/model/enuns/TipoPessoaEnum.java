package br.ufms.cpcx.engweb.petshop.model.enuns;

public enum TipoPessoaEnum {
	FISICA("F�sica"), JURIDICA("Jur�dica");

	private String rotulo;

	private TipoPessoaEnum(String rotulo) {
		this.rotulo = rotulo;
	}

	public String getRotulo() {
		return rotulo;
	}
}