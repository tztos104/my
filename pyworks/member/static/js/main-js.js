window.onload = function(){
    setInterval(setWatch, 1000)}

    function setWatch(){
         let date = new Date(); //현재 날짜와 시간생성
            let now = date.toLocaleTimeString()
            document.getElementById("display").innerHTML = now;
    }



       