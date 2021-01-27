JSP --> Servlet

Types of JSP tags

1. Scriptlet <% %>  --> part of service method
2. Declaration <%! %>   --> goes into the Servlet class
3. Directive  <%@ import = "package name" %>  --> Goes at the top of servlet class
4. Expression <%= %>  ---> Goes into the out.println method

--> out is the implicit object created by JSP in template created by it as
    PrintWriter obj = null;
    
    There are 7 built in implicitobjects in jsp that we can use
    
    1. request (HttpServletRequest)
    2. response (HttpServletResponse)
    3. pageContext (PageContext)
    4. out (JspWriter ) ~ PrintWriter object
    5. session  (ServletSession)
    6. application  (ServletContext)
    7. config (ServletConfig)
    
    
    JSP Directives
    @page --> to do tthings related to that jsp page only
    @include --> to include different jsp components in the page
    @taglib --> To integrate libararires
    
    
    
    
    