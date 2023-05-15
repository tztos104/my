

function addContents(){
    let newP = document.createElement("p")
    let text= document.createTextNode("은은하고 다채로운 꽃향")
     newP.appendChild(text)

     document.getElementById("info").appendChild(newP);

 let newImg = document.createElement("img")
 let src = document.createAttribute("src")
 src.value = "../images/coffee-blue.jpg"
 newImg.setAttributeNode(src)

 let alt=document.createAttribute("alt")
 alt.value ="커피이미지"
 newImg.setAttributeNode(alt)    

 document.getElementById("info").appendChild(newImg)
 
}

