setInterval(display, 1000);
function display() {
    let currentDate = new Date();
    let newYearDate = new Date(2021, 0, 1);
    let day = ~~((newYearDate - currentDate) / 86400000);
    let hou = ~~(((newYearDate - currentDate) % 86400000) / 3600000);
    let min = ~~((((newYearDate - currentDate) % 86400000) % 3600000) / 60000);
    let sec = ~~(((((newYearDate - currentDate) % 86400000) % 3600000) % 60000) / 1000);
    document.getElementById("show").innerHTML = day + "<sub>Days</sub> " + hou + "<sub>Hour</sub> " + min + "<sub>Min</sub> " + sec + "<sub>Sec</sub> "
}