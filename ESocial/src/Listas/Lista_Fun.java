
package Listas;

import esocial.Funcionario;

import java.sql.SQLException;



public class Lista_Fun {
    Estruct_Lista_Fun primeiro, ultimo;
    public Lista_Fun(){
        primeiro = null;
        ultimo = primeiro;
    }
    
    public void add(Funcionario fun) throws SQLException{
        
            if(primeiro==null){
                primeiro = new Estruct_Lista_Fun();
                ultimo = primeiro;
                Estruct_Lista_Fun novo = new Estruct_Lista_Fun();
                novo.setFuncionario(fun);
                novo.setProx(null);
                ultimo.setProx(novo);
                ultimo=novo;
                
                
            }else{
                Estruct_Lista_Fun novo = new Estruct_Lista_Fun();
                novo.setFuncionario(fun);
                novo.setProx(null);
                ultimo.setProx(novo);
                ultimo=novo;
            }
        
    }
    
    public void del(String nome){
        Estruct_Lista_Fun ant = new Estruct_Lista_Fun();
        Estruct_Lista_Fun p = new Estruct_Lista_Fun();
        ant = primeiro;
        p= primeiro.getProx();
        while(!p.getFuncionario().getNome().equals(nome)){
            ant = p;
            p=p.getProx();
        }
        
        if(p.getProx() == null){//remove do fim
            ultimo = ant;
            ant.setProx(null);//diz que o anterior sera o ultimo 
        }else{
            ant.setProx(p.getProx());
        }
        p=null;
    }
    
    public Funcionario retorna(String name){
        Estruct_Lista_Fun p;
        p = primeiro.getProx();
        while(!p.getFuncionario().getNome().equals(name)){
            p=p.getProx();
        }
        return p.getFuncionario();
    }
    
  
}
