package biblioteca;

public interface DAO {
    String Gravar();
    Object Ler(String codigo);
    String Excluir(String codigo);
    String Atualizar( Object objtatualizado);



}
