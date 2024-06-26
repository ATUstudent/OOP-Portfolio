// To create literal strings stored in flash memory enclose your HTML code between 
// F(R"=====( HTML code here )=====");
// If you have 1 reading then you probably have 2 literal strings
// If you have 2 readings then you probably have 3 literal strings etc.

String homePagePart1 = F(R"=====(<!DOCTYPE html>
<html lang="en" > <!-- Needed for Screenreaders !-->
<head>
<!-- UTF-8 character set covers most characters in the world -->
  <meta charset="utf-8">
  <!-- Make page respond to screen size !-->
  <meta name="viewport" content="width=device-width, initial-scale=1, viewport-fit=cover">
  <meta http-equiv="refresh" content="30">
<!--Include a Title. Used by Search Engines -->
<title> Temperature Reading WebServer </title>
<style>
   
   <!--choose good contrast between background and foreground colours -->
   body {       
	background-color: DodgerBlue;
	}
	.flex-Container{
        display: flex;
        flex-direction: column;
        background-color: DodgerBlue;
        align-items: center;
      }
    h1{
    font: bold;
    font-size: 40px;
    font-family: Arial;
    color: navy;
	text-align: center;
  }
  p{
    font-size: 25px;
    font-family: Arial;
    color: navy;
	text-align: center;
   }  
  th, td {
    font-size: 25px;
    padding: 8px;
    text-align: left;
    border-bottom: 1px solid #ddd;
}
</style>
</head>
	<body>
		<div class="flex-Container">
		<h1> Temperature Example Website </h1>
     <h2> My ThingSpeak Chart</h2>
    <iframe width="450" height="260" style="border: 1px solid #cccccc;" src="https://thingspeak.com/channels/225409/charts/4?bgcolor=%23ffffff&color=%23d62020&results=60&title=Temperature&xaxis=time&yaxis=Temp+C"></iframe>
    
      
		<p>Welcome to my website displaying the temperature in ATU</p>
    
		<table>
        <tr>
          <th>Sensor</th>
          <th>Value</th>
          <th>Unit</th>
        </tr>
        <tr>
          <td>Temperature</td>
          <td>  )=====");
String homePagePart2 = F(R"=====(</td>
         <td>Degree Cel</td>
        </tr>
		<tr>
          <td>Relative Humidity</td>
          <td> )=====");
String homePagePart3 = F(R"=====(</td>
         <td>%</td>
        </tr>
		<tr>
          <td>Heart Rate</td>
          <td> )=====");

String homePagePart4 = F(R"=====(</td>
         <td>Beats per minute</td>
        </tr>
      </table>
     </div>
	</body>
</html>)=====");
