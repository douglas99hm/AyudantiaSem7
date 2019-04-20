package doug.enterprisewebapp.servlets;

import doug.enterprisewebapp.objects.EmpleadoObj;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "EmpleadoServlet", urlPatterns = {"/EmpleadoServlet"})
public class EmpleadoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String strNombre=request.getParameter("nombre");
            String strApellido=request.getParameter("apellido");
            String strEdad=request.getParameter("edad");
            String strCargo=request.getParameter("cargo");
            String strSalario=request.getParameter("salario");
            
            int iEdad=Integer.parseInt(strEdad);
            double dSalario=Double.parseDouble(strSalario);
            
            EmpleadoObj empleado=new EmpleadoObj(strNombre, strApellido, iEdad, strCargo, dSalario);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EmpleadoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Nombre:" +empleado.getNombre()+ "</h1>");
            out.println("<h1> Apellido:" +empleado.getApellido()+ "</h1>");
            out.println("<h1> Edad:" +empleado.getEdad()+ "</h1>");
            out.println("<h1> Cargo:" +empleado.getCargo()+ "</h1>");
            out.println("<h1> Salario:" +empleado.getSalario()+ "</h1>");
            out.println("<h1> Impuesto IVA:" +empleado.getIVA()+ "</h1>");
            out.println("<h1> Impuesto Renta:" +empleado.getRenta()+ "</h1>");
            out.println("<h1> Salario Neto:" +empleado.getSalarioNeto()+ "</h1>");
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
