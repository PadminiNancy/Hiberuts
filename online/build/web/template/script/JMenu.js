// JavaScript Document
$(function (){
	arr=new Array("m1","m2","m3","m4","m5","m6","m7","m8","m9","m10","m11","m12","m13");
	function f(id){
		for(e in arr)
			$(document.getElementById(arr[e])).removeClass('active');
		$(document.getElementById(id)).addClass('active');
	}

	document.getElementById("m1").onmouseover = function(){	f("m1"); }
	document.getElementById("m2").onmouseover = function(){	f("m2"); }
	document.getElementById("m3").onmouseover = function(){ f("m3"); }
	document.getElementById("m4").onmouseover = function(){	f("m4"); }
	document.getElementById("m5").onmouseover = function(){ f("m5"); }
	document.getElementById("m6").onmouseover = function(){ f("m6"); }
	document.getElementById("m7").onmouseover = function(){ f("m7"); }
	document.getElementById("m8").onmouseover = function(){ f("m8"); }
	document.getElementById("m9").onmouseover = function(){ f("m9"); }
	document.getElementById("m10").onmouseover = function(){ f("m10"); }
	document.getElementById("m11").onmouseover = function(){ f("m11"); }
	document.getElementById("m12").onmouseover = function(){ f("m12"); }
	document.getElementById("m13").onmouseover = function(){ f("m13"); }
});