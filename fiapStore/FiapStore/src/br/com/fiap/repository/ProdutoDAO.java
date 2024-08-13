package br.com.fiap.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connnection.ConnectionFactory;
import br.com.fiap.model.Produto;
import br.com.fiap.model.Usuario;



public class ProdutoDAO {

	private Connection conexao;

	public ProdutoDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}

	public void insert(Produto produto) {
		String sql = "insert into usuarios(Nome, Quantifade, Valor, Produto, ID_Categoria) values (?,?,?,?,?)";
		PreparedStatement stmt;
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setInt(2,  produto.getQuantidade());
			stmt.setDouble(3,  produto.getValor());
			stmt.setDate(4,  produto.getData());
			stmt.setInt(5, produto.getCategoria().getId());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Produto> selectAll() {
		List<Produto> produtos = new ArrayList<Produto>();
		String sql = "select * from usuarios order by nome";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Produto produto = new Produto();
				produto.setCodigo(rs.getInt("id"));
				produto.setNome(rs.getString("nome"));
				produto.setCategoria(rs.getString("categoria"));
				produto.setQuantidade(rs.getInt(produto.getQuantidade()));
				produto.setData(rs.getDate("data"));
				produtos.add(produto);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return produtos;
	}

	public Usuario selectById(int id) throws SQLException {
		Usuario usuario = null;
		String sql = "select * from usuarios where id=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				usuario = new Usuario();
				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setEmail(rs.getString("email"));
				usuario.setSenha(rs.getString("senha"));
				usuario.setData(rs.getDate("data"));
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}

	public void delete(int id) {
		String sql = "delete from usuarios where id=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(Usuario usuario) {
		String sql = "update usuarios set nome=?, email=?, senha=? where id=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getEmail());
			stmt.setString(3, usuario.getSenha());
			stmt.setLong(4, usuario.getId());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
