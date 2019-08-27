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
public class Telefone {

    protected String marca;
    protected String modelo;
    protected String cor;
    protected String tamanho;

    public Telefone(String marca, String modelo, String cor, String tamanho) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getmarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String cor) {
        this.tamanho = tamanho;
    }

    public void ImprimeDados() {
        System.out.println("Marca: " + getmarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Tamanho: " + getTamanho());

    }
}
