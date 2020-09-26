/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompanydonde.ejerciciojsp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lguilln
 */
    
    @WebServlet(name = "logica", urlPatterns = {"/logica"})
public class Calculadora extends HttpServlet {

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
        
    }

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
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        double x1 = Double.parseDouble(request.getParameter("n1"));
        double x2 = Double.parseDouble(request.getParameter("n2"));
        
       
        Funcion calc = new Funcion(x1, x2);

        
        String cadenaRetorno = "";
        if (request.getParameter("suma") != null) {
            
            cadenaRetorno+="<h2>Total Sumado </h2>" + calc.suma();
        }
        if (request.getParameter("resta") != null) {
            cadenaRetorno+="<h2>Total Restado </h2>" + calc.resta();
        }
        if (request.getParameter("multiplicacion") != null) {
            cadenaRetorno+="<h2>Total Multiplicado </h2>" + calc.multiplicacion();
        }
        if (request.getParameter("mayor") != null) {
            cadenaRetorno+="<h2>Numero Mayor </h2>" + calc.mayorQue();
            
        }
        if (request.getParameter("potencia") != null) {
            cadenaRetorno+="<h2>Total de Potenciacion </h2>" + calc.potencia();
        }
        if (request.getParameter("binario") != null) {
            
            cadenaRetorno+="<h2>Valores Binarios </h2>";
            
            cadenaRetorno+="<p>Primer Numero= "+x1+" su valor es: </p>"+calc.binario(x1);
            cadenaRetorno+="<br>";
            
            cadenaRetorno+="<p>Segundo Numero= "+x2+" su valor es: </p>"+calc.binario(x2);
            cadenaRetorno+="<br>";
          
        }
        request.setAttribute("Resultado", cadenaRetorno);
        RequestDispatcher despachar = request.getRequestDispatcher("index.jsp");
        despachar.forward(request, response);
        
      
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

