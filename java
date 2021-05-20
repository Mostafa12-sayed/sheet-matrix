public class Matrix{  
public static void main(String args[]){  

int s[][]={{5,6,8},{3,2,4},{8,9,1}};    
int b[][]={{2,1,1},{3,2,6},{4,3,5}};    
int m[][]= new int[3][3];   
for(int i=0;i<3;i++){    
    for(int j=0;j<3;j++){    
        m[i][j]=0;      
        for(int k=0;k<3;k++)      
        {      
        m[i][j]+=s[i][k]*b[k][j];      
        }  
System.out.print(m[i][j]+" ");  
}
System.out.println();   
}    
}
}
