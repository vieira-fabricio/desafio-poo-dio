package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Js");
		curso2.setDescricao("Descrição Curso Js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoriaJava = new Mentoria();
		mentoriaJava.setTitulo("Mentoria Java");
		mentoriaJava.setDescricao("Descrição Mentoria Java");
		mentoriaJava.setData(LocalDate.now());
		
		Conteudo conteudo = new Curso();
		
		
		/*
		   System.out.println(curso1);
		   System.out.println(curso2);
		   System.out.println(mentoriaJava); 
		 */
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoriaJava);
		
		Dev devCarlos = new Dev();
		devCarlos.setNome("Carlos");
		devCarlos.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos de Carlos " + devCarlos.getConteudosInscritos());
		devCarlos.progradir();
		devCarlos.progradir();
		devCarlos.progradir();
		System.out.println("--");
		System.out.println("Conteúdos inscritos de Carlos " + devCarlos.getConteudosInscritos());
		System.out.println("Conteúdos concluídos de Carlos " + devCarlos.getConteudosConcluidos());
		System.out.println("XP: " + devCarlos.calcularTotalXp());
		
		System.out.println("------------------------");
		
		Dev devMaria = new Dev();
		devMaria.setNome("Maria");
		devMaria.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos de Maria " + devMaria.getConteudosInscritos());
		devMaria.progradir();
		devMaria.progradir();
		System.out.println("--");
		System.out.println("Conteúdos inscritos de Maria " + devMaria.getConteudosInscritos());
		System.out.println("Conteúdos concluídos de Maria " + devMaria.getConteudosConcluidos());
		System.out.println("XP: " + devMaria.calcularTotalXp());
	}

}
