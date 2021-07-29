package model;

public class qth {

	public long idTb_qth;
	public String Longadoro;
	public long numero;
	public String cep;
	public String Bairro;
	public String Cidade;
	
	
	public qth() {
		
	}
	
	public qth(long idTb_qth, String longadoro, long numero, String cep, String bairro, String cidade) {
		super();
		this.idTb_qth = idTb_qth;
		Longadoro = longadoro;
		this.numero = numero;
		this.cep = cep;
		Bairro = bairro;
		Cidade = cidade;
	}

	public long getIdTb_qth() {
		return idTb_qth;
	}

	public void setIdTb_qth(long idTb_qth) {
		this.idTb_qth = idTb_qth;
	}

	public String getLongadoro() {
		return Longadoro;
	}

	public void setLongadoro(String longadoro) {
		Longadoro = longadoro;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	@Override
	public String toString() {
		return "qth [idTb_qth=" + idTb_qth + ", Longadoro=" + Longadoro + ", numero=" + numero + ", cep=" + cep
				+ ", Bairro=" + Bairro + ", Cidade=" + Cidade + "]";
	}
	
	
	
	
}
