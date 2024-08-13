package br.com.fiap.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.jdbc.model.Produto;

public class ProdutoDAO {

	private Connection connection;

	public ProdutoDAO(Connection connction) {
		this.connection = connction;
	}
	
	public void SalvarcomCategoria(Produto produto) {
		try {
			String sql = "INSERT INT PRODUTO( NOME , DESCRICAO, PRECO, IdCategoria) VALUES (?,?,?,?)";
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getDescricao());
			stmt.setDouble(3, produto.getPreco());
			stmt.setInt(4, produto.getIdCategoria());
			
			stmt.execute();
			stmt.close();
		}catch(SQLException e){
			throw new RuntimeException();
		}
	}
	
	public List<Produto>ListarTodos(){
		List<Produto> produtos = new ArrayList<Produto>();
		try {
			String sql = "SELECTED * FROM PRODUTO";
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				Produto produto = new Produto();
				produto.setIdProduto(rs.getInt(1));
				produto.setNome(rs.getString(2));
				produto.setDescricao(rs.getString(3));
				produto.setPreco(rs.getDouble(4));
				produto.setIdCategoria(rs.getInt(5));
				produtos.add(produto);
			}
			stmt.close();
			rs.close();
			return produtos;
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	
	public List<Produto> ListarporCategoria(int idCategoria){
		List<Produto> produtos = new ArrayList<Produto>();
		try {
			String sql = "SELECTED * FROM PRODUTO idCategoria = ?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, idCategoria);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Produto produto = new Produto();
				produto.setIdProduto(rs.getInt(1));
				produto.setNome(rs.getString(2));
				produto.setDescricao(rs.getString(3));
				produto.setPreco(rs.getDouble(4));
				produto.setIdCategoria(rs.getInt(5));
				produtos.add(produto);
			}
			stmt.close();
			rs.close();
			return produtos;
		}catch (SQLException e){
			throw new RuntimeException(e); 
		}
	}

	public void alterar(Produto produto) {
		try {
			String sql = "UPDATE PRODUTO P SET P.nome = ?, P.descicao = ?, P.preco = ?, P.idCategoria = ?, WHERE idProduto = ?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getDescricao());
			stmt.setDouble(3, produto.getPreco());
			stmt.setInt(4, produto.getIdCategoria());
			stmt.setInt(5, produto.getIdProduto());
			stmt.execute();
			stmt.close();
			
		}catch (SQLException e){
			throw new RuntimeException(e); 
		}
	}

	public void excluir(int id) {
		try {
			String sql = "DELETE FORM WHERE idProduto = ?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			stmt.close();
		}catch (SQLException e){
			throw new RuntimeException(e); 
		}
		
	}

}
