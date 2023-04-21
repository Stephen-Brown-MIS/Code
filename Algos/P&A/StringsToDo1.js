// Remove Blanks
// Create a function that, given a string, returns all of that string’s contents, but without blanks. 

// Examples:

// removeBlanks(" Pl ayTha tF u nkyM usi c ") => "PlayThatFunkyMusic"
// removeBlanks("I can not BELIEVE it's not BUTTER") => "IcannotBELIEVEit'snotBUTTER"

var new_String = "";

function removeBlanks(string) {
    
       for(var i = 0; i < string.length; i++){
            if (string[i] != ' '){
            new_String += string[i]
        }
    }
    console.log (new_String)
    return new_String
    
}

//removeBlanks(" Pl ayTha tF u nkyM usi c ")
removeBlanks("I can not BELIEVE it's not BUTTER")

//----------------------------------------------------------------------------------------------------


// Get Digits
// Create a JavaScript function that given a string, returns the integer made from the string’s digits. 
// You are allowed to use isNaN() and Number().

// Examples:

// getDigits("abc8c0d1ngd0j0!8") => 801008

// getDigits("0s1a3y5w7h9a2t4?6!8?0") => 1357924680

var new_String = "";

function getDigits(string) {
    for(var i = 0; i < string.length; i++){
            if (!isNaN(string[i])) {
            new_String += string[i]
        }
    }
    console.log (new_String)
    return new_String
}

//getDigits("abc8c0d1ngd0j0!8") 

 getDigits("0s1a3y5w7h9a2t4?6!8?0") 


//------------------------------------------------------------------------------------------------------------------


// Acronyms
// Create a function that, given a string, returns the string’s acronym (first letter of the word capitalized). 
// You are allowed to use .split() and .toUpperCase().

// acronym(" there's no free lunch - gotta pay yer way. ") => "TNFL-GPYW". 

// acronym("Live from New York, it's Saturday Night!") => "LFNYISN".


function acronym(str) {
    new_acronym = "";
    word = false;
  
    for (let i = 0; i < str.length; i++) {
      if (str[i] == " ") {
        word = false;
        continue;
      }
      if (word == false) {
        new_acronym += str[i].toUpperCase();
        word = true;
      }
      else {
        continue;
      }
    }
    console.log(new_acronym)
    return new_acronym
  }

acronym(" there's no free lunch - gotta pay yer way. ")

//  acronym("Live from New York, it's Saturday Night!")

//-------------------------------------------------------------------------------------------------------------------

// Count Non-Spaces
// Create a function that, given a string, returns the number of non-space characters found in the string. 

// Examples:

// countNonSpaces("Honey pie, you are driving me crazy") => 29
// countNonSpaces("Hello world !") => 11

function countNonSpaces(str) {
    count = 0;
    
  
    for (let i = 0; i < str.length; i++) {
      if (str[i] != " ") {
        count+=1;
      }
    }
    console.log(count)
    return count
  }

//  countNonSpaces("Honey pie, you are driving me crazy") 
 countNonSpaces("Hello world !")

//------------------------------------------------------------------------------------------------------------------

// Remove Shorter Strings
// Create a function that, given an array of strings and a numerical value, returns an array 
// that only contains strings longer than or equal to the given value.

// Examples:

// removeShorterStrings(['Good morning', 'sunshine', 'the', 'Earth', 'says', 'hello'], 4) => ['Good morning', 'sunshine', 'Earth', 'says', 'hello']
// removeShorterStrings(['There', 'is', 'a', 'bug', 'in', 'the', 'system'], 3) => ['There', 'bug', 'the', 'system']

newArray =[];

function removeShorterStrings(array, size) {
    count = 0;
    
  
    for (let i = 0; i < array.length; i++) {
      if (array[i].length >= size) {
        newArray.push(array[i]);
      }
    }
    console.log(newArray)
    return newArray
  }

// removeShorterStrings(['Good morning', 'sunshine', 'the', 'Earth', 'says', 'hello'], 4)
removeShorterStrings(['There', 'is', 'a', 'bug', 'in', 'the', 'system'], 3)

