package com.alisson.exercicio3;

public class PreparadorFisico {
	
	private String nomeAtleta[];
	private double tempos[];

	public PreparadorFisico() {
		this.nomeAtleta = new String[15];
		this.tempos = new double[15];
	}
	
	public double getMedia() {
		double soma = 0;
		for(int i = 0; i < tempos.length; i++) {
			soma += this.tempos[i];
		}
		return soma / tempos.length;
	}
		
	public double getMaior() {
		double maior = this.tempos[0];
		for(int i = 1; i < tempos.length; i++) {
			if(maior < this.tempos[i]) {
				maior = this.tempos[i];
			}
		}
		return maior;
	}
	
	public double getMenor() {
		double menor = this.tempos[0];
		for(int i = 1; i < tempos.length; i++) {
			if(menor > this.tempos[i]) {
				menor = this.tempos[i];
			}
		}
		return menor;
	}
	
	public String[] getAtletas() {
		return this.nomeAtleta;
	}

	public double[] getTempos() {
		return this.tempos;
	}
	
	                             
	public void setTempos(int i, double tempo) {
		if(tempo > 0) {
			this.tempos[i] = tempo;
		}
	}
	
	public void setNomes(int i, String nome) {
			this.nomeAtleta[i] = nome;
	}
}
