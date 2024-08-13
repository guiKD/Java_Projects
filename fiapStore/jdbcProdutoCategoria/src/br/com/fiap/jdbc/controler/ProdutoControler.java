package br.com.fiap.jdbc.controler;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.jdbc.dao.ProdutoDAO;
import br.com.fiap.jdbc.factory.ConnectionFactory;
import br.com.fiap.jdbc.model.Produto;

public class ProdutoControler {

	private ProdutoDAO produtoDAO;

	public ProdutoControler(ProdutoDAO produtoDAO) {
		Connection connection = new ConnectionFactory().getConnection();
		this.produtoDAO = produtoDAO;
	}
	
	public void salvarComCategoria(Produto produto) {
		this.produtoDAO.SalvarcomCategoria(produto);
	}
	
	public List<Produto> listarTodos(){
		return this.produtoDAO.ListarTodos();
	}
	
	public List<Produto> listarPorCategoria(int idCategoria){
		return this.produtoDAO.ListarporCategoria(idCategoria);
	}
	
	public void alterar(Produto produto) {
		this.produtoDAO.alterar(produto);
	}
	
	public void excluir(int idProduto) {
		this.produtoDAO.excluir(idProduto);
	}
}
