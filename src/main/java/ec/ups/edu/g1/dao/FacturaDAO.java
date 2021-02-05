package ec.ups.edu.g1.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.g1.modelo.Factura;


@Stateless
public class FacturaDAO {
	
	@Inject
	private Connection con;


	public boolean insert(Factura factura) throws SQLException {
		String sql="INSERT INTO tbl_factura (numero,fecha_emision,valor_total,tbl_cliente_dni)"
				+ "VALUES (?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, factura.getNumero());
		ps.setDate(2, (java.sql.Date)factura.getFechaEmision());
		ps.setDouble(3, factura.getValorTotal());
		ps.setInt(3, 0);
		ps.setString(4, null);
		ps.executeUpdate();
		ps.close();
		return true;
	}
	public boolean update(Factura factura) throws SQLException {
		boolean rowActualizar = false;
		String sql = "UPDATE tbl_factura SET numero=?,fecha_emision=?,valor_total=?,tbl_cliente_dni=? WHERE codigo=?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, factura.getNumero());
		ps.setDate(2, (Date) factura.getFechaEmision());
		ps.setDouble(3, factura.getValorTotal());
		ps.setInt(4, 0);
		ps.setString(5, null);
		//ps.setString(5, cliente.getNombre());
		//System.out.println(cliente.getDni());

 
		rowActualizar = ps.executeUpdate() > 0;
		ps.close();
		con.close();
		return rowActualizar;
	}
	public Factura read(int  id) {
		return null;
	}
	public boolean delete(int id) {
		return true;
	}
}

