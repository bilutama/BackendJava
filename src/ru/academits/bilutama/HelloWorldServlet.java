package ru.academits.bilutama;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;
import java.nio.charset.StandardCharsets;

public class HelloWorldServlet extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String servletMessage = "<<This is plain text response example>>";
        response.getOutputStream().write(servletMessage.getBytes(StandardCharsets.UTF_8));
        response.getOutputStream().flush();
        response.getOutputStream().close();
    }
}
