$(function(){
	function getNowFormatDate() {
    var date = new Date();
		    var seperator1 = "-";
		    var seperator2 = ":";
		    var month = date.getMonth() + 1;
		    var strDate = date.getDate();
		    if (month >= 1 && month <= 9) {
		        month = "0" + month;
		    }
		    if (strDate >= 0 && strDate <= 9) {
		        strDate = "0" + strDate;
		    }
		    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate
		            
		    return currentdate;
		}
	 function getLocalTime(nS) {  
     	var time=new Date(parseInt(nS)).toLocaleString();
		var matches = time.match(/^[^\s]*/);
		 return matches[0] 
       /*return new Date(parseInt(nS)).toLocaleString().replace(/Äê|ÔÂ/g, "-").replace(/ÈÕ/g, " ");*/      
    }   
    function jjx(news,old){
    	var sDate=old;
		var eDate=news;
		var sArr = sDate.split("/");
		var eArr = eDate.split("-");
		var sRDate = new Date(sArr[0], sArr[1], sArr[2]);
		var eRDate = new Date(eArr[0], eArr[1], eArr[2]);
		var result = (eRDate-sRDate)/(24*60*60*1000);
	console.log(result);
		return result
    }
		$("#time_a").html(getNowFormatDate())
		$.ajax({
			type: "get",
			url: 'http://www.wutongsd.com/selectTenderName.do',
			async: true,
			datatype: "json",
			beforeSend: function() { 
						},
			success: function(data) {
				console.log(data)
				var html=""
				for (var i=0;i<data.length;i++) {
					 var a = i+1
					 var times=jjx(getNowFormatDate(),getLocalTime(data[i].startTime))
					 if(times<=10){
					 	html+='<li name="'+data[i].projectName+'"><p>'+a+" . "+data[i].projectName+'</p><span>'+getLocalTime(data[i].startTime)+'</span><img src="../img/aa1.png"/></li>'
					 }else{
					 	html+='<li name="'+data[i].projectName+'"><p>'+a+" . "+data[i].projectName+'</p><span>'+getLocalTime(data[i].startTime)+'</span></li>'
					 }
					
				}
				$('#ul_content').html(html)
				$('#ul_content li').click(function(){
					console.log($(this).attr('name'))
					location.href='list.html?projectName='+$(this).attr('name')
				})
		},
		error: function(data){
			console.log(data)
		}
	});
	
	
	
	
	
	
	
	
	
})