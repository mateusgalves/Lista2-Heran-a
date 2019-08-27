package aula.pkg3.herança.exercicios;


import aula.pkg3.herança.exercicios.Telefone;


public class TelefoneFixoFio extends Telefone {
    private float comprimentoFio ;
    private String tipoCabo;
    
    public TelefoneFixoFio(String marca, String modelo, String cor, String tamanho, float comprimentoFio, String tipoCabo){
        super(marca, modelo, cor, tamanho);
        this.comprimentoFio = comprimentoFio;
        this.tipoCabo = tipoCabo;
        
    }
    public float getComprimentoFio() {
        return comprimentoFio;
    }

    public void setComprimentoFio(float comprimentoFio) {
        this.comprimentoFio = comprimentoFio;
    }

    public String getTipoCabo() {
        return tipoCabo;
    }

    public void setTipoCabo(String tipoCabo) {
        this.tipoCabo = tipoCabo;
    }

   
    
    @Override
    public void ImprimeDados(){
        System.out.println("Comprimento do Cabo: " + getComprimentoFio());
        System.out.println("Tipo de Cabo: " + getTipoCabo());
        System.out.println("Marca: " + getmarca());   
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Tamanho: " + getTamanho());
         
    }
    
}
