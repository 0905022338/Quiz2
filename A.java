import java.util.Scanner;

public class A {

public static void main(String[] args) {


outsideloop:for(int j=1 ;j<=3;j++) { 

insideloop:for(int i=1;i<=3;i++) {

System.out.print("STEP1:�п�J�|���ƱK�X:\n");
Scanner wrt = new Scanner(System.in);
int setpass1=wrt.nextInt();

//
if ( setpass1 < 0 || setpass1 > 9999 ){
System.out.println("�K�X����|����;��J�榡���~\n");
break ;
}

System.out.print("STEP2:�п�J�|���ƱK�X:\n");
Scanner wrti = new Scanner(System.in);
int setpass2=wrti.nextInt();

if ( setpass2 < 0 || setpass2 > 9999 ){
System.out.println("�K�X����|����;��J�榡���~\n");
break;
}

 


else if (setpass1==setpass2){
System.out.print("�K�X���T");
break outsideloop;
} 
else if (setpass1 !=setpass2){
System.out.print("�нT�{�K�X�@�P��\n");

if (j==3) {
System.out.println("EROR");
break outsideloop;
}
}


}

}


}
}