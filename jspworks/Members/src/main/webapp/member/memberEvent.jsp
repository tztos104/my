<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>행운의 추첨(Good Luck)</title>
  <link rel="stylesheet" href="../resources/css/style.css">
  <script src="../resources/js/event.js"></script>
</head>

<body>
<jsp:include page="../header.jsp"/> <!-- 해더 삽입 -->
<div id = "container">
    <section id="event">
    	<div class="eve">
    	<h1> 이벤트!!!</h1>
    	<img class="event" alt="" src="../resources/images/event.jpg" width="400px" >
        <h2>행운의 추첨(Good Luck)</h2>
        <button type="button" onclick="play()">추첨</button>
        <div class="event1">
        <p id="display"></p>
        </div>
        </div>
    </section>
</div>

</body>
<jsp:include page="../footer.jsp"/> <!-- 푸더 삽입 -->
</html>