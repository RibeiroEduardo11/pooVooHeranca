public abstract class voo {
	private String origem;
	private double distanceKm;
	private double combstDisp;
	private boolean documentacaoReg;
	private String codigo;
	private String destino;

	public voo(String origem, double distanceKM, double combstDisp, boolean documentacaoReg, String codigo, String destino) {
		this.origem = origem;
		this.distanceKm = distanceKM;
		this.combstDisp = combstDisp;
		this.documentacaoReg = documentacaoReg;
		this.codigo = codigo;
		this.destino = destino;
	}

	public String getOrigem() {
		return origem;
	}

	public double getDistanceKm() {
		return distanceKm;
	}

	public double getCombstDisp() {
		return combstDisp;
	}

	public boolean getDocumentacaoReg() {
		return documentacaoReg;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDestino() {
		return destino;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public void setDistanceKm(double distanceKm) {
		this.distanceKm = distanceKm;
	}

	public void setCombstDisp(double combstDisp) {
		this.combstDisp = combstDisp;
	}

	public void setDocumentacaoReg(boolean documentacaoReg) {
		this.documentacaoReg = documentacaoReg;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public abstract double custoVoo();

	public abstract boolean permDecolar();

	public abstract String motivoPendencia();

	public abstract double calculaCombstNec();

}
