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

// 1. Create a new string variable "temp".
// 2. Create a for loop and iterate thru the string, adding it to the temp string
// 3. Compare the temp string to the original string, and then set True/False

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



