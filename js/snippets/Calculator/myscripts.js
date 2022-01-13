var input = document.getElementById("input");
var operator = "";
var backendInput = "";

function inputF(x) {
    if (x == '1') {
        input.innerHTML += 1;
        backendInput += 1;
    } else if (x == '2') {
        input.innerHTML += 2;
        backendInput += 2;
    } else if (x == '3') {
        input.innerHTML += 3;
        backendInput += 3;
    } else if (x == '4') {
        input.innerHTML += 4;
        backendInput += 4;
    } else if (x == '5') {
        input.innerHTML += 5;
        backendInput += 5;
    } else if (x == '6') {
        input.innerHTML += 6;
        backendInput += 6;
    } else if (x == '7') {
        input.innerHTML += 7;
        backendInput += 7;
    } else if (x == '8') {
        input.innerHTML += 8;
        backendInput += 8;
    } else if (x == '9') {
        input.innerHTML += 9;
        backendInput += 9;
    } else if (x == '0') {
        input.innerHTML += 0;
        backendInput += 0;
    } else if (x == '.') {
        input.innerHTML += ".";
        backendInput += ".";
    } else if (x == '+') {
        input.innerHTML += "+";
        backendInput += "+";
    } else if (x == '-') {
        input.innerHTML += "-";
        backendInput += "-";
    } else if (x == '×') {
        input.innerHTML += "×";
        backendInput += "*";
    } else if (x == '÷') {
        input.innerHTML += "÷";
        backendInput += "/";
    } else if (x == '%') {
        input.innerHTML += "%";
        backendInput += "%";
    } else if (x == '(') {
        input.innerHTML += "(";
        backendInput += "(";
    } else if (x == ')') {
        input.innerHTML += ")";
        backendInput += ")";
    } else if (x == 'ac') {
        input.innerHTML = "";
        backendInput = "";
    } else if (x == '=') {
        try {
            input.innerHTML = eval(backendInput);
            backendInput = eval(backendInput);
        } catch (e) {
            input.innerHTML = "ERROR"
        }
    }
}