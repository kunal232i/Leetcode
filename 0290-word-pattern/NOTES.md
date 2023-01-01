pattern and s
​
abba   dog cat cat dog
​
true
​
follow the pattern
​
​
2 hashmap
a -> cat cat -> a
b -> cat
return false
​
pseudo code
​
words[] = s.split(" ")
​
if len(pattern) != len(words) return false;
​
map
charToWord
wordToChar
​
loop through word and char
if c in charToWord and charToWord[c] != w:return false;
same for wordToChar
add them into hashmap
return true
​
TC: O(n+m)