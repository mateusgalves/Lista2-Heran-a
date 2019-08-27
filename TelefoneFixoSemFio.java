/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg3.herança.exercicios;

/**
 *
 * @author aluno
 */
public class TelefoneFixoSemFio extends Telefone {
    private String alcance;
    private String bina;
    
    public TelefoneFixoSemFio (String marca, String modelo, String cor, String tamanho, String alcance, String bina){
       super(marca, modelo,cor,tamanho);
       this.alcance = alcance;
       this.bina = bina;
    }
    

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public String getBina() {
        return bina;
    }

    public void setBina(String bina) {
        this.bina = bina;
    }
    
    
    public void ImprimirDados (){
        System.out.print("Raio de Alcance: " + getAlcance());
        System.out.println("Bina: " + getBina());
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg3.herança.exercicios;

/**
 *
 * @author aluno
 */
public class TelefoneFixoSemFio extends Telefone {

    private String alcance;
    private String bina;

    public TelefoneFixoSemFio(String marca, String modelo, String cor, String tamanho, String alcance, String bina) {
        super(marca, modelo, cor, tamanho);
        this.alcance = alcance;
        this.bina = bina;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public String getBina() {
        return bina;
    }

    public void setBina(String bina) {
        this.bina = bina;
    }

    public void ImprimirDados() {
        System.out.print("Raio de Alcance: " + getAlcance());
        System.out.println("Bina: " + getBina());
        System.out.println("Marca: " + getmarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Tamanho: " + getTamanho());
    }

}

    }
    
    
    
}
