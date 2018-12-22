<!-- Add the script to the HEAD of your document -->
<script LANGUAGE="JavaScript">
<!-- Begin
var scrl = "Internet Banking Solutions.. ";
function scrlsts() {
 scrl = scrl.substring(1, scrl.length) + scrl.substring(0, 1);
 document.title = scrl;
 setTimeout("scrlsts()", 300);
 }
//  End -->
</script>


<!-- Add the event loader to the body tag as below -->

<body onLoad="scrlsts()">
<img src="Images/bg1.jpg" width="100%" height="100%"/>
