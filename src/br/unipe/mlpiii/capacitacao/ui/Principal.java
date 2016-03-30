package br.unipe.mlpiii.capacitacao.ui;

import java.util.Scanner;

import br.unipe.mlpiii.capacitacao.modelo.Aluno;
import br.unipe.mlpiii.capacitacao.modelo.CursoCapacitacao;
import br.unipe.mlpiii.capacitacao.modelo.Pessoa;
import br.unipe.mlpiii.capacitacao.modelo.Professor;

public class Principal {
	public static void main(String[] args) {

		int menu = 99;
		Pessoa professor = new Professor("Jefferson", 1, "O.O");
		CursoCapacitacao curso = new CursoCapacitacao((Professor) professor, "MLPIII", 1);
		Aluno aluno;

		do {

			System.out.println("1 - Incluir Aluno\n2 - Romover Aluno\n3 - Verificar se aluno está matriculado"
					+ "\n4 - Alunos aprovados\n5 - Alunos reprovados\n6 - Lista de alunos  ordenada\n0 - Sair");
			Scanner lerMenu = new Scanner(System.in);
			menu = lerMenu.nextInt();

			switch (menu) {
			case 1: {
				System.out.println("Nome: ");
				Scanner nome = new Scanner(System.in);
				String nomeAluno = nome.nextLine();
				System.out.println("Matricula");
				Scanner mat = new Scanner(System.in);
				int matricula = mat.nextInt();
				System.out.println("Media");
				double media = mat.nextDouble();
				System.out.println("Faltas");
				int faltas = mat.nextInt();
				aluno = new Aluno("", 1, 1, 1);
				aluno.setNome(nomeAluno);
				aluno.setMatricula(matricula);
				aluno.setMedia(media);
				aluno.setFaltas(faltas);
				curso.getAlunos().add(aluno);
			}
				break;
			case 2: {
				System.out.println("Remover aluno\nInfor a matricula: ");
				Scanner mat = new Scanner(System.in);
				int matricula = mat.nextInt();
				Aluno excluir = curso.buscaAluno(matricula);
				curso.getAlunos().remove(excluir);
				System.out.println("Aluno excluido com sucesso");
			}
				break;
			case 3: {
				System.out.println("Informe a Matricula: ");
				Scanner mat = new Scanner(System.in);
				int matricula = mat.nextInt();
				if (curso.buscaAluno(matricula) != null) {
					System.out.println("Aluno matriculado");
				} else {
					System.out.println("Aluno nao matriculado");
				}
			}
				break;
			case 4: {
				System.out.println("Alunos aprovados por média");
				for (int i = 0; i < curso.getAlunos().size(); i++) {
					if (curso.getAlunos().get(i).getMedia() >= 7 && curso.getAlunos().get(i).getFaltas() < 15)
						System.out.println(curso.getAlunos().get(i));
				}
			}
				break;
			case 5: {
				System.out.println("Alunos reprovados por falta");
				for (int i = 0; i < curso.getAlunos().size(); i++) {
					if (curso.getAlunos().get(i).getFaltas() >= 15)
						System.out.println(curso.getAlunos().get(i));
				}
			}
				break;
			case 6: {
				System.out.println(curso.getAlunos());
			}
				break;
			}

		} while (menu != 0);

	}

}
