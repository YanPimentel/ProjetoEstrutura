package repositorio;

import Interface.AlunoRepositorio;
import entidades.Aluno;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AlunoRepositorioImpl implements AlunoRepositorio {
    private Queue<Aluno> alunos = new LinkedList<>();

    @Override
    public void salvar(Aluno aluno) {
        alunos.add(aluno);
    }

    @Override
    public void remover(int matricula) {
        alunos.removeIf(a -> a.getMatricula() == matricula);
    }

    @Override
    public void alterar(int matricula, Aluno alunoAtualizado) {
        for (Aluno a : alunos) {
            if (a.getMatricula() == matricula) {
                a.setNome(alunoAtualizado.getNome());
                a.setIdade(alunoAtualizado.getIdade());
                break;
            }
        }
    }

    @Override
    public List<Aluno> listar() {
        return new LinkedList<>(alunos);
    }
}