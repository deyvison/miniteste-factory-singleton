package ufpb.aps.factory;

public interface FormularioFactory {
	
	public Campo criarCampoSenha(int tamanho, String id, String label);
	
	public Campo criarCampoNumerico(int tamanho, String id, String label);
	
	public Campo criarCampoEmail(int tamanho, String id, String label);
	
	public Campo criarCampoTexto(int tamanho, String id, String label);
	
}
