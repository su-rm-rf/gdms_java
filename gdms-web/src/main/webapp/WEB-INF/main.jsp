<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 17/4/28
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <a href="/gdms/user/signout">退出</a>

    <script>
        var xhr = new XMLHttpRequest();
        xhr.open('get', '/gdms/query', true)
        xhr.send()
        xhr.addEventListener('readystatechange', function () {
            if(xhr.readyState === 4) {
                if(xhr.status === 200) {
                    console.log(xhr.responseText)
                }
            }
        })
    </script>

</body>
</html>
