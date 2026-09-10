public class vooCarga extends voo {

	private double pesoCarga;

	private double capacMax;

	private boolean inspCarg;

	public vooCarga(String origem, double distanceKM, double combstDisp, boolean documentacaoReg, String codigo, String destino, double pesoCarga, double capacMax, boolean inspCarga) {
		super(origem,distanceKM,combstDisp,documentacaoReg,destino);
		this.pesoCarga = pesoCarga;
		this.capacMax = capacMax;
		this.inspCarg = inspCarga;
	}

	@Override
	public double custoVoo() {
		double result = 0;
		double calcCombst = 0;
		calcCombst = getDistanceKm()*0.15+pesoCarga*0.02;
		result = getDistanceKm()*10 + pesoCarga*1.5+calcCombst;
		return result;
	}

	@Override
	public boolean permDecolar() {
		if(permDecolar() == true){
			return true;
		}else return false;
	}

	@Override
	public String motivoPendencia() {

		return "";
	}

	public double calculaCombstNec() {
		return 0;
	}

	public void custoVoo(double pesoCarg, double distanciaKm) {

	}

	public void permDecolar(boolean documentacaoReg, boolean inspCarg, double pesoCarga) {

	}

}
