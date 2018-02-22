package br.com.proj.dados;

import java.util.List;

import br.com.proj.entidade.Moto;

public class MotoDB implements IMotoDB{

	public MotoDB() {
		//AbERTURA DE CONEXAO COM A BASE DE DADOS
		
	}
	
	public boolean insert (Moto moto) {
		 System.out.println("ID:" +moto.getId());
		 System.out.println("Descricao: " +moto.getDescricao());
		 System.out.println("Ano: " +moto.getAno());
		
		// implementar insert banco de dado0s
		return true;
	}

	@Override
	public boolean update(Moto moto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Moto moto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Moto> select() {
		// TODO Auto-generated method stub
		return null;
	}
}
