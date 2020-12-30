package com.grupo6.easygym.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.grupo6.easygym.modelo.Funcionario;

public class FuncionarioDAO {
	
	public List<Funcionario> todos() {
		List<Funcionario> lista = new ArrayList<Funcionario>();
		String sql = "select * from funcionario";
		Connection conexao = FabricaDeConexao.getConnection();

		try {
			PreparedStatement consulta = conexao.prepareStatement(sql);
			ResultSet resultado = consulta.executeQuery();
			while(resultado.next()) {
				Funcionario funcionario = extracted(resultado);
				lista.add(funcionario);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}

	private Funcionario extracted(ResultSet resultado) throws SQLException {
		Funcionario funcionario = new Funcionario();
		funcionario.setId(resultado.getInt("cod_func"));
		funcionario.setNome(resultado.getString("nome_func"));
		return funcionario;
	}

}
