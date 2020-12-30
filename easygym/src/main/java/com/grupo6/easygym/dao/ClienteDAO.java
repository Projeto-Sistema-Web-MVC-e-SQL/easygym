package com.grupo6.easygym.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.grupo6.easygym.modelo.Cliente;
import com.grupo6.easygym.modelo.Funcionario;

public class ClienteDAO {
	public void inserir(Cliente cliente) {
		String sql =
				"insert into cliente(nome_cli, cpf_cli,email_cli,telefone_cli,cep_cli,end_cli,cidade_cli,estado_cli,cod_func) "
						+ "values(?,?,?,?,?,?,?,?,?)";
		Connection conexao = FabricaDeConexao.getConnection();

		try {
			PreparedStatement consulta = conexao.prepareStatement(sql);
			consulta.setString(1, cliente.getNome());
			consulta.setString(2, cliente.getCpf());
			consulta.setString(3, cliente.getEmail());
			consulta.setString(4, cliente.getTelefone());
			consulta.setString(5, cliente.getCep());
			consulta.setString(6, cliente.getEndereco());
			consulta.setString(7, cliente.getCidade());
			consulta.setString(8, cliente.getEstado());
			consulta.setInt(9, cliente.getFuncionario().getId());
			consulta.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Cliente> todos() {
		List<Cliente> lista = new ArrayList<Cliente>();
		String sql = "select * from cliente";
		Connection conexao = FabricaDeConexao.getConnection();

		try {
			PreparedStatement consulta = conexao.prepareStatement(sql);
			ResultSet resultado = consulta.executeQuery();

			while (resultado.next()) {
				Cliente cliente = extracted(resultado);
				lista.add(cliente);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}

	public void deletar(int id) {
		String sql = "delete from cliente where cod_cli=" + id;

		try {
			PreparedStatement consulta =
					FabricaDeConexao.getConnection().prepareStatement(sql);
			consulta.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void atualizar(Cliente cliente) {
		String sql = "UPDATE cliente"
				+ " SET nome_cli=?, cpf_cli=?, email_cli=?, telefone_cli=?, cep_cli=?, "
				+ " end_cli = ?, cidade_cli = ?, estado_cli=?, cod_func=? "
				+ " WHERE cod_cli = ?; ";

		try {
			PreparedStatement consulta =
					FabricaDeConexao.getConnection().prepareStatement(sql);
			consulta.setString(1, cliente.getNome());
			consulta.setString(2, cliente.getCpf());
			consulta.setString(3, cliente.getEmail());
			consulta.setString(4, cliente.getTelefone());
			consulta.setString(5, cliente.getCep());
			consulta.setString(6, cliente.getEndereco());
			consulta.setString(7, cliente.getCidade());
			consulta.setString(8, cliente.getEstado());
			consulta.setInt(9, cliente.getFuncionario().getId());
			consulta.setInt(10, cliente.getId());
			consulta.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private Cliente extracted(ResultSet resultado) throws SQLException {
		Cliente cliente = new Cliente();
		cliente.setCep(resultado.getString("cep_cli"));
		cliente.setCidade(resultado.getString("cidade_cli"));
		cliente.setCpf(resultado.getString("cpf_cli"));
		cliente.setEmail(resultado.getString("email_cli"));
		cliente.setEndereco(resultado.getString("end_cli"));
		cliente.setEstado(resultado.getString("estado_cli"));
		cliente.setHorario("Livre");// mock
		cliente.setId(resultado.getInt("cod_cli"));
		cliente.setNome(resultado.getString("nome_cli"));
		cliente.setTelefone(resultado.getString("telefone_cli"));
		cliente.setPlano("Semestral");// mock
		return cliente;
	}

	public Cliente buscaPorId(int i) {
		String sql = "select * from cliente,funcionario where cod_cli=" + i
				+ " and cliente.cod_func = funcionario.cod_func;";

		try {
			PreparedStatement consulta =
					FabricaDeConexao.getConnection().prepareStatement(sql);
			ResultSet resultado = consulta.executeQuery();
			resultado.next();
			Cliente cliente = extracted(resultado);
			Funcionario funcionario = new Funcionario();
			funcionario.setId(resultado.getInt("cod_func"));
			funcionario.setNome(resultado.getString("nome_func"));
			cliente.setFuncionario(funcionario);
			return cliente;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
