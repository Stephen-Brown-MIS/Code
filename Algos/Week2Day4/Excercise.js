var arr2d = [ [2, 5, 8],
              [3, 6, 1],
              [5, 7, 7] ];
    
// We can console.log the `8` in this array if we
console.log(arr2d[0][2]);
// the first index `0` will select the `[2, 5, 8]` sub-array
// the second index `2` will select the `8` out of that sub-array



// function isPresent2d(arr2d,value) {

//     for (var i=0; i< arr2d; i++) {
//         for (var k=0; k<3; k++) {
//             console.log(arr2d[i][k]);
            
//             }
//         }

    

// }



// Given a 2 dimensional array (an array containing arrays), return a new array containing 
// just the values from inside the sub-arrays. 
// Don't assume the array will always be the same size, or that the sub-arrays are all the same length 
// (the array might be jagged). 

// Don't use built-in methods like Array.prototype.flat() but feel free to use .push(value) and/or .pop() where needed.


// complete the following function

function flatten(arr2d) {
    var flat = [];
    
    for (var i=0; i<arr2d.length; i++) {
        for (var k=0; k<arr2d[i].length; k++) {
            flat.push (arr2d[i][k]);
            }
        }
    return flat;
}


var result = flatten( [ [2, 5, 8], [3, 6, 1], [5, 7, 7] ] );
console.log(result); // we expect to get back [2, 5, 8, 3, 6, 1, 5, 7, 7]

