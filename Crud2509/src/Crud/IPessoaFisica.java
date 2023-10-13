package Crud;

import java.util.ArrayList;
import java.util.List;

public class IPessoaFisica implements IpessoaCRUD {
	
	List<PessoaFisica> listaPF = new ArrayList<PessoaFisica>();
	

	@Override
	public boolean atualiza(Pessoa pessoa) {
		boolean ok = false;
		PessoaFisica pf = (PessoaFisica) pessoa;
		// TODO Auto-generated method stub
		try {
			for(int i = 0; i < listaPF.size(); i++ ) {
				if(listaPF().get(i).getNome().equals(pf.getNome())) {
					listaPF().get(i).setNome(pf.getNome());
					listaPF().get(i).setCpf(pf.getCpf());
					
					ok = true;
				}
			}
		} catch (Exception e) {
			ok = false;
		}                                       
		
		  return ok;
	} 

	private List<PessoaFisica> listaPF() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean salvar(Pessoa pessoa) {
		boolean ok;
		
		try{
			listaPF.add((PessoaFisica) pessoa);
			ok =  true;			
		} catch (Exception e) {
			ok = false;
		}
		
		return ok;
	}

	public boolean apagar(int cpf) {
		boolean ok = false;
		try {
			for(int i = 0; i < listaPF.size(); i++) {
				if(listaPF.get(i).getCpf()==cpf) {
					listaPF.remove(i);
					ok = true;
				}
			}
		} catch (Exception e) {
			ok = false;
		}
		
		return ok;
		
	}

	@Override
	public List<?> retornaLista() {
		return listaPF;
	}

	
	}

	
	


