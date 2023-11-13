package br.com.fiap.challegersprint4.model.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.challegersprint4.model.entity.Cliente;

public class ClienteRepository extends Repository {
	
	public static Cliente save(Cliente clien) {
		String sql = "insert into cliente (nm_clien, idade_clien, cpf_clien , tel_clien, email_clien, endereco_clien)"
				+ " values(?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, clien.getNome());
			ps.setLong(2, clien.getIdade());
			ps.setString(3, clien.getCpf());
			ps.setString(4, clien.getTelefone());
			ps.setString(5, clien.getEmail());
			ps.setString(6, clien.getEndereco());
			if (ps.executeUpdate() > 0) {
				return clien;
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao salvar: " + e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage() + "clienteRepository");
		} finally {
			closeConnection();
		}
		return null;
	}

	
}

