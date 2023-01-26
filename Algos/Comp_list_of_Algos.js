Algos from Python stack begins here:
// #1 starts here
/* 
  String: Reverse
  Given a string,
  return a new string that is the given string reversed
*/

const str1 = "creature";
const expected1 = "erutaerc";

const str2 = "dog";
const expected2 = "god";

const str3 = "hello";
const expected3 = "olleh";

const str4 = "";
const expected4 = "";

function reverseString(str) {}

// #1 Solution 

function reverseString(str) {
    var new_String = ""
    for (var i = str.length-1; i >= 0; i--){
        new_String += str[i]
    }
    return new_String
}

// #1.1 starts here

/* 
  Acronyms
  Create a function that, given a string, returns the string’s acronym 
  (first letter of each word capitalized). 
  Do it with .split first if you need to, then try to do it without
*/
//                           v
const str1 = "object oriented programming";
const expected1 = "OOP";

// The 4 pillars of OOP
const str2 = "abstraction polymorphism inheritance encapsulation";
const expected2 = "APIE";

const str3 = "software development life cycle";
const expected3 = "SDLC";

// Bonus: ignore extra spaces
const str4 = "  global   information tracker    ";
const expected4 = "GIT";

function acronymize(str) {}

// #1.1 Solution

function acro(str) {
    acronyms = "";
    word = false;
  
    for (let i = 0; i < str.length; i++) {
      if (str[i] == " ") {
        word = false;
        continue;
      }
      if (word == false) {
        acronyms += str[i].toUpperCase();
        word = true;
      }
      else {
        continue;
      }
    }
    return acronyms
  }

//  # 2

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

function join(arr, separator) {}

// #2 Solution

function join(arr, sep){
    newString = ""
    for(var i = 0; i < arr.length; i++){
        var add = i == arr.length - 1 ? arr[i] : arr[i] + sep
        newString += add
    }
    return newString
}

// # 3 - 1/12

/* 
  Given in an alumni interview.
  String Encode
  You are given a string that may contain sequences of consecutive characters.
  Create a function to shorten a string by including the character,
  then the number of times it appears. 
  
  
  If final result is not shorter (such as "bb" => "b2" ),
  return the original string.
  */

  const str1 = "aaaabbcddd";
  const expected1 = "a4b2cd3";
  
  const str2 = "";
  const expected2 = "";
  
  const str3 = "a";
  const expected3 = "a";
  
  const str4 = "bbcc";
  const expected4 = "bbcc";
  
// RIOT  Read Input Output Talk
  function encodeStr(str) {
    // your code here
  }

//   #3 Solution (none posted on 1/12)

//   #4
/* 
  String: Is Palindrome
  Create a function that returns a boolean whether the string is a strict palindrome. 
    - palindrome = string that is same forwards and backwards
  
  Do not ignore spaces, punctuation and capitalization
 */

// level
// bob
// tacocat
// 

//            v
const str1 = "a x a";
const expected1 = true;

const str2 = "racecar";
const expected2 = true;

const str3 = "Dud";
const expected3 = false;

const str4 = "ohox";
const expected4 = false;

// RIOT

function isPalindrome(str) {
    // your code here
}

console.log(isPalindrome(str1))
console.log(isPalindrome(str2))
console.log(isPalindrome(str3))
console.log(isPalindrome(str4))

// #4 Solution

function isPalindrome(str) {
    var temp = "" // create a temp variable
     for (var i=str.length -1; i>=0; i--){  // iterate thru the str and append it to the string
            temp = temp+str[i]
       }

    if (str === temp) {
            console.log(str)   //display original string
            console.log(temp)  //display temp string
        return true            //set boolean true or false
        }
    else
        {
        return false
        }

    // check the new string to see it is equal to the orig

}

// console.log(isPalindrome(str1))
// console.log(isPalindrome(str2))
// console.log(isPalindrome(str3))
console.log(isPalindrome(str4))

#5 - 1/17

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
    // your code here
}

// #5 Solution

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

//  #6 - 1/18 String dedupe

/* 
  Given a string,
  return a new string with the duplicates excluded
  Bonus: Keep only the last instance of each character.
*/

const str1 = "abcABCabcABCabcABC";
const expected1 = "abcABC";

const str2 = "helloo";
const expected2 = "helo";

const str3 = "";
const expected3 = "";

const str4 = "aa";
const expected4 = "a";

//bonus
const str5 = "aba";
const expected5 = "ba";

function stringDedupe(str) {
  // your code here
}

//   #6 Solution

function stringDedupe(str) {
    var new_String = {}
    var real_String = ''

    for (var i = 0; i <= str.length - 1; i++) {
        // if (str[i] new_String){
        if (new_String.hasOwnProperty(str[i]) == false){
            new_String[str[i]] = 1
            real_String += str[i]
        }
        else {
            new_String[str[i]] += 1
        }
    }
    console.log(new_String);
    return real_String;
}

