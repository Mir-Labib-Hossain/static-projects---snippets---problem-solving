var r = 153,
    g = 204,
    b = 255;

function getColor() {
    let rgb = "rgb(" + r + ", " + g + ", " + b + ")";
    document.body.style.background = rgb;
    document.getElementById("color").innerHTML = rgb;

}
var slider1 = document.getElementById("myRange1");
var output1 = document.getElementById("demo1");
output1.innerHTML = slider1.value;
slider1.oninput = function() {
    output1.innerHTML = this.value;
    r = this.value;

}
var slider2 = document.getElementById("myRange2");
var output2 = document.getElementById("demo2");
output2.innerHTML = slider2.value;
slider2.oninput = function() {
    output2.innerHTML = this.value;
    g = this.value;
}
var slider3 = document.getElementById("myRange3");
var output3 = document.getElementById("demo3");
output3.innerHTML = slider3.value;
slider3.oninput = function() {
    output3.innerHTML = this.value;
    b = this.value;
}