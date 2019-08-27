package aula.pkg3.herança.exercicios;

public class TelefoneCelular extends Telefone {

    private String tela;
    private String bateria;
    private String reprodutorSom;
    private String radio;
    private String alarme;

    public TelefoneCelular(String marca, String modelo, String cor, String tamanho, String tela, String bateria, String reprodutorSom, String radio, String alarme ) {
        super(marca, modelo, cor, tamanho);
        this.tela = tela;
        this.bateria = bateria;
        this.reprodutorSom = reprodutorSom;
        this.radio = radio;
        this.alarme = alarme;
    }


    public String gettela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getReprodutorSom() {
        return reprodutorSom;
    }

    public void setReprodutorSom(String reprodutorSom) {
        this.reprodutorSom = reprodutorSom;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getAlarme() {
        return alarme;
    }

    public void setAlarme(String alarme) {
        this.alarme = alarme;
    }

    public void ImprimeDados() {
        System.out.println("Tela: " + gettela());
        System.out.println("Tipo bateria:" + getBateria());
        System.out.println("Reprodutor de Som:" + getReprodutorSom());
        System.out.println("Rádio; " + getRadio());
        System.out.println("Alrme: " + getAlarme());
        System.out.println("Marca: " + getmarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Tamanho: " + getTamanho());
        
    }
}

