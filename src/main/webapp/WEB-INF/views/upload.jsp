 <%-- 
    Document   : upload
    Created on : 27 July 2021, 11:04:45 am
    Author     : vatra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload Page</title>
    </head>
    <body>
        <h1>File Upload!</h1>
        
        <form method="post" enctype="multipart/form-data" action="">
            <input type="file" name="ufile"/>
            <button type="submit">Upload</button>
                
        </form>
    </body>
    
    
    
</html>
