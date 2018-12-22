<%-- 
    Document   : responsive
    Created on : Mar 14, 2016, 11:07:06 AM
    Author     : Nancy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en-us">
<head>
<style>
.city {
    float: left;
    margin: 5px;
    padding: 15px;
    width:auto;
    height:auto;
    border: 1px solid black;

}
.imgr{

    height:auto;
    width: auto;
}
</style>
</head>
<body style="-webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;" background="images/back.jpg">

<h1>Responsive Web Design Demo</h1>

<div class="city">
  <h2>London</h2>
  <p>London is the capital city of England.</p>
  <p>It is the most populous city in the United Kingdom,
  with a metropolitan area of over 13 million inhabitants.</p>
</div>

<div class="city">
  <h2>Paris</h2>
  <p>Paris is the capital of France.</p>
  <p>The Paris area is one of the largest population centers in Europe,
  with more than 12 million inhabitants.</p>
</div>

<div class="city">
  <h2>Tokyo</h2>
  <p>Tokyo is the capital of Japan.</p>
  <p>It is the center of the Greater Tokyo Area,
  and the most populous metropolitan area in the world.</p>
</div>

<div class="city">
  <h2>Image</h2>
  <p>Tokyo is the capital of Japan.</p>
  <p>It is the center of the Greater Tokyo Area,
  and the most populous metropolitan area in the world.</p>
  <img style="height: auto;width: 100%" src="images/28.jpg"/>
</div>

</body>
</html>
