import rh.Assistente;
import rh.Diretor;
import rh.Funcionario;
import rh.Gerente;

public class Main {
    public static void exibedados(Funcionario camaleao){
        System.out.println(camaleao.toString());
        System.out.println("Salario Final: "+camaleao.calculaSalario());
    }
    public static void main(String[] args) {
        Assistente as1 = new Assistente("pedro", "Ipua","15151565615",3000, 10);
        exibedados(as1);
        Gerente ge1 = new Gerente("mateus", "Ipua","521651451651",5000, 2000);
        exibedados(ge1);
        Diretor di1 = new Diretor("vitor", "Ipua","16546516516548",10000, 1000);
        exibedados(di1);
    }
}