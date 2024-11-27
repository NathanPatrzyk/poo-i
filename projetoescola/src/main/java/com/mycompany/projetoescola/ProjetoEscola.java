package com.mycompany.projetoescola;

public class ProjetoEscola {

	public static void main(String[] args) {

		Disciplina programacaoOrientadaAObjetosI = new Disciplina("Programação Orientada a Objetos I", 252519,
				72.0,
				50);
		Disciplina bancoDeDadosI = new Disciplina("Banco de Dados I", 898910, 36.0, 50);
		Disciplina desenvolvimentoWebI = new Disciplina("Desenvolvimento Web I", 590320, 72.0, 50);

		System.out.println();

		programacaoOrientadaAObjetosI.matricularAluno("AA-1234");
		programacaoOrientadaAObjetosI.matricularAluno("BB-5432");
		programacaoOrientadaAObjetosI.matricularAluno("CC-8765");
		programacaoOrientadaAObjetosI.matricularAluno("DD-1245");

		programacaoOrientadaAObjetosI.cancelarMatriculaAluno("CC-8765");

		bancoDeDadosI.matricularAluno("AA-2294");
		bancoDeDadosI.matricularAluno("BB-5432");
		bancoDeDadosI.matricularAluno("CC-2868");

		bancoDeDadosI.cancelarMatriculaAluno("AA-2294");

		desenvolvimentoWebI.matricularAluno("AA-2868");
		desenvolvimentoWebI.matricularAluno("BB-1646");
		desenvolvimentoWebI.matricularAluno("CC-5432");
		desenvolvimentoWebI.matricularAluno("DD-7535");
		desenvolvimentoWebI.matricularAluno("EE-1355");

		desenvolvimentoWebI.cancelarMatriculaAluno("BB-1646");
		desenvolvimentoWebI.cancelarMatriculaAluno("EE-1355");

		System.out.println("Quantidade de alunos matriculados em Programação Orientada a Objetos I: "
				+ programacaoOrientadaAObjetosI.quantosAlunosMatriculados());
		programacaoOrientadaAObjetosI.imprimirListaAlunos();
		System.out.println("\n" +
				"Quantidade de alunos matriculados em Banco de Dados I: "
				+ bancoDeDadosI.quantosAlunosMatriculados());
		bancoDeDadosI.imprimirListaAlunos();
		System.out.println("\n" +
				"Quantidade de alunos matriculados em Desenvolvimento Web I: "
				+ desenvolvimentoWebI.quantosAlunosMatriculados());
		desenvolvimentoWebI.imprimirListaAlunos();

		Curso tads = new Curso();
		tads.setNome("TADS");
		tads.cadastrarDisciplina(programacaoOrientadaAObjetosI);
		tads.cadastrarDisciplina(bancoDeDadosI);
		tads.cadastrarDisciplina(desenvolvimentoWebI);

		System.out.println("\nO curso de " + tads.getNome() + " tem " + tads.quantidadeDeDisciplinas() + " disciplinas");

		tads.mostrarCargaHorariaDasDisciplinas();

		System.out.println("\nO curso de " + tads.getNome() + " possui a carga horária total de " + tads.horasDoCurso());

		tads.removerDisciplina(programacaoOrientadaAObjetosI);

		System.out.println("\nO curso de " + tads.getNome() + " tem " + tads.quantidadeDeDisciplinas() + " disciplinas");

		tads.mostrarCargaHorariaDasDisciplinas();
	}

}
