package org.kat.controller;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;

/**
 *
 * @author nitin
 */
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        return new ModelAndView("hello.jsp", "msg", "Yellow");
    }
}
