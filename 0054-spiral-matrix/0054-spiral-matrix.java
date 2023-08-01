class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list = new ArrayList<>();
        
        int l=0, r=matrix[0].length;
        int top=0, bottom=matrix.length;
        
        while(l<r && top<bottom){
            
            for(int i=l; i<r; i++){
                list.add(matrix[top][i]);
            }
            top++;
            
            for(int i=top; i<bottom; i++){
                list.add(matrix[i][r-1]);
            }
            r--;
            
            if(!(l<r && top<bottom)){
                break;
            }
            
            for(int i=r-1; i>=l; i--){
                list.add(matrix[bottom-1][i]);
            }
            bottom--;
            
            for(int i=bottom-1; i>=top; i--){
                list.add(matrix[i][l]);
            }
            l++;
        }
        return list;
    }
}