window.onload = function(){
    setInterval(setWatch, 1000)

    function setWatch(){
         let date = new Date(); //현재 날짜와 시간생성
            let now = date.toLocaleTimeString()
            document.getElementById("demo").innerHTML = now;
    }


    //배경 이미지 슬라이딩
    let picture = [
        "../static/images/header1.jpg",
        "../static/images/header2.jpg",
        "../static/images/header3.jpg"
    ]
    let imgIdx = 0;

    showPicture();
    function showPicture(){
        let img = document.getElementById('pic');
        img.src = picture[imgIdx] ;//첫 이미지 저장
        imgIdx++;
        if(imgIdx ==picture.length){
            imgIdx = 0;
        }
        //1초 간격으로 showPicure() 호출
        setTimeout(showPicture, 1000);
    }
}
       