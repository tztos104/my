 //입장객 수에 따른 좌석의 줄(행)수 계산
 let customer =parseInt(prompt("입장객은 몇 명인가요?")) ; //입장객 수
 let colNum = parseInt(prompt("한 줄에 몇명씩 앉나요?"))     //열의 수   
 let nowNum; //행의 수

 if(customer===null||colNum===null 
    ||isNaN(customer) || isNaN(colNum))
    
    {document.write("<p>입력이 취소되었습니다.</p>")}
 else{
 //나머지가 있는지 없는지 처리
 if(customer%colNum ==0){rowNum = customer / colNum}
 else{rowNum = parseInt(customer / colNum)+1}}
// document.write(rowNum + "개의 줄이 필요합니다.")
document.write("<table>")
   
for(var i=0; i<rowNum; i++){
    document.write("<tr>")
        for(var j=1; j<=colNum; j++){
            var seatNum = colNum*i+j  
            if(seatNum > customer )
                break;
            
            document.write("<td>좌석"+ seatNum + "</td> " )
        }
        document.write("<br>")
        document.write("</tr>")
    }

 
 ocument.write("</table>")