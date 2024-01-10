/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Xuan Vinh
 */
public class GeoServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GeoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GeoServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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

        String geo = request.getParameter("geo");

        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        switch (geo) {
            case "c":
                out.println("<h3>Circle</h3>");
                out.println("<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Circle_-_black_simple.svg/220px-Circle_-_black_simple.svg.png\">");
                break;
            case "t":
                out.println("<h3>Triangle</h3>");
                out.println("<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Triangle_illustration.svg/220px-Triangle_illustration.svg.png\">");
                break;
            case "s":
                out.println("<h3>Square</h3>");
                out.println("<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/U%2B25A1.svg/800px-U%2B25A1.svg.png\">");
                break;
            case "r":
                out.println("<h3>Rectangle</h3>");
                out.println("<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Rectangle_Geometry_Vector.svg/1200px-Rectangle_Geometry_Vector.svg.png\">");
                break;
            default:
                out.println("<h3>Invalid geometry</h3>");
                break;
        }
        out.println("</body></html>");
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
