package entidades;

public class PessoaFisica extends Pessoa {
	
	private Double gastosComSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double valorImposto, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public Double calculaImposto() {
		double totalPagamento;
		if (super.getRendaAnual()<20000) {
			totalPagamento = super.getRendaAnual()*0.15;
		}
		else {
			totalPagamento = super.getRendaAnual()*0.25;
		}
		
		if (gastosComSaude<0.00) {
			totalPagamento -= gastosComSaude*0.5;
		}
		return totalPagamento;
	}	

}
