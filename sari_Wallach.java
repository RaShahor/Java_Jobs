package ex1;

public class sari_Wallach {
	 public static void ofkAnachi( int mat[][], int size){
	        int ofki=0, anachi=0,i, j;
	     for( i=0; i<mat.length; i++){
	         ofki=0; anachi=0;
	          for( j=0; j<mat.length; j++){
	              
	              if(j<mat.length-1)
	              {
	          if(mat[i][j]==mat[i][j+1]) {
	          ofki++;
	          if(ofki+1>=size) {
    		      System.out.print( "horizon: i: "+ i + "j: "+ (j-size+2));//���� �� ������� �� ������ ���� �� ����� �� ���� ����/����, ��� ��� ����� �� ������ ������ ������ 2 ����� ������ ������ �� ��� ���� ��� ����
    		        System.out.println();
    	   
    	   } }
	          else 
	              ofki=0;
	              }//first if
	               if(j<mat.length-1)
	              {
	            	   if(mat[j][i]==mat[j+1][i]) {//������ �� ������ ������� ������ �� ������ �� ������ ������
	            		   anachi++;
	            		   if(anachi+1>=size)
	            			      System.out.println("vertical: i: "+ (j-size+2) + "j: "+ (i));//������ ������� ������� ���"�
	            	   }else
	            		   anachi=0;
	              }//2nd if
	             
	              
	     }//inner for 
//	      if(ofki+1==size)
//	      System.out.print( " horizon i: "+ i + "j: "+ (j-size+2));
//	        System.out.println();
//	        if(anachi+1==size)
//	      System.out.println(" vertical: i: "+ j + "j: "+ (i-size+2));
	        
	     }//outer for
	    
	        
	    }//end of func
		public static void main(String[] args) {
		 int mat[][] = {{1,1,1,1},{1,2,3,4},{1,5,8,7},{1,4,3,9}};//����! �������� ����� �� ���� ������ �� �����,
		 //������� ������ ���� �-2 ������ ������ ���� �� �����
		ofkAnachi(mat, 3);
		 
		 
		}//main end
		
}
