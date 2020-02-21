
package esocial;

/*Douglas*/
public class Impostos {
    private String nomeIpt;
    private float salarioI, salarioF;
   /*set-get...............................................................*/

    public String getNomeIpt() {
        return nomeIpt;
    }

    public void setNomeIpt(String nomeIpt) {
        this.nomeIpt = nomeIpt;
    }

    public float getSalarioI() {
        return salarioI;
    }

    public void setSalarioI(float salarioI) {
        this.salarioI = salarioI;
    }

    public float getSalarioF() {
        return salarioF;
    }

    public void setSalarioF(float salarioF) {
        this.salarioF = salarioF;
    }
    /*Construtor.........................................................*/

    public Impostos(String nomeIpt, float salarioI, float salarioF) {
        this.nomeIpt = nomeIpt;
        this.salarioI = salarioI;
        this.salarioF = salarioF;
    }
    
}
