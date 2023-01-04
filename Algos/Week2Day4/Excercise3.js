var arr2d = [ [2, 5, 8],
              [3, 6, 1],
              [5, 7, 7] ];
    
// We can console.log the `8` in this array if we
// console.log(arr2d[0][2]);
// the first index `0` will select the `[2, 5, 8]` sub-array
// the second index `2` will select the `8` out of that sub-array

function isPresent2d(arr2d,value) {
    for(var i=0; i< arr2d.length; i++) {
        for(var k=0; k< arr2d.length; k++) {
            if (arr2d[i][k] === value) {
            console.log("found");
            return "Found return";
            }
        }
    }
    console.log("not found");
}

isPresent2d(arr2d,8)