package ufpb.aps.main;

import ufpb.aps.formulario.FormularioInscricaoFactory;
import ufpb.aps.gerenciador.GerenciadorFormulario;

public class Main {

	public static void main(String[] args) {
		
		GerenciadorFormulario gerenciador = new GerenciadorFormulario();
		gerenciador.montarFormulario(FormularioInscricaoFactory.getInstance());
			
	}
}
