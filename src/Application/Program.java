package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Seu nome : ");
		String nome = sc.nextLine();
		System.out.println("Digite sua data de nascimento nesse padrão (Dia/mês/ano)");
		System.out.println("Data de nascimento:");
		Date dataNascimento = sdf.parse(sc.next());
		System.out.println("Altura:");
		double altura= sc.nextDouble();
		
		Pessoa pessoa = new Pessoa(nome,dataNascimento,altura);
		
		System.out.println(pessoa);
		System.out.println("Sua idade é :" + pessoa.Idade() + " " + "anos");
		sc.close();
	}

}