console.log(stringDedupe(str1));

//   # 7 - 1/19 paerensValid

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

// # 7 Solution

function parensValid(str) {
    count = 0
    for(var i = 0; i < str.length; i++){
        if(str[i] == "("){ // if there's a "(" increment count by 1
            count++
        }else if(str[i] == ")"){ // else if there's a ")" decrement count by 1
            count--
            if(count < 0){ // if count goes below 0 return false immediately
                return false
            }
        }
    }
    if(count > 0){ // if count above 0 return false
        return false
    }
    return true // count is 0, return true
}

// # 8 - 1/20 updateInventory 

/* 
  Given an array of objects / dictionaries to represent new inventory,
  and an array of objects / dictionaries to represent current inventory,
  update the quantities of the current inventory
  
  if the item doesn't exist in current inventory, add it to the inventory
  return the current inventory after updating it.
*/

const newInv1 = [
    { name: "Grain of Rice", quantity: 9000 },
    { name: "Peanut Butter", quantity: 50 },
    { name: "Royal Jelly", quantity: 20 },
  ];
  const currInv1 = [
    { name: "Peanut Butter", quantity: 20 },
    { name: "Grain of Rice", quantity: 1 },
  ];
  const expected1 = [
    { name: "Peanut Butter", quantity: 70 },
    { name: "Grain of Rice", quantity: 9001 },
    { name: "Royal Jelly", quantity: 20 },
  ];
  
  const newInv2 = [];
  const currInv2 = [{ name: "Peanut Butter", quantity: 20 }];
  const expected2 = [{ name: "Peanut Butter", quantity: 20 }];
  
  const newInv3 = [{ name: "Peanut Butter", quantity: 20 }];
  const currInv3 = [];
  const expected3 = [{ name: "Peanut Butter", quantity: 20 }];
  
  /*
  this function takes in 2 params:
  1. an array of objects `newInv`
  2. an array of objects `currInv`
  */
  function updateInventory(newInv, currInv) {
      // tour code here
  }

//   #8 Solution

function updateInventory(newInv, currInv) {
    var found = false;

    for(var newItem of newInv){
        for(var currentItem of currInv){
            if(newItem['name']==currentItem['name'])
            {
                currentItem['quantity']+=newItem['quantity'];
                found = true;
            }
        }
        if(found==false){
            currInv.push(newItem);
        }
        found = false;
    }
    return currInv;
}


// #9 - 1/23 balanceIndex

/* 
  Balance Index

  Here, a balance point is ON an index, not between indices.

  Return the balance index where sums are equal on either side
  (exclude its own value).
  
  Return -1 if none exist.
*/
const nums1 = [-2, 5, 7, 0, 3];
const expected1 = 2;

const nums2 = [9, 9];
const expected2 = -1;

const nums3 = [3,0,1,1,1]
const expected3 = 1


function balanceIndex(nums) {
    // your code here
}

// #9 Solution 

function balanceIndex(nums) {
    if (nums.length < 3){ //checking an edge case where length is less than 3 
        return -1;
    }

    var leftSum = 0
    var rightSum = 0
    var balancePoint = nums[1]
    var totalSum = 0

    for(var i = 0; i<nums.length;i++) // calculate the total sum by looping through the array
    {
        totalSum+=nums[i]
    }

    for(var i=1; i<nums.length-1;i++)
    {
        leftSum+=nums[i-1] //calculating the left sum
        balancePoint = nums[i]
        rightSum = totalSum-balancePoint-leftSum // calculating the right sum based on the totalSum, balancePoint, and leftSum values
        if(leftSum == rightSum) // checking if the sides are equal and returning the index
        {
            return i;
        }
    }
    // if we go through everyting and not find the balance point, we return -1
    return -1;
}

//  #10 - 1/24 (after drop)

/* 
  Array: Binary Search (non recursive)
  Given a sorted array and a value, return whether the array contains that value.
  Do not sequentially iterate the array. Instead, ‘divide and conquer’,
  taking advantage of the fact that the array is sorted.
*/
//                v
const nums1 = [1, 3, 5, 6];
const searchNum1 = 4;
const expected1 = false;

//                   v
const nums2 = [4, 5, 6, 8, 12];
const searchNum2 = 5;
const expected2 = true;

const nums3 = [3, 4, 6, 8, 12];
const searchNum3 = 3;
const expected3 = true;

function binarySearch(sortedNums, searchNum) {
    //Your code here
}

// #10 Solution

function binarySearch(sortedNums, searchNum) {
    leftSide = 0
    rightSide = sortedNums.length - 1
    
    while(leftSide <= rightSide){
        middleNumber = Math.floor((leftSide + rightSide) / 2)
        console.log(middleNumber)
        if(sortedNums[middleNumber] === searchNum){
            return true
        }else if(sortedNums[middleNumber] > searchNum){
            rightSide = middleNumber - 1
        }else{
            leftSide = middleNumber + 1
        }
    }
    return false
}