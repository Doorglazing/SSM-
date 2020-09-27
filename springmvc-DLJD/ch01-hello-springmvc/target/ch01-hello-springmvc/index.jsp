<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/27
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
    <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
</head>
<body>
    <div id="app">
        <input type="button" value="query" v-on:click="query">

        <ul v-for="a in arr">
            <li>{{a}}</li>
        </ul>
    </div>
    <script>
        var vm = new Vue({
            el: "#app",
            data: {
                arr: [],
            },
            methods: {
                query: function () {
                    alert("haha")
                    axios.get("haha")
                    .then(function (data) {
                        console.log(data)
                        console.log(data.data.name)
                        vm.arr = data.data
                    })
                    .catch(function (error) {
                        console.log(error)
                    })
                }
            }
        })
    </script>
</body>
</html>
