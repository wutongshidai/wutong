$(function(){
	 function GetQueryString(name) {
        /*定义正则，用于获取相应参数*/
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
        /*字符串截取，获取匹配参数值*/
        
        var r = window.location.search.substr(1).match(reg);
        console.log(r)
        /*但会参数值*/
        if (r != null){
            return decodeURI(r[2]);
        }
        return null;
    }
/*     function getLocalTime(nS) {     
       return new Date(parseInt(nS)).toLocaleString().replace(/年|月/g, "-").replace(/日/g, " ");      
    }*/
function getLocalTime(nS) { 
	console.log(nS) 
     	var time=new Date(parseInt(nS)).toLocaleString();
		var matches = time.match(/^[^\s]*/);
		 return matches[0]   
    }      
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
		$("#time_a").html(getNowFormatDate())
 /*console.log(GetQueryString('projectName'))*/
		$.ajax({
			type: "post",
			url: 'http://www.wutongsd.com/selectChoiceDemand.do?projectName='+GetQueryString('projectName'),
			/*async: true,*/
			datatype: "json",
			beforeSend: function() { 
						},
			success: function(data) {
				console.log(data);
				var ddate = data[0].endDate
				
				$(".projectName").text(data[0].projectName);
				$(".tenderee").text(data[0].tenderee);
				$(".contactName").text(data[0].contactName);
				$(".contactMobile").text(data[0].contactMobile);
				$(".endDate").text(getLocalTime(ddate));
				$(".tenderMoney").text(data[0].tenderMoney+ '元');
				$(".agreementPrice").text(data[0].agreementPrice+ '元');
		},
		error: function(data){
			console.log(data)
		}
	});
	$('.content ul li').click(function(){
		console.log($(this).index())
//		location.href='www.baidu.com'
	})
	
	
	
	
	
	
	
	
})
