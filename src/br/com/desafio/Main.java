package br.com.desafio;

import java.time.LocalDate;

import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso cursoJava = new Curso();
		cursoJava.setTitulo("Curso Java");
		cursoJava.setDescricao("Fundamentos Java");
		cursoJava.setCargaHoraria(8);
		
		Curso cursoJs = new Curso();
		cursoJs.setTitulo("Curso Javascript");
		cursoJs.setDescricao("Introdução ao Javascript");
		cursoJs.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria");
		mentoria.setDescricao("Mentoria Orientação a Objetos");
		mentoria.setData(LocalDate.now());
		
		
		
//		System.out.println(cursoJava);
//		System.out.println(cursoJs);
//		System.out.println(mentoria);
//		
		
		Bootcamp bootcampJava = new Bootcamp();
		bootcampJava.setNome("Bootcamp Java Developer");
		bootcampJava.setDescricao("O que acha de aprender Java do zero e com os melhores experts da DIO? Bora! ");
		bootcampJava.getConteudos().add(cursoJava);
		bootcampJava.getConteudos().add(mentoria);
		
		Bootcamp bootcampJs = new Bootcamp();
		bootcampJs.setNome("Bootcamp Javascript Developer");
		bootcampJs.setDescricao("O que acha de aprender Javascript do zero e com os melhores experts da DIO? Bora! ");
		bootcampJs.getConteudos().add(cursoJs);
		bootcampJs.getConteudos().add(mentoria);
		
		
		
		Dev devAndressa = new Dev();
		devAndressa.setNome("Andressa");
		devAndressa.inscreverBootcamp(bootcampJava);
		System.out.println("Conteúdos inscritos Andressa" + devAndressa.getConteudosIncritos());
		devAndressa.progredirBootcamp();
		devAndressa.progredirBootcamp();
		devAndressa.progredirBootcamp();
		System.out.println("-");
		System.out.println("Conteúdos inscritos Andressa" + devAndressa.getConteudosIncritos());
		System.out.println("Conteúdos Concluídos Andressa" + devAndressa.getConteudosConcluidos());
		System.out.println("XP" + devAndressa.calcularTotalXpBootcamp());
		
		System.out.println("-------------");
		
		Dev devHelena = new Dev();
		devHelena.setNome("Helena");
		devHelena.inscreverBootcamp(bootcampJs);
		System.out.println("Conteúdos inscritos Helena" + devHelena.getConteudosIncritos());
		devHelena.progredirBootcamp();
		System.out.println("-");
		System.out.println("Conteúdos inscritos Helena" + devHelena.getConteudosIncritos());
		System.out.println("Conteúdos Concluídos Helena" + devHelena.getConteudosConcluidos());
		System.out.println("XP" + devHelena.calcularTotalXpBootcamp());
		
	}

}
