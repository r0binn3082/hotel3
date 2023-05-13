public class full_sweet extends rooms {
     
     public full_sweet(){
     for(int i=0;i<floor3st.length;i++){
          floor3st[i]=i+301;
     
     }
}
     public void reservation(){

     if (count3st!=(floor3st.length-1)){
     arrl.add( floor3st[count3st]);
     count3st++;
     }
}
}