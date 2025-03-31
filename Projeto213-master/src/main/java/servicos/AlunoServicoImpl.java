package servicos;

import Interface.AlunoRepositorio;
import entidades.Aluno;

public class AlunoServicoImpl implements AlunoServico {
    private AlunoRepositorio repositorio;

    public AlunoServicoImpl(AlunoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public void cadastrarAluno(Aluno aluno) {
        repositorio.salvar(aluno);
    }

    @Override
    public Aluno buscarAluno(int matricula) {
        return repositorio.listar().stream()
                .filter(a -> a.getMatricula() == matricula)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void atualizarAluno(int matricula, Aluno aluno) {
        repositorio.alterar(matricula, aluno);
    }

    @Override
    public void removerAluno(int matricula) {
        repositorio.remover(matricula);
    }
}
