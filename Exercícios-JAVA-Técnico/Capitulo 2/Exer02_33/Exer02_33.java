// Fernando Bueno Dansi
// 28/08/2016

import java.util.Scanner;

public class Exer02_33
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

      double peso, altura, imc;

      System.out.printf("Informe o peso (em kgs):\n");
      peso = ler.nextDouble();

      System.out.printf("\nInforme a altura (em metros):\n");
      altura = ler.nextDouble();

      imc = peso / (altura * altura);

      System.out.printf("\n\nIMC = peso / (altura * altura)");
      System.out.printf("\n\nIMC calculado   Situacao");
      System.out.printf("\n------------------------------");
      System.out.printf("\nMenos de 20     Abaixo do peso");
      System.out.printf("\n20 <= IMC < 25  Peso Normal");
      System.out.printf("\n25 <= IMC < 30  Acima do peso");
      System.out.printf("\n30 <= IMC < 34  Obeso");
      System.out.printf("\nAcima de 34     Muito Obeso");
      System.out.printf("\n------------------------------");
      System.out.printf("\nIMC = %.2f", imc);
      if (imc < 20)
         System.out.printf(" (abaixo do peso).\n");
      else if ((imc >= 20) && (imc < 25))
              System.out.printf(" (peso normal).\n");
           else if ((imc >= 25) && (imc < 30))
                   System.out.printf(" (acima do peso).\n");
                else if ((imc >= 30) && (imc < 34))
                        System.out.printf(" (obeso).\n");
                     else
                        System.out.printf(" (muito obeso).\n");
	}
}
