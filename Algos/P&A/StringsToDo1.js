// Push Front
// Given an array and an additional value, insert this value at the beginning of the array. You may use .push(), you are able do this without it though!

// Examples:

// pushFront([5,7,2,3], 8) => [8,5,7,2,3]
// pushFront([99], 7) => [7,99]

var newArray = [];
var pushValue = 1;

function pushFront(array, pushValue) {
    newArray.push(pushValue);
    for (var i = 0; i <= array.length - 1; i++) {
        newArray.push(array[i]);
    }
}
//pushFront([5,7,2,3], 8);
pushFront([99], 7)
console.log(newArray);

//---------------------------------------------------------

// Pop Front
// Given an array, remove and return the value at the beginning 
// of the array. Prove the value is removed from the array 
// by printing it. 
// You may use .pop(), you are able do this without it though!

// Examples:

// popFront([0,5,10,15]) => 0 returned, with [5,10,15] printed in the function
// popFront([4,5,7,9]) => 4 returned, with [5,7,9] printed in the function

var newArray = [];
var popNum = 1;

function popFront(array) {
    popNum = array[0]
    
    for (var i = 1; i <= array.length - 1; i++) {
        newArray[i-1]=array[i];
    }
    console.log(newArray);
    console.log(popNum);
    return popNum

}


// popFront([0,5,10,15])
popFront([4,5,7,9])

//---------------------------------------------------------------

// Insert At
// Given an array, index, and additional value, insert the value into 
// array at given index. You can think of pushFront(arr,val) 
// as equivalent to insertAt(arr,0,val). 
// You may use .push(), you are able do this without it though!

// Examples:

// insertAt([100,200,5], 2, 311) => [100,200,311,5]
// insertAt([9,33,7], 1, 42) => [9,42,33,7]


var newArray = [];
var popNum = 1;

function insertAt(array,index, num1) {
    popNum = array[0]
    
    for (var i = 0; i <= array.length - 1; i++) {
        if (i < index){
            newArray[i]=array[i];
        }
        else if (i == index){
            newArray[i] = num1
        }
        newArray[i+1]=array[i];
    }
    console.log(newArray);
}

//  insertAt([100,200,5], 2, 311) 
 insertAt([9,33,7], 1, 42)