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
        
        TelefoneFixoFio f1 = new TelefoneFixoFio("Lenovo", "X","7", "azul",1,"CAT6" );

        f1.ImprimeDados();
       /** Scanner ler = new Scanner(System.in);
        System.out.println(": ");
        p.(ler.nextLine());
        ler = new Scanner(System.in);

        System.out.println("Entre com a matrícula: ");
        p.setNumeroMatricula(ler.nextInt());

        System.out.println("Salario Mensal: ");
        f1.setSalarioMensal(ler.nextDouble());

        System.out.println("Valor Hora: ");
        f2.setValorHora(ler.nextDouble());

        System.out.println("Horas Trabalhadas: ");
        f2.setHorasTrabalhadas(ler.nextInt());

        p.ImprimeDados();
        f1.ImprimeDados();
        f2.ImprimeDados();
        */

    }

}
