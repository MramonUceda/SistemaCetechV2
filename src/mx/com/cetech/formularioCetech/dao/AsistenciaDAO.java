package mx.com.cetech.formularioCetech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mx.com.cetech.formularioCetech.bean.Asistencia;
import mx.com.cetech.formularioCetech.util.BaseDatos;

public class AsistenciaDAO {
	BaseDatos bd = new BaseDatos(); // CLASE QUE HARA LA CONEXION HACIA LA BASE
	// DE DATOS
	//Alumno alumno = new Alumno();
	Asistencia asistencia = new Asistencia();
	Connection dbConnection = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String sqlQuery = null;

	
	public boolean insertAsistencia(String usr) throws SQLException {
		String query            ="insert into asistencia (idestudiante)"+"values (?)";
		boolean result        = false;
		PreparedStatement ps    = null;
		Connection dbConnection = null;
		
		dbConnection = bd.getDBConnection();
		try {
			ps = dbConnection.prepareStatement(query);
			
			//preparar el query
			ps.setString(1, usr);
			System.out.println(ps.toString());
			//ejecutar sentencia
			ps.executeUpdate();
			//validar si llego algo de la consulta
			
			if(rs.next()){
				result=true;
				System.out.println("Asistencia registrada exitosamente");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			result=false;
			e.printStackTrace();
		}//puede tronar pq la setencia puede estar mal
		
		//algo que se debe hacer siempre con una conexion a BD
		finally{
			//cerrar la conexion, sentencia
			if(ps!=null){
				ps.close();
			}
			if(dbConnection !=null){
				dbConnection.close();
			}
		}
		return result;
	}
	
}
