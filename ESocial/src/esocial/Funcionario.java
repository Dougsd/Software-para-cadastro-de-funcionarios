
package esocial;


public class Funcionario {
    private float salario;
    private int ID;
    private String nome,cpf,email,telefone,dataAdmissão,dataNascimento,cor,escolaridade,sexo,numNis, numCT;
    
    public Funcionario(int ID ,float salario, String nome, String cpf, String email, String telefone, String dataAdmissão, String dataNascimento, String cor, String escolaridade, String sexo, String numNis, String numCT) {
           this.ID = ID;
           this.salario = salario;
           this.nome = nome;
           this.cpf = cpf;
           this.email = email;
           this.telefone = telefone;
           this.dataAdmissão = dataAdmissão;
           this.dataNascimento = dataNascimento;
           this.cor = cor;
           this.escolaridade = escolaridade;
           this.sexo = sexo;
           this.numNis = numNis;
           this.numCT = numCT;
       }
    public int getID() {
        return ID;
    }

   
    public void setID(int ID) {
        this.ID = ID;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

  

    public String getDataAdmissão() {
        return dataAdmissão;
    }

    public void setDataAdmissão(String dataAdmissão) {
        this.dataAdmissão = dataAdmissão;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
    
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getNumNis() {
        return numNis;
    }

    public void setNumNis(String numNis) {
        this.numNis = numNis;
    }

    public String getNumCT() {
        return numCT;
    }

    public void setNumCT(String numCT) {
        this.numCT = numCT;
    }

    
}
