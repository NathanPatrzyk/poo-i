package com.mycompany.projetoescola;

import java.util.ArrayList;
import java.util.List;

public class Curso {
  private int codigo;
  private String nome;
  private int duracao;
  private String turno;
  private List<Disciplina> disciplinas;
  private int vagas;

  public Curso() {
    this.disciplinas = new ArrayList<Disciplina>();
  }

  public Double horasDoCurso() {
    Double acumulador = 0.0;
    for (int i = 0; i < quantidadeDeDisciplinas(); i++) {
      acumulador += disciplinas.get(i).getCargaHoraria();
    }
    return acumulador;
  }

  public void mostrarCargaHorariaDasDisciplinas() {
    for (int i = 0; i < quantidadeDeDisciplinas(); i++) {
      System.out.println(
          "\nA disciplina de " + disciplinas.get(i).getNome() + " possui a carga horária de " +
              disciplinas.get(i).getCargaHoraria());
    }

    // disciplinas.forEach((Disciplina disciplina) -> {
    // System.out.println(
    // "\nA matéria " + disciplina.getNome() + " possui a carga horária de " +
    // disciplina.getCargaHoraria());
    // });
  }

  public void cadastrarDisciplina(Disciplina disciplina) {
    this.disciplinas.add(disciplina);
  }

  // public void removerDisciplina(Disciplina disciplina) {
  // this.disciplinas.remove(disciplina);
  // }

  public void removerDisciplina(Disciplina disciplina) {
    this.disciplinas.remove(disciplinas.indexOf(disciplina));
  }

  public int quantidadeDeDisciplinas() {
    return this.disciplinas.size();
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getDuracao() {
    return duracao;
  }

  public void setDuracao(int duracao) {
    this.duracao = duracao;
  }

  public String getTurno() {
    return turno;
  }

  public void setTurno(String turno) {
    this.turno = turno;
  }

  public int getVagas() {
    return vagas;
  }

  public void setVagas(int vagas) {
    this.vagas = vagas;
  }
}
