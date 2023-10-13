package Crud;


public class Teste {
	
	public static void main(String[] args) {
		
		PessoaFisica PessoaFisica = new PessoaFisica();
		PessoaJuridica PessoaJuridica = new PessoaJuridica();
		IPessoaFisica rPf = new IPessoaFisica();
		IPessoaJuridica rPj = new IPessoaJuridica();
		
		PessoaFisica.setNome("Gabriela Machado");
		PessoaFisica.setCpf(256987458);
		PessoaJuridica.setNome("Empresa de colchão");
		PessoaJuridica.setCnpj(125456205);
		
		if(rPf.salvar(PessoaFisica)) {
			System.out.println("salvar Cpf");
		}
		
		if(rPj.salvar(PessoaJuridica)) {
			System.out.println("salvar Cnpj");
		}
		
		System.out.println("Pessoa Fisica: " + ((Pessoa) rPf.retornaLista().get(0)).getNome()+" - cpf:"+ ((PessoaFisica) rPf.retornaLista().get(0)).getCpf());
		System.out.println("Pessoa Juridica: " + ((Pessoa) rPj.retornaLista().get(0)).getNome()+" - Cnpj:"+ ((PessoaJuridica) rPj.retornaLista().get(0)).getCnpj());
		
		PessoaFisica.setNome("editar cpf");
		PessoaFisica.setCpf(1265412002);
		PessoaJuridica.setNome("editar cnpj");
		PessoaJuridica.setCnpj(852250001);
		
		if(rPf.atualiza(PessoaFisica)) {
			System.out.println("Cpf atualizado");
		}
		if(rPj.atualiza(PessoaJuridica)) {
			System.out.println("Cnpj atualizado");
		}
		
		System.out.println("Pessoa Fisica: " + ((Pessoa) rPf.retornaLista().get(0)).getNome()+" - Cpf:" + ((PessoaFisica) rPf.retornaLista().get(0)).getCpf());
		System.out.println("Pessoa Juridica: " + ((Pessoa) rPj.retornaLista().get(0)).getNome()+" - Cnpj:" + ((PessoaJuridica) rPj.retornaLista().get(0)).getCnpj());
		
		if(rPf.apagar(PessoaFisica.getCpf())) {
			System.out.println("Cpf apagado");
		}
		
		if(rPj.apagar(PessoaJuridica.getCnpj())) {
			System.out.println("Cnpj apagado");
		}
		
		
	}

}



	
	
	
