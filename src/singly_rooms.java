public class singly_rooms extends rooms{

    public singly_rooms(){
        for(int i=0;i<floor1st.length;i++){
            floor1st[i]=i+101;
        }
    }

    public void reservation(){
        if (count1st!=(floor1st.length-1)){
            arrl.add( floor1st[count1st]);
            count1st++;
            System.out.println("your reservation has been done");
        }
    }
}    


