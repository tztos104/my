  let pic =document.getElementById('pic')
        pic.onmouseover = changePic;
        pic.onmouseout = originPic;

        function changePic(){
            pic.src = "../static/prod2.jpg";
            }
              function originPic(){
            pic.src = "../static/prod3.jpg";
            }
