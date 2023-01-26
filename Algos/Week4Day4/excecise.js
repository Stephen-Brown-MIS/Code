/* 
Parens Valid
Given an str that has parenthesis in it
return whether the parenthesis are valid
*/

const str1 = "Y(3(p)p(3)r)s";
const expected1 = true;

const str2 = "N(0(p)3";
const expected2 = false;
// Explanation: not every parenthesis is closed.

const str3 = "N(0)t ) 0(k";
const expected3 = false;
// Explanation: because the second ")" is premature: there is nothing open for it to close.

const str4 = "a(b))(c";
const expected4 = false;
// Explanation: same number of opens and closes but the 2nd closing closes nothing.


// set variable to an empty list
// loop through the string
// set conditional to check if character is an open parenthesis
// append the open paren to the list
// set elif to check for closing parenthesis


// var open === 'false'
// var close === 'false'
// var 
// for loop, iterate through string
//  if [i]=== '(' ---> print open
//      open = 'true'
//  if [i]===')' ---> print close
//      close = 'true'
//  


function parensValid(str) {
    var result = []
    for(var i = 0; i < str.length; i++){
        if(str[i] === '('){
            result.push(str[i])
        }
        else if(str[i]=== ')'){
            if(result.length ===0){
                return false
            }
            else {
                result.pop()
            }
        }
    }
    return result.length === 0;
}
console.log(parensValid('()))'))
console.log(parensValid('((()'))
console.log(parensValid(')(()))'))
console.log(parensValid(')')) 

















/* 
  Given an array of objects / dictionaries to represent new inventory,
  and an array of objects / dictionaries to represent current inventory,
  update the quantities of the current inventory
  
  if the item doesn't exist in current inventory, add it to the inventory
  return the current inventory after updating it.
*/

// const newInv1 = [
//     { name: "Grain of Rice", quantity: 9000 },
//     { name: "Peanut Butter", quantity: 50 },
//     { name: "Royal Jelly", quantity: 20 },
//   ];
//   const currInv1 = [
//     { name: "Peanut Butter", quantity: 20 },
//     { name: "Grain of Rice", quantity: 1 },
//   ];
//   const expected1 = [
//     { name: "Peanut Butter", quantity: 70 },
//     { name: "Grain of Rice", quantity: 9001 },
//     { name: "Royal Jelly", quantity: 20 },
//   ];
  
//   const newInv2 = [];
//   const currInv2 = [{ name: "Peanut Butter", quantity: 20 }];
//   const expected2 = [{ name: "Peanut Butter", quantity: 20 }];
  
//   const newInv3 = [{ name: "Peanut Butter", quantity: 20 }];
//   const currInv3 = [];
//   const expected3 = [{ name: "Peanut Butter", quantity: 20 }];
  
//   /*
//   this function takes in 2 params:
//   1. an array of objects `newInv`
//   2. an array of objects `currInv`
//   */
//   function updateInventory(newInv, currInv) {
//       // tour code here
//   }

//   function updateInventory(newInv, currInv) {
//     var found = false;

//     for(var newItem of newInv){
//         for(var currentItem of currInv){
//             if(newItem['name']==currentItem['name'])
//             {
//                 currentItem['quantity']+=newItem['quantity'];
//                 found = true;
//             }
//         }
//         if(found==false){
//             currInv.push(newItem);
//         }
//         found = false;
//     }
//     return currInv;
// }


/* 
Parens Valid
Given an str that has parenthesis in it
return whether the parenthesis are valid
*/

const str1 = "Y(3(p)p(3)r)s";
const expected1 = true;

const str2 = "N(0(p)3";
const expected2 = false;
// Explanation: not every parenthesis is closed.

const str3 = "N(0)t ) 0(k";
const expected3 = false;
// Explanation: because the second ")" is premature: there is nothing open for it to close.

const str4 = "a(b))(c";
const expected4 = false;
// Explanation: same number of opens and closes but the 2nd closing closes nothing.

function parensValid(str) {
  // your code here
  // rememeber to invoke/call the function
}