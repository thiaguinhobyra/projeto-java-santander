package candidatura;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        ArrayList<String> candidatosSelecao = selecaoCandidatos();
        for (String candidato: candidatosSelecao) {
            contatosContactados(candidato);
        }
    }

    static ArrayList<String> contatosContactados(String candidato) {
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        ArrayList<String> seleccionadosContactados = new ArrayList<>();
        
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando) {
                tentativas++;
            } else {
                System.out.println("Contato realizado com sucesso com o(a) candidato: " + candidato);
                seleccionadosContactados.add(candidato);
            }
        } while (continuarTentando && tentativas<3);

        if(atendeu) {
            System.out.println("Conseguimos contato com " + candidato + ", na " + tentativas + " tentativa");
        } else 
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de " + tentativas + " tentativas realizadas.");

        return seleccionadosContactados;
    }

    static ArrayList<String> selecaoCandidatos() {
        String [] candidatos = {"ana","beatriz","thiago","araujo","machado","oliveira","carrias","irene","hamiltons"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        int vagas = 5;
        ArrayList<String> seleccionados = new ArrayList<>();
        while (candidatoAtual < vagas && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "  + candidato + " solicitou o valor de salario: " + salarioPretendido);
           
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado.");
                seleccionados.add(candidato);
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
        System.out.println(seleccionados);

        return seleccionados;
        // for (int i = 0; i < candidatos.length; i++) {
        //     System.out.println("Candidato " + (i+1) + " " + candidatos[i] + " foi selecionado.");
        // }
    
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
}
    static double valorPretendido() {
            return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // static void analizarCandidato(double salarioPretendido){
    //     double salarioBase = 4000.00;
    //     if (salarioBase > salarioPretendido) {
    //         System.out.println("Ligar para o candidato. ");
    //     } else if (salarioBase == salarioPretendido) {
    //         System.out.println("Ligar para o candidato com contra proposta. ");
    //     } else {
    //         System.out.println("Aguradando resultado dos demais candidatos. ");
    //     }
    // }
}
