import java.util.ArrayList;

public class Instituicao {
    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    // Construtor :

    public Instituicao(String nome){
        this.nome = nome;
    }

    // Método Set :

    public void setNome (String nome){
        this.nome = nome;
    }

    // Método Get :

    public String getNome (){
        return this.nome;
    }

    // Outros Métodos :

    public void adicionarFuncionario (Funcionario funcionario){
        if(funcionarios.contains(funcionario)){
            System.out.println("O funcionário já está na instituição.");
        } else{
            funcionarios.add(funcionario);
        }
    }

    public void retirarFuncionario (Funcionario funcionario){
        if(funcionarios.contains(funcionario)){
            funcionarios.remove(funcionario);
        } else{
            System.out.println("O funcionário não está na instituição.");
        }
    }

    // Método ToString :

    public String toString (){
        String str = "";
        for(int cont = 0; cont < this.funcionarios.size(); cont++){
            str += "Nome = " + this.funcionarios.get(cont).getNome();
            str += "\nSalário = " + this.funcionarios.get(cont).getSalario();
            str += "\nCargo = " + this.funcionarios.get(cont).getCargo();
            str += "\n";
        }
        return str;
    }

    public static void main (String [] args){
        Funcionario f1 = new Funcionario("João",   "01", "05/08", "Rua", "4", "guaura", "Fortaleza", "ce", "90 pila", "Vigia");
        Funcionario f2 = new Funcionario("Carlos",   "01", "05/08", "Rua", "4", "guaura", "Fortaleza", "ce", "90 pila", "Vigia");

        Instituicao farias = new Instituicao("farias");

        farias.adicionarFuncionario(f2);
        farias.adicionarFuncionario(f2);
        farias.adicionarFuncionario(f1);
        farias.retirarFuncionario(f1);
        farias.retirarFuncionario(f1);
        farias.adicionarFuncionario(f1);

        System.out.println(f1.toString());
        System.out.println("\n\n");

        System.out.println(farias.toString());
    }

}
