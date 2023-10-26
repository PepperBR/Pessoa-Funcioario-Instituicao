public class Funcionario extends Pessoa{
    private String salario;
    private String cargo;
    ;

    // Construtor :

    public Funcionario(String nome, String cpf , String dataNascimento, String logradouro, String numero, String bairro, String cidade, String uf, String salario, String cargo){
        super(nome, cpf, dataNascimento, logradouro, numero, bairro, cidade, uf);
        this.salario = salario;
        this.cargo = cargo;
    }

    // Métodos Set :

    public void setSalario (String salario){
        this.salario = salario;
    }

    public void setCArgo (String cargo){
        this.cargo = cargo;
    }

    // Método Get :

    public String getSalario (){
        return this.salario;
    }

    public String getCargo (){
        return this.cargo;
    }

    // Método ToString :

    public String toString (){
        String str = "";
        str += "Nome = " + getNome();
        str += "\nCPF = " + getCpf();
        str += "\nData de Nascimento = " + getDataNascimento();
        str += "\nLogradouro = " + getLogradouro();
        str += "\nNumero = " + getNumero();
        str += "\nBairro = " + getBairro();
        str += "\nCidade = " + getCidade();
        str += "\nUF = " + getUf();
        str += "\nSalario = " + getSalario();
        str += "\nCargo = " + getCargo();
        return str;
    }

}
