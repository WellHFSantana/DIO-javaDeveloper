import java.util.Scanner;
import java.util.Locale;

public class ResultadoEscolar {
   /**
    * 
 * @param args
 */
public static void main(String[] args) {

                     
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a PRIMEIRA nota do aluno:");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a SEGUNDA nota do aluno:");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a TERCEIRA nota do aluno:");
        double nota3 = sc.nextDouble();

        double mediaAluno = (nota1 + nota2 + nota3) / 3;

            if(mediaAluno <5) {
                System.out.printf(mediaAluno + " Aluno reprovado!");
            }
            else if((mediaAluno >5) && (mediaAluno <7)) {
                System.out.println("Prova de recuperação!");
            }
            else
                System.out.println("Aluno aprovado!");
        
            }
        
   }
    
