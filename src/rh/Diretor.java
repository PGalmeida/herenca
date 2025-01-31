package rh;

public class Diretor extends Funcionario{
    private float acoesEmpresa;

    public Diretor(){
        super();
    }

    public Diretor(String nome, String endereco, String cpf, float salario, float acoesEmpresa) {
        super(nome, endereco, cpf, salario);
        this.acoesEmpresa = acoesEmpresa;
    }

    public float getAcoesEmpresa() {
        return acoesEmpresa;
    }

    public void setAcoesEmpresa(int acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                super.toString() + "acoesEmpresa=" + acoesEmpresa +
                '}';
    }

    @Override
    public float calculaSalario() {
        return super.calculaSalario() + (this.acoesEmpresa*2)/12;
    }
}
