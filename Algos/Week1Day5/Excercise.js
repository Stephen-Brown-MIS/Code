
// Reversing an array
// Write a function reverse( arr ) to reverse an array, if we were given..


function reverse(arr) {
  
    for (var i=arr.length-1; i >=arr.length/2; i--){
        var temp = arr[i];
        arr[i] = arr[arr.length-1-i];
        arr[arr.lenght-1] = temp;

    }
    return arr;
}

var result1 = reverse( [a, b, c, d, e] );
console.log(result1);