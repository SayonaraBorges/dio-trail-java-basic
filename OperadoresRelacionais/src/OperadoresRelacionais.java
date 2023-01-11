public class OperadoresRelacionais {
    public static void main(String[] args) {
       int i1 =10;
       int i2=20;
       float f1 = 4.5f;
       float f2 = 3.5f;
       double d1 = 59.6d;
       char c1 = 'x';
       char c2 = 'y';
       String s1= "Sayonara";
       String s2= "Sayonara";
       String s3 = "Borges";
       boolean b1 = true;
       boolean b2 = false;
       long l1 =1597L;
       long l2 =8997L;
       byte y1=1;
       short h1=25;

       System.out.println("i1==i2 é "+(i1==i2));
       System.out.println("i1!=i2 é "+(i1!=i2));
       System.out.println("i1>i2 é "+(i1>i2));
       System.out.println("i1<=i2 é "+(i1<=i2));

       System.out.println("f1==f2 é "+(f1==f2));
       System.out.println("f1!=f2 é "+(f1!=f2));
       System.out.println("f1>=f2 é "+(f1>=f2));
       System.out.println("f1<f2 é "+(f1<f2));
       
       System.out.println("c1==c2 é "+(c1==c2));
       System.out.println("c1!=c2 é "+(c1!=c2));
       System.out.println("c1>c2 é "+(c1>c2));
       System.out.println("c1<=c2 é "+(c1<=c2));

       System.out.println("s1==s2 é "+(s1==s2));
       System.out.println("s1==s3 é "+(s1==s3));
       System.out.println("s1!=s2 é "+(s1!=s2));
       //System.out.println(s1>=s2); ñ é possível
       //System.out.println(s1<s2); ñ é possível
       
       System.out.println("b1==b2 é "+(b1==b2));
       System.out.println("b1!=b2 é "+(b1!=b2));
       //System.out.println(b1>b2); ñ é possível
       //System.out.println(b1!=i1); ñ é possível

       System.out.println("i2>f1 é "+(i2>f1));
       System.out.println("d1==h1 é "+(d1==h1));
       //System.out.println(s2!=c1); ñ é possível
       //System.out.println(s3!=i1); ñ é possível
       
       System.out.println("l1==i2 é "+(l1==i2));
       System.out.println("l2>=i1 é "+(l2>=i1));
       System.out.println("y1!=h1 é "+(y1!=h1));
    }
}
