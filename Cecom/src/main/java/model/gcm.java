package model;

public class gcm {

	public long idTb_gcm;
	public String nomeGcm;
	public long matricula;
	public String Funcional;
	public String Arma;

	public gcm() {
	}

	public gcm(long idTb_gcm, String nomeGcm, long matricula, String funcional, String arma) {
		super();
		this.idTb_gcm = idTb_gcm;
		this.nomeGcm = nomeGcm;
		this.matricula = matricula;
		Funcional = funcional;
		Arma = arma;
	}

	public long getIdTb_gcm() {
		return idTb_gcm;
	}

	public void setIdTb_gcm(long idTb_gcm) {
		this.idTb_gcm = idTb_gcm;
	}

	public String getNomeGcm() {
		return nomeGcm;
	}

	public void setNomeGcm(String nomeGcm) {
		this.nomeGcm = nomeGcm;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getFuncional() {
		return Funcional;
	}

	public void setFuncional(String funcional) {
		Funcional = funcional;
	}

	public String getArma() {
		return Arma;
	}

	public void setArma(String arma) {
		Arma = arma;
	}

	@Override
	public String toString() {
		return "gcm [idTb_gcm=" + idTb_gcm + ", nomeGcm=" + nomeGcm + ", matricula=" + matricula + ", Funcional="
				+ Funcional + ", Arma=" + Arma + "]";
	}

	
}
