
public class double_rooms extends rooms{
   
   public double_rooms(){
      for(int i=0;i<floor2st.length;i++){
         floor2st[i]=i+201;
      } 
   }
   public void reservation(){
   if (count2st!=(floor2st.length-1)){
         arrl.add( floor2st[count2st]);
         count2st++;
      }
   }
}
