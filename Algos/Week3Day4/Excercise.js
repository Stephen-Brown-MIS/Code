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

