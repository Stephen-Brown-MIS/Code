
/* 
  Given an arr and a separator string, output a string of every item in the array separated by the separator.
  No trailing separator at the end
  Default the separator to a comma with a space after it if no separator is provided
*/

const arr1 = [1, 2, 3];
const separator1 = ", ";

const expected1 = "1, 2, 3";

const arr2 = [1, 2, 3];
const separator2 = "-";
const expected2 = "1-2-3";

const arr3 = [1, 2, 3];
const separator3 = " - ";
const expected3 = "1 - 2 - 3";

const arr4 = [1];
const separator4 = ", ";
const expected4 = "1";

const arr5 = [];
const separator5 = ", ";
const expected5 = "";


function join(arr, separator) {
    var new_line = "";

    for (var i=0; i<arr.length;i++){
        if (i == arr.length - 1){
            new_line += arr[i]
        }   
        else
        {
            new_line += arr[i] + separator}
    }
console.log(new_line);
return new_line;
}

join(arr1,separator1)
join(arr2,separator2)
join(arr3,separator3)
join(arr4,separator4)
join(arr5,separator5)

// if i = arr.length - 1{
//     return
// }

// let i = 0;

// while (i < arr1.length) {
//     console.log(arr1[i]);
//     i++;
// }