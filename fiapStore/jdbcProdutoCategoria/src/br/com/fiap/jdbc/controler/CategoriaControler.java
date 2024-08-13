package br.com.fiap.jdbc.controler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.jdbc.dao.CategoriaDAO;
import br.com.fiap.jdbc.factory.ConnectionFactory;
import br.com.fiap.jdbc.model.Categoria;

public class CategoriaControler {

	private CategoriaDAO categoriaDAO;

	public CategoriaControler(CategoriaDAO categoriaDAO) {
		Connection connection = new ConnectionFactory().getConnection();
		this.categoriaDAO = categoriaDAO;
	}
	
	public List<Categoria> listarTodas() throws SQLException{
		return this.categoriaDAO.ListarTodas();
	}
	
	public List<Categoria> listarComProduto() throws SQLException{
		return this.categoriaDAO.listarcomProduto();
	}
}
