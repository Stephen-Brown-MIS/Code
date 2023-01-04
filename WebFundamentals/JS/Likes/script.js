var count = 0
var count2 = 0
var count3 = 0

var countElement = document.querySelector("#count"); 
var countElement2 = document.querySelector("#count2"); 
var countElement3 = document.querySelector("#count3"); 

console.log(countElement);

function add1(){
    count = count + 1;
    countElement.innerText = count + " likes";
    console.log(count);
}

function add12(){
    count2 = count2 + 1;
    countElement2.innerText = count2 + " likes";
}

function add13(){
    count3 = count3 + 1;
    countElement3.innerText = count3 + " likes";
}