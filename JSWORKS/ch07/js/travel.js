//아이템 리스트
let itemList =[ ]

let addBtn= document.getElementById("add");
addBtn.addEventListener("click", addList);

function addList(){
    //item은 itemList에 push()로 저장(입력)
    let item =document.getElementById("item").value;
    itemList.push(item)

    showList()
}
function showList(){
    // document.getElementById("itemList").innerHTML=itemList[0]
    let list = "<ul>"; //목록리스트 변수
    for(let i=0;i<itemList.length; i++){
        // document.getElementById("itemList").innerHTML=itemList[i]
        list+="<li>"+ itemList[i]+"<span class='close' id="+i+">X</span></li>"
    }
    list+="</ul>"
    document.getElementById("itemList").innerHTML=list;
    //아이템 삭제
    //x를 선택
    let removeList= document.querySelectorAll(".close");
    for(let i=0;i<removeList.length; i++){
    removeList[i].addEventListener("click", remove);
    }
    function remove(){
        console.log(this)
        let id = this.getAttribute("id")
        itemList.splice(id, 1)
        
        showList()
    }
}
