package entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {

	private String nome;
	private Date dataNascimento;
	private Double altura;
	private Date anoAtual = new Date();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, Date dataNascimento, Double altura) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public int Idade() {
		int ano;
		int atual;
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(dataNascimento);
		ano = cal.get(Calendar.YEAR);
		
		Calendar cal1= Calendar.getInstance();
		cal1.setTime(anoAtual);
		atual= cal1.get(Calendar.YEAR);
		
		int idade= atual - ano;
		
		return idade;
	}
	
	public String toString() {
		return "Seu nome é: " + getNome() + "\n" +
			 "Sua altura é: " +getAltura() + "\n" +
		     "Sua data de nascimento: " +sdf.format(dataNascimento);
		  
	}
	
	
}
