<%--
  Created by IntelliJ IDEA.
  User: wqc
  Date: 2018/2/1
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>testLocalStorage</title>
</head>
<body>
<div>
    name: <input name="name"/><br>
    age:<input name="age"/>
    <button onclick="toBaidu()"></button>
</div>
<script type="text/javascript" src="springMVC4/js/jquery-1.11.3.min.js"></script>

<script>
    $(function(){
        $("input[name='name']").val(localStorage.getItem("name"));
        $("input[name='age']").val(localStorage.getItem("age"));
    });
    function toBaidu() {
        localStorage.setItem("name",$("input[name='name']").val());
        localStorage.setItem("age",$("input[name='age']").val());
        window.location.href="http://localhost:8080/testLocalStorage";
    }
</script>
</body>
</html>
