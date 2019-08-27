package aula.pkg3.herança.exercicios;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class PrincipalTelefone {

    public static void main(String[] args) {
        //Telefone p = new Telefone();
        //TelefoneFixoFio f1 = new TelefoneFixoFio();
        //TelefoneCelular f2 = new TelefoneCelular();
        //TelefoneFixoSemFio f3 = new TelefoneFixoSemFio();

        TelefoneFixoFio f1 = new TelefoneFixoFio("Lenovo", "X", "7", "azul", 1, "CAT6");
        TelefoneCelular f2 = new TelefoneCelular("Lenovo", "X", "7", "azul", "touch", "litio", "alto falante", "FM", "Sim");
        TelefoneFixoSemFio f3 = new TelefoneFixoSemFio("Lenovo", "X", "7", "azul", "150m", "Bina");
        f1.ImprimeDados();
        f2.ImprimeDados();
        f3.ImprimeDados();

       
    }

}
