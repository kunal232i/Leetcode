//brute force
int res = 0;
int len = height.length - 1;
int area = 0;
int h = 0;
for(int i=0; i<=len; i++){
for(int j=i+1; j<=len; j++){
h = Math.min(height[i], height[j]);
area = (j-i) * h;
res = Math.max(res, area);
}
}
return res;
​
​