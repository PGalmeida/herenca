package rh;

public class Assistente extends Funcionario{
    private float horaExtra;
    public Assistente(){
        super();//chama o construtor da classe pai
    }

    public Assistente(String nome, String endereco, String cpf, float salario, float horaExtra) {
        super(nome, endereco, cpf, salario);//chama o construtor da classe pai
        this.horaExtra = horaExtra;
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override
    public String toString() {
        return "Assistente{" +
                super.toString() + "horaExtra=" + horaExtra +
                '}';
    }

    @Override
    public float calculaSalario() {
        return super.calculaSalario() + this.horaExtra*50;
    }
}
