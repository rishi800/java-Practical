//WAP to check email is correct or not
import javax.swing.JOptionPane;
class email{
   public static void main(String args[]){
      String email = JOptionPane.showInputDialog("Enter Email Address");
      boolean flag=true;
      int atcount=0;
      int value=0;
      char ch[] = email.toLowerCase().toCharArray();
      System.out.println("Email : "+email);
      for(int i=0;i<ch.length;i++){
         if(ch[i]==32){
            flag=false;
            break;
         }
         else if(ch[i]=='@' && atcount==0){
            atcount+=1;
            for(int j=i+1;j<ch.length;j++){
               if(ch[j]=='.'){
                  break;
               }
               else{
                  value+=1;
               }
            }
         }
      }
      if(flag==true && atcount==1 && value>=1){
         System.out.println("Email is valid");
      }
      else{
         System.out.println("flag : "+flag+"\natcount : "+atcount+"\nvalue : "+value);
         System.out.println("Email is not valid");
      }
   }
}