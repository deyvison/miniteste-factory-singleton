package ufpb.aps.gerenciador;

import ufpb.aps.factory.FormularioFactory;

public class GerenciadorFormulario {
	
	public void montarFormulario(FormularioFactory formulario){
		
		formulario.criarCampoEmail(30, "1", "Email");
		formulario.criarCampoNumerico(20, "2", "Idade");
		formulario.criarCampoSenha(30, "3", "Senha");
		formulario.criarCampoTexto(100, "4","Descrição");
		
	}
}
