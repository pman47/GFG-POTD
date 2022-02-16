public class Solution { 
	static boolean ValidCorner(int matrix[][]) 
	{
	     int a=matrix.length,c=matrix[0].length;
	     for(int i=0;i<a;i++)
	     {
	         for(int j=0;j<c;j++)
	         {
	             if(matrix[i][j]==1)
	             {
	                 int right,down;
	                 for(right=j+1;right<c;right++)
	                 {                     
	                     if(matrix[i][right]==1)
	                     {
	                         for(down = i+1;down<a;down++)
	                         {
	                             if(matrix[down][right]==1)
	                             {
	                                 if(matrix[down][j]==1)return true;
	                                 
	                             }
	                         }
	                     }
                    }
                }
            }
        }
        return false;
	}
}