var x = setInterval(time, 1000);
var d = new Date();
var day = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
var months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
document.getElementById("date").innerHTML = day[d.getDay()] + " " + d.getDate() + " " + months[d.getMonth()] + " " + d.getFullYear();

function time() {
    d = new Date();
    var hour = (d.getHours() > 12) ? d.getHours() - 12 : d.getHours();
    var ap = (d.getHours() > 12) ? "pm" : "am";
    document.getElementById("hour").innerHTML = hour;
    document.getElementById("min").innerHTML = d.getMinutes();
    document.getElementById("sec").innerHTML = d.getSeconds();
    document.getElementById("ap").innerHTML = ap;
}