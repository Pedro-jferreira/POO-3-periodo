package biblioteca.Armazenamento;

import java.util.ArrayList;

public interface Config {
    void addArray(Object objeto);
    void RemoverArray(Object objeto);
    void AtualizarArray( Object primario,Object objetoatualizado);

    ArrayList<Object> retornar();
    void Imprimir();
}
