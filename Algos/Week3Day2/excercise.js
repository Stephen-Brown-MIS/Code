
const str1 = "creature";
const expected1 = "erutaerc";

const str2 = "dog";
const expected2 = "god";

const str3 = "hello";
const expected3 = "olleh";

const str4 = "";
const expected4 = "";


function reverseString(str) {

    var newString = "";
 
    for (var i = str.length - 1; i >= 0; i--) { 
        newString += str[i]; // or newString = newString + str[i];
    }
    return newString; // "olleh"
}

console.log(reverseString(str1))
console.log(reverseString(str2))
console.log(reverseString(str3))
console.log(reverseString(str4))