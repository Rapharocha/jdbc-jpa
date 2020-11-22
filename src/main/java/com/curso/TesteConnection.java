package com.curso;

import java.sql.SQLException;
import java.util.List;

import com.curso.dao.AlunoDAO;
import com.curso.model.Aluno;

public class TesteConnection {

	public static void main(String[] args) throws SQLException {
		
		
		AlunoDAO alunoDAO = new AlunoDAO();
		
		
//		
//		System.out.println(" Consulta Lista : "+ alunoDAO.list() );
//		
//		
//		Aluno alunoParaConsulta = alunoDAO.getById(5);
//		System.out.println(" Consulta por id : " + alunoParaConsulta );
//		
//		Aluno alunoParaInsercao = new Aluno();
//		alunoParaInsercao.setNome("Carolina");
//		alunoParaInsercao.setIdade(42);
//		alunoParaInsercao.setEstado("Rio de Janeiro");
//		
//		alunoDAO.create(alunoParaInsercao);
//		
//		System.out.println(alunoDAO.list());
		
//		alunoDAO.deletar(2);
			
		List<Aluno> alunos = alunoDAO.list();
		alunos.stream().forEach(System.out::println);
		
		Aluno alunoAtualizado = alunoDAO.getById(3);
		alunoAtualizado.setNome("Roberto");
		alunoAtualizado.setIdade(76);
		alunoAtualizado.setEstado("Congonhas");
		
		alunoDAO.update(alunoAtualizado);
		
		List<Aluno> alunosAtualizado = alunoDAO.list();
		alunosAtualizado.stream().forEach(System.out::println);
		

	}

}
