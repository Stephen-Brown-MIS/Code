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
  
  