package com.alisson.exercicio3;

public class CondicoesPreparador {
		
	public void Menu() {
		
		PreparadorFisico p = new PreparadorFisico();
		
		String nome;
		double tempo;
		String[] atletas = p.getAtletas();
		double[] tempos = p.getTempos();
		
		String menu = "MENU PROGRAMA" +
				  "\n1 - Adicionar nome dos atletas\n" +
			      "2 - Adicionar tempo dos atletas\n" +
			      "3 - Verificar média dos tempos\n" +
			      "4 - Verificar maior e menor tempo\n" +
			      "5 - Listar atletas com tempo menor do que 10 segundos\n" +
				  "6 - Sair";
		
		int op = 0;
		while(op != 6) {
			op = Entrada.leiaInt(menu);
			if(op == 1) {
				for(int i = 0; i < atletas.length; i++) {
					nome = Entrada.leiaString("Digite o nome do(a) atleta");
					p.setNomes(i, nome);
				}
			}if(op == 2) {
				for(int i = 0; i < tempos.length; i++) {
					tempo = Entrada.leiaDouble("Digite o tempo do(a) atleta " + atletas[i]);
					if(tempo > 0) {
						p.setTempos(i, tempo);
					}else {
						while (tempo < 0) {
							tempo = Entrada.leiaDouble("Digite novamente o tempo do(a) atleta " + atletas[i]);
							p.setTempos(i, tempo);
						}
				}
			}
			}if(op == 3) {
				System.out.println("\nA média dos tempos é de " + p.getMedia() + " segundos");
			}if(op == 4) {
				for(int i = 0; i < tempos.length; i++) {
					if(tempos[i] == p.getMaior()) {
						System.out.println("\nO maior tempo foi de " + p.getMaior() + " segundos do(a) atleta " + atletas[i]);
					}
				}
				
				for(int i = 0; i < tempos.length; i++) {
					if(tempos[i] == p.getMenor()) {
						System.out.println("\nO menor tempo foi de " + p.getMenor() + " segundos do(a) atleta " + atletas[i]);
					}
				}
			}if(op == 5) {
				int c = 0;
				System.out.println("\nAtletas com tempo menor do que 10 segundos: \n");
				for(int i = 0; i < atletas.length; i++) {
					if(tempos[i] < 10) {
						System.out.println(atletas[i] + " com tempo de " + tempos[i] + " segundos");
						c = 1;
					}
				}
				if(c == 0) {
					System.out.println("Nenhum atleta ficou com tempo menor do que 10 segundos");
					}
				}
			}
			System.exit(1);
		}	
	}
