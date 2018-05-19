package mx.com.cetech.formularioCetech.controlador;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import mx.com.cetech.formularioCetech.dao.AsistenciaDAO;

/**
 * Servlet implementation class ValidaLoggin
 */
@WebServlet("/ValidaLoggin")
public class ValidaLoggin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidaLoggin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Felicidades has mapeado bien!!!");
		System.out.println("nombre: " + request.getParameter("usuario"));
		String user=request.getParameter("usuario");
		System.out.println("paterno: " + request.getParameter("password"));
		//String pass=request.getParameter("password");
		//ya checamos que llega la info aqui, con eso trabajamos, ahora usaremos los metodos para meter info en las tablas
		AsistenciaDAO asistenciaDao= new AsistenciaDAO();
		boolean isRegistroAsistencia=false;
		try {
			isRegistroAsistencia=asistenciaDao.insertAsistencia(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(isRegistroAsistencia){
			JOptionPane.showMessageDialog(null, "Asistencia Registrada");
		}else{
			JOptionPane.showMessageDialog(null, "No se registro asistencia ");
		}
	}

}
