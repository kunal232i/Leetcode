check for columns
sorted
​
a b c
b c e
c a e
1 1 2
​
sorted = 2 not sorted = 1
Traverse through column
check  if(str[col-1][row] > str[col][row])
ans++
break;
​
return ans
​