let i = 0,
    len;
let p1 = document.getElementById("p1");

display("date");
p1.innerHTML = display(i);
document.getElementById("showA").onclick = function() {
    display("all");
}
document.getElementById("hide").onclick = function() {
    p1.innerHTML = "";
}
document.getElementById("next").onclick = function() {
    if (i < len - 1) {
        i++;
    } else {
        i = 0;
    }
    display(i);
}
document.getElementById("previous").onclick = function() {
    if (i > 0) {
        i--;
    } else {
        i = len - 1;
    }
    display(i);
}

function display(i) {
    let xml = new XMLHttpRequest();
    xml.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            callXML(this, i);
        }
    }
    xml.open("GET", "info.xml", true);
    xml.send();
}

function callXML(xml, i) {
    let xDoc = xml.responseXML;
    let x = xDoc.getElementsByTagName("std");
    len = x.length;
    let out = "";
    if (i == "all") {
        out = "<table><tr><th>Name</th><th>ID</th><th>Home</th></tr>";
        for (i = 0; i < len; i++) {
            out += "<tr><td>" + x[i].getElementsByTagName("name")[0].childNodes[0].nodeValue +
                "</td><td>" + x[i].getElementsByTagName("id")[0].childNodes[0].nodeValue + "</td><td>" +
                x[i].getElementsByTagName("home")[0].childNodes[0].nodeValue + "</td></tr>";
        }
        out + "</table>";
    } else if (i == "date") {
        //p2.innerHTML = xml.getAllResponseHeaders();
        p2.innerHTML = "XML file last-modified : " +
            xml.getResponseHeader("last-modified");
    } else {
        out = "<b>Index No. " + (i + 1) + "<br> Name: </b>" +
            x[i].getElementsByTagName("name")[0].childNodes[0].nodeValue +
            "<br><b>ID :</b> " + x[i].getElementsByTagName("id")[0].childNodes[0].nodeValue +
            "<br><b>Home :</b> " + x[i].getElementsByTagName("home")[0].childNodes[0].nodeValue;
    }
    p1.innerHTML = out;
}