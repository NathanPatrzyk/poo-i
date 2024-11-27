package com.mycompany.projetoescola;

public class Disciplina {
    private String nome;
    private int codigo;
    private Double cargaHoraria;
    private int qtdeVagas;
    private int matriculaProfa;
    private String matriculaAluno[];

    public Disciplina(String nome, int codigo, Double cargaHoraria, int qtdeVagas) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.qtdeVagas = qtdeVagas;
        this.matriculaAluno = new String[qtdeVagas];
    }

    public int quantosAlunosMatriculados() {
        if (matriculaAluno == null) {
            return 0;
        }

        int qtdeAlunosMatriculados = 0;

        for (int i = 0; i < matriculaAluno.length; i++) {
            if (matriculaAluno[i] != null) {
                qtdeAlunosMatriculados++;
            }
        }
        return qtdeAlunosMatriculados;
    }

    public void matricularAluno(String matricula) {
        int qtdeMatriculados = quantosAlunosMatriculados();

        if (qtdeMatriculados < qtdeVagas) {
            for (int i = 0; i < matriculaAluno.length; i++) {
                if (matriculaAluno[i] == null) {
                    matriculaAluno[i] = matricula;
                    break;
                }
            }
            System.out.println("Aluno matriculado com sucesso: " + matricula + "\n");
        } else {
            System.out.println("Não há vagas disponíveis.");
        }
    }

    public void cancelarMatriculaAluno(String matricula) {
        if (quantosAlunosMatriculados() == 0) {
            System.out.println("Não há alunos matriculados nesta disciplina");
        } else {
            for (int i = 0; i < matriculaAluno.length; i++) {
                if (matriculaAluno[i] != null) {
                    if (matriculaAluno[i].compareTo(matricula) == 0) {
                        matriculaAluno[i] = null;
                        System.out.println("Matricula " + matricula + " cancelada com sucesso\n");
                    }

                }
            }
        }
    }

    public void imprimirListaAlunos() {
        for (int i = 0; i < matriculaAluno.length; i++) {
            if (matriculaAluno[i] != null) {
                System.out.println((i + 1) + " - " + matriculaAluno[i]);
            }
        }
    }

    public void encerramentoDisciplina() {
        System.out.println("Executar e informar todos os departamentos sobre encerramento da discplina");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getQtdeVagas() {
        return qtdeVagas;
    }

    public void setQtdeVagas(int qtdeVagas) {
        this.qtdeVagas = qtdeVagas;
    }

    public int getMatriculaProfa() {
        return matriculaProfa;
    }

    public void setMatriculaProfa(int matriculaProfa) {
        this.matriculaProfa = matriculaProfa;
    }

}
