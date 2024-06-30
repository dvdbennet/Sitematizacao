//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package Entidades;

public class Funcionario {

    private String nome;
    private int idade;
    private String telefone;
    private String email;
    private String alergias;
    private String problemasMed;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome,int idade ,String telefone, String email, String alergias, String problemasMed ) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
        this.alergias = alergias;
        this.problemasMed = problemasMed;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getProblemasMed() {
        return problemasMed;
    }

    public void setProblemasMed(String problemasMed) {
        this.problemasMed = problemasMed;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Telefone: " + telefone +
                ", Email: " + email + ", Alergias: " + alergias +" ,Problemas médicos: " + problemasMed;
    }
}