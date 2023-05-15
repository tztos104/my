//이미지 바꾸기
let bigPic = document.getElementById("cup")
let smallPics = document.querySelectorAll(".small")
console.log(smallPics.length)


for(let i=0; i<smallPics.length; i++){
smallPics[i].addEventListener("mouseover", showBig)
}

function showBig(){
    console.log(this.src) ; //클릭한 자신
    bigPic.setAttribute("src", this.src)
}