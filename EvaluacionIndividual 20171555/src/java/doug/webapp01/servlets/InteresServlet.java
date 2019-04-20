package doug.webapp01.servlets;

import doug.webapp01.objects.InteresInfo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "InteresServlet", urlPatterns = {"/InteresServlet"})
public class InteresServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String strCliente=request.getParameter("cliente");
            String strCapital=request.getParameter("capital");
            String strTasa=request.getParameter("tasa");
            String strTiempo=request.getParameter("tiempo");
            
            double dCapital=Integer.parseInt(strCapital);
            double dTasa=Integer.parseInt(strTasa);
            double dTiempo=Integer.parseInt(strTiempo);
            
            InteresInfo interes=new InteresInfo(strCliente, dCapital, dTasa, dTiempo);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InteresServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Cliente: " +interes.getCliente()+ "</h1>");
            out.println("<h1>Capital inicial: $" +interes.getCapital()+ "</h1>");
            out.println("<h1>Tasa de interés: " +interes.getTasa()+ "%</h1>");
            out.println("<h1>Tiempo: " +interes.getTiempo()+ " años</h1>");
            out.println("<h1>Valor futuro: $" +interes.getInteres()+ "</h1>");
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
