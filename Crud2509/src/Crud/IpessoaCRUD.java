package Crud;

import java.util.List;

public interface IpessoaCRUD {
	
	public boolean atualiza(Pessoa pessoa);
	public boolean salvar(Pessoa pessoa);
	public boolean apagar(int id);
	public List<?> retornaLista();
	
	

}
