package Interface;
import entidades.Aluno;
import java.util.List;
public interface AlunoRepositorio {
    void salvar(Aluno aluno);
    void remover(int matricula);
    void alterar(int matricula, Aluno aluno);
    List<Aluno> listar();
}
interface AlunoServico {
    void cadastrarAluno(Aluno aluno);
    Aluno buscarAluno(int matricula);
    void atualizarAluno(int matricula, Aluno aluno);
    void removerAluno(int matricula);
}

