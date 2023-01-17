/* 
  Given an array of strings
  return the number of times each string occurs (a frequency / hash table)
*/
//     



const arr1 = ["a", "a", "a"];
const expected1 = {
    a: 3,
};

//             v
const arr2 = ["a", "b", "a", "c", "B", "c", "c", "d"];
const expected2 = {
  a: 2,
  b: 1,
  c: 3,
  B: 1,
  d: 1,
};

const arr3 = [];
const expected3 = {};

function makeFrequencyTable(arr) {
    // 1. create three new variables - key, value for count, empty hashmap
    // 2. for loop from the beginning of the array
    // 3. check if the array is empty, then return the empty hashmap
    // 4. if there are object in the array, then run the loop.
    // 5. for each new letter in the array, put the value of the index on the key variable
    // 6. everytime the key value is equal to the index we are looking at, then inc the amount of the count +1
    // 7. if the key is not eqal to the index, then set the key and count variable on to the created hash map.
    //    if the key is not equal to the index, set the value of the key to the index and reset the value of the count.
    // your code here
    // var key = arr[0];
    // var value = 0;
    var newhashmap = {};
    
    if (arr.length == 0) {
        return newhashmap;
    }

    for(var i=0; i<arr.length; i++){
        if(newhashmap[arr[i]] >= 1){
            newhashmap[arr[i]] +=1;
        }
        else {
            newhashmap[arr[i]] = 1;
        }
    }
    return newhashmap;
}

console.log(makeFrequencyTable(arr2))