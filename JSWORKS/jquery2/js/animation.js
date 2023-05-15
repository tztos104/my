$(document).ready(function(){
    $('button:eq(0)').click(function(){
  
    $('.m0').animate({left: 500}, "fast","swing")
    .animate({left: 0}, "slow","swing")

})

//이동할때는 오른쪽으로 500px 만큼 이동하고
//돌아올때는 텍스트 애니메이션을 함께 수행함
   $('button:eq(1)').click(function(){
        $('.m1').animate({left: 500}, "fast","swing")
    .animate({left: 0}, "slow","swing", function(){
        //find()는 선택한 요소의 자식요소를 선택함
        $(this).find('span').animate({top: 10}, "fast","swing")
    })
    })
});