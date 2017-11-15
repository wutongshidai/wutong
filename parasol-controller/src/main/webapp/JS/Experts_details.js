$(function(){
	
var url=window.location.href;
  function getQuery(url){
      var id;
      var reg=/(\w+)=(\w+)/ig;
      var res=reg.exec(url)[2];
      return res;
  }
  var resId=getQuery(url);
    $.ajax({
			type: "get",
			url:"http://www.wutongsd.com/expertsDetails.do?id="+resId,
			async: true,
			datatype: "json",
			beforeSend: function() { 
						},
			success: function(data) {
				console.log(data)
				var html1='<img src="'+data.photo+'"/>'
//				$('.img_header').html(html1)
				var html2='<img src="../img/wdl.png"/>'
				if(data.photo){
					$('.img_header').html(html1)
				}else{
					$('.img_header').html(html2)
				}
				$('.experts_name').html(data.spare3)
//				$('.experts_gc').html(data.)
				if(data.title2){
					$('.main_headrRight_ulone li').eq(0).html(data.title2)
				}else{
					$('.main_headrRight_ulone li').eq(0).css('display','none')
				}
				if(data.dateWorke){
					$('.main_headrRight_ulone li').eq(1).html(data.dateWorke+"工作经验")
				}else{
					$('.main_headrRight_ulone li').eq(1).css('display','none')
				}
				if(data.field2){
					$('.main_headrRight_ulone li').eq(2).html(data.field2)
				}else{
					$('.main_headrRight_ulone li').eq(2).css('display','none')
				}
				$('.ultwoxx1').html(data.spare3)
				if(data.education==23){
					$('.ultwoxx2').html("博士及以上")
				}else if(data.education==24){
						$('.ultwoxx2').html("硕士")
				}else if(data.education==25){
						$('.ultwoxx2').html("本科")
				}
				else if(data.education==26){
						$('.ultwoxx2').html("大专")
				}else if(data.education==27){
						$('.ultwoxx2').html("大专以下")
				}
				$('.ultwoxx3').html(data.title2)
				$('.ultwoxx5').html(data.dateWorke+'年')
				$('.ultwoxx6').html(data.field2)
				$('.ultwoxx7').html(data.abstractsa)
				if(data.show0){
					$('.ultwoxx8').attr('src',data.show0)
				}
				if(data.show1){
					$('.ultwoxx9').attr('src',data.show1)
				}
				if(data.show2){
					$('.ultwoxx10').attr('src',data.show2)
				}
				if(data.show3){
					$('.ultwoxx11').attr('src',data.show3)
				}
				if(data.show4){
					$('.ultwoxx12').attr('src',data.show4)
				}
				if(data.show5){
					$('.ultwoxx13').attr('src',data.show5)
				}
				if(data.show6){
					$('.ultwoxx14').attr('src',data.show6)
				}
				if(data.show7){
					$('.ultwoxx15').attr('src',data.show7)
				}
				if(data.spare4){
					$(".experts_btn").click(function(){
						$(this).css("display","none")
						$("#yyyxs").css("display","block")
						$("#yyyx").html(data.spare4)
					})
				}
			//	$('.ultwoxx8').attr('src',data.show0)
			//	$('.ultwoxx9').attr('src',data.show1)
			//	$('.ultwoxx10').attr('src',data.show2)
			//	$('.ultwoxx11').attr('src',data.show3)
			//	$('.ultwoxx12').attr('src',data.show4)
			//	$('.ultwoxx13').attr('src',data.show5)
			//	$('.ultwoxx14').attr('src',data.show6)
			//	$('.ultwoxx15').attr('src',data.show7)
				$('.work_Experience_div').html(data.experience)
				$('.main-Results_div').html(data.writings)
				$('.Awarding_div').html(data.winning)
				$('.personal_Information_div').html(data.achievement)
		},
		
		error: function(data){
			console.log(data)
		}
	});

    

})
