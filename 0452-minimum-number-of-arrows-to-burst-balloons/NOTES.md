[ [10,16] , [2,8] , [1,6] , [7,12] ]
​
sort by diff of Xs and Xe
​
[ [1,6]  , [2,8] , [7,12] , [10,16] ]
end = take first Xe = 6
burst = 0
​
loop from 1
if points[i][0]  > end 12
burst++
update end = points[i][1]; 12
​
return burst;
​
​