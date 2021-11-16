import java.util.Scanner;

public class MediaNotas{

  public static void main (String[] args) {
    float num1 = 0;
    float num2 = 0;
    float num3 = 0;
    float resultadoSoma;
    float resultadoMedia;

    Scanner ler  new Scanner(System.in);
    System.out.printf ("Informe a nota da primeira prova:\n");
    num1 = ler.nextInt();
    System.out.printf ("Informe a nota da segunda prova:\n");
    num2 = ler.nextInt();
    System.out.printf ("Informe a nota da terceira prova:\n");
    num3 = ler.nextInt();

    resultadoSoma = num1 + num2 + num3;
    resultadoMedia = resultadoSoma/3;

    System.out.println ("As notas são:");
    System.out.println ("Primeira Prova:");
    System.out.println (num1);
    System.out.println ("Segunda Prova:");
    System.out.println (num2);
    System.out.println ("Terceira Prova:");
    System.out.println (num3);
    System.out.println ("Soma das notas:");
    System.out.println (resultadoSoma);
    System.out.println ("Média Final");
    System.out.println (resultadoMedia);

  }
}