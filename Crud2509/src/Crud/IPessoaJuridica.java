package Crud;

import java.util.ArrayList;
import java.util.List;


public  class IPessoaJuridica  implements IpessoaCRUD{
	List<PessoaJuridica> listaPJ = new ArrayList<PessoaJuridica>();

	public boolean atualiza(Pessoa pessoa) {
		boolean ok = false;
		PessoaJuridica pj = (PessoaJuridica) pessoa;
		try {
			for (int i = 0; i < listaPJ.size(); i++) {
				if (listaPJ().get(i).getNome().equals(pj.getNome())) {
					listaPJ().get(i).setNome(pj.getNome());
					listaPJ().get(i).setCnpj(pj.getCnpj());
					
					ok = true;
				}
			}
		} catch (Exception e) {
			ok = false;
		}
		
		return ok;
	}

	private List<PessoaJuridica> listaPJ() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean salvar(Pessoa pessoa) {
		boolean ok = false;
		try {
			listaPJ.add((PessoaJuridica) pessoa);
			ok = true;
		} catch (Exception e) {
			ok = false;
		}
		
		return ok;
	}

	public boolean apagar(int cnpj) {
		boolean ok = false; 
		try {
			for (int i = 0; i < listaPJ.size(); i++) {
				if(listaPJ.get(i).getCnpj()==cnpj) {
					listaPJ.remove(i);
					ok = true;
				}
			}
		} catch (Exception e) {
			ok = false;
		}
		
		// TODO Auto-generated method stub
		return ok;
	}

	@Override
	public List<?> retornaLista() {
		// TODO Auto-generated method stub
		return listaPJ;


}



	
	}
