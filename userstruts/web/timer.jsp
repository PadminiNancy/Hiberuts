<%-- 
    Document   : timer
    Created on : Dec 9, 2015, 9:38:10 PM
    Author     : Nancy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<script language="javascript">
var Timer;
var TotalSeconds;

function CreateTimer(TimerID, Time)
{
    Timer = document.getElementById(TimerID);
    TotalSeconds = Time;
    UpdateTimer()
    window.setTimeout("Tick()", 1000);
}

function Tick()
{
    TotalSeconds -= 1;
    if(TotalSeconds ==-1)
      {
    alert("Time Up");
    // Show alert Plus redirect any other page
      }
   else
     {
    UpdateTimer()
    window.setTimeout("Tick()", 1000);
     }
}

function UpdateTimer() {
   
   // Session["time"] = "TotalSeconds";
     Timer.innerHTML = TotalSeconds;

    


}



</script>
</head>
<body>
<div id='timer' />
<script type="text/javascript">window.onload = CreateTimer("timer", 60);</script>
<a href="timer2.jsp">Move</a>
</body>
</html>
