package br.com.fiap.challegersprint4.model.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.challegersprint4.model.entity.Bicicleta;

public class BicicletaRepository extends Repository{

	public static Bicicleta save(Bicicleta bike) {
		String sql = "insert into bicicleta" + "(peso, preco, marca, tipo, material)"
				+ " values(?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setLong(1, bike.getPeso());
			ps.setLong(2, bike.getPreco());
			ps.setString(3, bike.getMarca());
			ps.setString(4, bike.getTipo());
			ps.setString(5, bike.getMaterial());
			if (ps.executeUpdate() > 0) {
				return bike;
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao salvar: " + e.getMessage());
		} finally {
			closeConnection();
		}
		return null;
	}
	
}
