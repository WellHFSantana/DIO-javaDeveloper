import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
		int C = leitor.nextInt();
		String nome;
		int N;

// TODO: complete os espaços em branco com sua solução para o problema

		for (int i = 0; i < C; i++) {
			nome = leitor.next();
			N = leitor.nextInt();
			if(nome.equals("Thor")) {
                System.out.println("N");}

			else 
                System.out.println("Y");
		}
    }
}
