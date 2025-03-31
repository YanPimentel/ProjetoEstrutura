// Pacote das Entidades
package entidades;

public class Aluno {
    private int matricula;
    private String nome;
    private int idade;

    public Aluno() {}

    public Aluno(int matricula, String nome, int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
    }

    public int getMatricula() { return matricula; }
    public String getNome() { return nome; }
    public int getIdade() { return idade; }

    public void setNome(String nome) { this.nome = nome; }
    public void setIdade(int idade) { this.idade = idade; }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome='" + nome + '\'' + ", idade=" + idade + '}';
    }
}

