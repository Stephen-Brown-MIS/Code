// AcronymizeG
/* 
//   Acronyms
//   Create a function that, given a string, returns the string’s acronym 
//   (first letter of each word capitalized). 
//   Do it with .split first if you need to, then try to do it without
*/
//                           v
// const str1 = "object oriented programming";
// const expected1 = "OOP";

// // The 4 pillars of OOP
// const str2 = "abstraction polymorphism inheritance encapsulation";
// const expected2 = "APIE";

const str3 = "software development life cycle";
const expected3 = "SDLC";

// Bonus: ignore extra spaces
const str4 = "  global   information tracker    ";
const expected4 = "GIT";

function acronymize(str) {
    var newString = "";
    if(str[0] != " "){
        newString += str[0].toUpperCase();
    }
    for(var i = 0; i <=str.length - 1; i++){
        if(str[i] == " "){
            if(str[i+1] != " "){
                newString += str[i+1].toUpperCase();
            }
        }
    }
    return newString
}

console.log(acronymize(str4))