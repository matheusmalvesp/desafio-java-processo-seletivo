import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {

		System.out.println("Processo Seletivo");
		selecionarCandidatos();
	}

	static void selecionarCandidatos() {
		String[] candidatos = { "ANA", "CARLOS", "BEATRIZ", "DANIEL", "FERNANDA", "GUSTAVO", "ISABELA", "JORGE", "LAURA", "MARCOS" };

		int candidatosSelecionados = 0;
		int candidatoAtual = 0;

		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = gerarSalarioPretendido();

            System.out.printf("\nO candidato %s solicitou um salário de %.2f", candidato, salarioPretendido);
            if (salarioPretendido <= 2000.0) {
                System.out.printf("\nO candidato %s foi escolhido para a vaga\n", candidato);
                candidatosSelecionados++;
            }else{
                System.out.printf("\nO candidato %s não foi escolhido para a vaga\n", candidato);
            }
            candidatoAtual++;
		}
        System.out.printf("\nForam selecionados %d candidatos\n", candidatosSelecionados);
	}

	static double gerarSalarioPretendido() {
		return ThreadLocalRandom.current().nextDouble(1850, 2200);
	}

}
