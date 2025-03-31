package servicos;

import entidades.Aluno;

public interface AlunoServico {
    void cadastrarAluno(Aluno aluno);

    Aluno buscarAluno(int matricula);

    void atualizarAluno(int matricula, Aluno aluno);

    void removerAluno(int matricula);
}
