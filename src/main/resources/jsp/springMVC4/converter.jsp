<%--
  Created by IntelliJ IDEA.
  User: wqc
  Date: 2017/12/20
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div id="resp"><div><input type="button" onclick="req();" value="请求"/></div></div>
<script src="/src/main/webapp/statics/jquery-1.11.3.min.js" type="application/javascript"></script>
<script>
    function req() {
        $.ajax({
            url:"converter",
            data:"1-onverter",
            type:"POST",
            contentType:"application/x-wisely",
            success:function(data){
                $("#resp").html(data);
            }
        });
    }

</script>
</body>
</html>
