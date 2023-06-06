package br.edu.ifsp.application;

import br.edu.ifsp.domain.AC;
import br.edu.ifsp.domain.Barragem;
import br.edu.ifsp.domain.SS;
import br.edu.ifsp.domain.SSA;

public class Main {
    public static void main(String[] args) {
        // Criar barragem
        Barragem barragem = new Barragem();

        // Criar dispositivos
        SS ss1 = new SS();
        SS ss2 = new SS();
        SSA ssa1 = new SSA(3.0);
        SSA ssa2 = new SSA(4.0);
        AC ac1 = new AC(1);
        AC ac2 = new AC(2);

        // Registrar observadores na barragem
        barragem.adicionarObservador(ss1);
        barragem.adicionarObservador(ss2);
        barragem.adicionarObservador(ssa1);
        barragem.adicionarObservador(ssa2);
        barragem.adicionarObservador(ac1);
        barragem.adicionarObservador(ac2);

        // Incrementar sismos

        barragem.incrementarSismos(); // 1 sismo

        // Verificar estado dos dispositivos
        System.out.println("SS1: " + ss1.isSismo()); // true
        System.out.println("SS2: " + ss2.isSismo()); // true
        System.out.println("SSA1: " + ssa1.getNivel()); // 1.0
        System.out.println("SSA2: " + ssa2.getNivel()); // 1.0
        // Nenhum alarme sonoro emitido

        // Incrementar sismos
        barragem.incrementarSismos(); // 2 sismos

        // Verificar estado dos dispositivos
        System.out.println("SS1: " + ss1.isSismo()); // true
        System.out.println("SS2: " + ss2.isSismo()); // true
        System.out.println("SSA1: " + ssa1.getNivel()); // 2.0
        System.out.println("SSA2: " + ssa2.getNivel()); // 2.0
        // Nenhum alarme sonoro emitido

        // Incrementar sismos
        barragem.incrementarSismos(); // 3 sismos

        // Verificar estado dos dispositivos
        System.out.println("SS1: " + ss1.isSismo()); // true
        System.out.println("SS2: " + ss2.isSismo()); // true
        System.out.println("SSA1: " + ssa1.getNivel()); // 3.0
        System.out.println("SSA2: " + ssa2.getNivel()); // 3.0
        // O AC1 emite um alarme sonoro de evacuação

        // Incrementar sismos
        barragem.incrementarSismos(); // 4 sismos

        // Verificar estado dos dispositivos
        System.out.println("SS1: " + ss1.isSismo()); // true
        System.out.println("SS2: " + ss2.isSismo()); // true
        System.out.println("SSA1: " + ssa1.getNivel()); // 4.0
        System.out.println("SSA2: " + ssa2.getNivel()); // 4.0
        // O AC2 emite um alarme sonoro de evacuação






    }
}