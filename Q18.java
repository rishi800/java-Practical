/* Q18. wap to create a class Student with following data members:
1. rollno	2. name	3.phy	4.chem	5. math	6.total	7.per
create following methods:
1. getData()
2. showData()
3. calculateResult() */
import javax.swing.*;
class Student
{
    private int rno,py,chem,math,tot;
    private double per;
    private String nm;
    public void get_Data()
    {
        rno=Integer.parseInt(JOptionPane.showInputDialog("Enter your RollNO: "));
        JOptionPane.showInputDialog("Enter Your Name");
        py=Integer.parseInt(JOptionPane.showInputDialog("Enter your Phy : "));
        chem=Integer.parseInt(JOptionPane.showInputDialog("Enter your CHEM : "));
        math=Integer.parseInt(JOptionPane.showInputDialog("Enter your MATH : "));
    }
    public void show_Data()
    {
        System.out.println("Roll No.:"+rno);
        System.out.println("Name:"+nm);
        System.out.println("Pyh:"+py);
        System.out.println("Chem:"+chem);
        System.out.println("Math:"+math);
        System.out.println("Total:"+tot);
        System.out.println("Percent:"+per);
    }
    public void cal()
    {
        tot=chem+py+math;
        per=tot*100/300;
    }
}
public class Q18 {
    public static void main(String[] args) {
        Student st=new Student();
        st.get_Data();
        st.cal();
        st.show_Data();
    }
}
