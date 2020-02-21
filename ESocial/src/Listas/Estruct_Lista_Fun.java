
package Listas;
import esocial.Funcionario;
public class Estruct_Lista_Fun {
    Funcionario funcionario;
    private Estruct_Lista_Fun prox;
    
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Estruct_Lista_Fun getProx() {
        return prox;
    }

    public void setProx(Estruct_Lista_Fun prox) {
        this.prox = prox;
    }

}
