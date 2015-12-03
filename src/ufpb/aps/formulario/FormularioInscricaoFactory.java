package ufpb.aps.formulario;

import ufpb.aps.factory.Campo;
import ufpb.aps.factory.FormularioFactory;

public class FormularioInscricaoFactory implements FormularioFactory{
	
	private static FormularioInscricaoFactory singleton;
	
	private FormularioInscricaoFactory(){};
	
	public static FormularioFactory getInstance() {

		if(singleton == null){
			singleton = new FormularioInscricaoFactory();
		}
		return singleton;
	}
	

	@Override
	public Campo criarCampoSenha(int tamanho, String id, String label) {
		return new CampoSenha();
	}

	@Override
	public Campo criarCampoNumerico(int tamanho, String id, String label) {
		return new CampoNumerico();
	}

	@Override
	public Campo criarCampoEmail(int tamanho, String id, String label) {
		return new CampoEmail();
	}

	@Override
	public Campo criarCampoTexto(int tamanho, String id, String label) {
		return new CampoTexto();
	}

}
