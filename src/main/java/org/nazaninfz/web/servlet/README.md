# Servlet API

- __javax.servlet__ package: Interfaces and classes that are used by the servlet or web container. These are not
  specific to any protocol.

- __javax.servlet.http__ package: Interfaces and classes that are responsible for http requests only.

### Interfaces in javax.servlet package

1. Servlet
2. ServletRequest
3. ServletResponse
4. RequestDispatcher
5. ServletConfig
6. ServletContext
7. SingleThreadModel
8. Filter
9. FilterConfig
10. FilterChain
11. ServletRequestListener
12. ServletRequestAttributeListener
13. ServletContextListener
14. ServletContextAttributeListener

### Classes in javax.servlet package

1. GenericServlet
2. ServletInputStream
3. ServletOutputStream
4. ServletRequestWrapper
5. ServletResponseWrapper
6. ServletRequestEvent
7. ServletContextEvent
8. ServletRequestAttributeEvent
9. ServletContextAttributeEvent
10. ServletException
11. UnavailableException

### Interfaces in javax.servlet.http package

1. HttpServletRequest
2. HttpServletResponse
3. HttpSession
4. HttpSessionListener
5. HttpSessionAttributeListener
6. HttpSessionBindingListener
7. HttpSessionActivationListener
8. HttpSessionContext (deprecated now)

### Classes in javax.servlet.http package

1. HttpServlet
2. Cookie
3. HttpServletRequestWrapper
4. HttpServletResponseWrapper
5. HttpSessionEvent
6. HttpSessionBindingEvent
7. HttpUtils (deprecated now)

# Servlet Interface

- __Servlet interface__ needs to be implemented for creating any servlet.
- It provides 3 life cycle methods:
    1. To initialize the servlet: `public void init(ServletConfig config)`
        - Invoked by the web container only once.
    2. To service the requests: `public void service(ServletRequest request,ServletResponse response)`
        - Provides response for the incoming request.
        - It is invoked at each request by the web container.
    3. To destroy the servlet: `public void destroy()`
        - Invoked only once and indicates that servlet is being destroyed.
- It provides 2 non-life cycle methods:
    1. Get servlet config: `public ServletConfig getServletConfig()`
    2. Get servlet Info: `public String getServletInfo()    `
        - returns information about servlet such as writer, copyright, version etc.

# GenericServlet

- GenericServlet class implements __Servlet__, __ServletConfig__ and __Serializable__ interfaces.
- GenericServlet class can handle any type of request so it is __protocol-independent__.

# HttpServlet

- __HttpServlet__ class extends the __GenericServlet__ class and implements Serializable interface.
- It provides http specific methods such as __doGet__, __doPost__, __doHead__, __doTrace__ etc.
