package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Aluno;


public class AlunoController {

	public static void main(String[] args) {
		
		//1.a)
		
		 	System.out.println("1.a)");
			
			//Construtor padrão
			Aluno aluno1 = new Aluno();
			System.out.println(aluno1);
			
			Aluno aluno2 = new Aluno();
			System.out.println(aluno2);
			
			//Construtor parametrizado com todos os atributos
			Aluno aluno3 = new Aluno(3, 1234, "Pedro", "Silva", "pedro@gmail.com");
			System.out.println(aluno3);
			
			Aluno aluno4 = new Aluno(4, 4567, "João", "Gonçalves", "joao@gmail.com");
			System.out.println(aluno4);
			
			Aluno aluno5 = new Aluno(5, "maria@gmail.com");
			System.out.println(aluno5);
			
			Aluno aluno6 = new Aluno(6, "fernanda@gmail.com");
			System.out.println(aluno6);	
			
		//1.b)
			
			System.out.println("\n\n1.b)");
			
			aluno1.setId(1);
			aluno1.setCpf(141516);
			aluno1.setNome("Rafael");
			aluno1.setSobrenome("Oliveira");
			aluno1.setEmail("rafael@gmail.com");
			 System.out.println();
			 System.out.println(aluno1.getId());
			 System.out.println(aluno1.getCpf());
			 System.out.println(aluno1.getNome());
			 System.out.println(aluno1.getSobrenome());
			 System.out.println(aluno1.getEmail());
			 
			 aluno2.setId(2);
				aluno2.setCpf(171819);
				aluno2.setNome("Felipe");
				aluno2.setSobrenome("Pereira");
				aluno2.setEmail("felipe@gmail.com");
				 System.out.println();
				 System.out.println(aluno2.getId());
				 System.out.println(aluno2.getCpf());
				 System.out.println(aluno2.getNome());
				 System.out.println(aluno2.getSobrenome());
				 System.out.println(aluno2.getEmail());
				 
				 //2)
				 
				 System.out.println("\n2.List)");
				 
				 //Criando a List
				 List<Aluno> alunos = new ArrayList<>();
				 alunos.add(aluno1);
				 alunos.add(aluno2);
				 alunos.add(aluno3);
				 alunos.add(aluno4);
				 alunos.add(aluno5);
				 alunos.add(aluno6);
				 System.out.println("\nList na ordem original \n" + alunos);	
				 
				 //Imprimindo objeto da List com id 5
				 
				 Aluno alunobusc = alunos.stream().filter(a -> a.getId() == (5)).findAny().orElse(null) ;
				 System.out.println("\nAluno com id 5\n" + alunobusc);
				 
				 //List na ordem decrescente;
				 alunos.sort(Comparator.comparingInt(Aluno::getId).reversed());
				 System.out.println("\nList na ordem decrescente \n" + alunos);
				 
				 System.out.println("\n2.Map)");
				 
				 //Listando na coleção Map
				 
				 Map<String , Aluno> alunosMap = new HashMap<>();
				 alunosMap.put(aluno1.getEmail(), aluno1);
				 alunosMap.put(aluno2.getEmail(), aluno2);
				 alunosMap.put(aluno3.getEmail(), aluno3);
				 alunosMap.put(aluno4.getEmail(), aluno4);
				 alunosMap.put(aluno5.getEmail(), aluno5);
				 alunosMap.put(aluno6.getEmail(), aluno6);
				 System.out.println("\nListando a coleção Map\n");
				 System.out.println(alunosMap);
				 
	}

}
