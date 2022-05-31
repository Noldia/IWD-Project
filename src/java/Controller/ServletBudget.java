/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ComputerComponent;
import Utils.ConnectDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ivar29
 */
@WebServlet(name = "ServletBudget", urlPatterns = {"/ServletBudget"})
public class ServletBudget extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String tipoUso = request.getParameter("tipoUso");
        String gama = request.getParameter("gama");
        String tamano = request.getParameter("tamano");
        String diseno = request.getParameter("diseno");
        
        
        
        try {
            int k=0;
            PreparedStatement psta = ConnectDB.getConnect()
                    .prepareStatement("select * from componentes where tipoUso=? and gama=? and tamano=? and diseno=?");
            
            psta.setString(k++, tipoUso);
            psta.setString(k++, gama);
            psta.setString(k++, tamano);
            psta.setString(k++, diseno);
            
            ResultSet rs = psta.executeQuery();
            
            List<ComputerComponent> lista = new ArrayList<ComputerComponent>();
            
            if(rs.next()){
                while(rs.next()){
                        ComputerComponent component = new ComputerComponent(
                                rs.getString(1),
                                rs.getString(2),
                                rs.getString(3),
                                rs.getString(4),
                                rs.getFloat(5),
                                rs.getInt(6),
                                rs.getInt(7),
                                rs.getInt(8),
                                rs.getInt(9)
                        );
                        lista.add(component);
                    }
                    
                request.setAttribute("lista", lista);
                request.getRequestDispatcher("results.jsp").forward(request, response);
            }else{
                request.getRequestDispatcher("app.jsp").forward(request, response);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ServletBudget.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
