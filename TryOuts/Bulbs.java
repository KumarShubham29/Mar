package TryOuts;

public class Bulbs {

    public static void main(String[] args) {

        System.out.println("Final number of bulbs that are on :"+pass(100,100));
    }

    public static int pass(int no,int pass){

        boolean[] bulbs = new boolean[no];

        for(int i=1;i<=pass;i++){

            if(i%2 !=0){
                //odd
                passThrough(bulbs,i);
            }else{
                //even
                passThroughAgain(bulbs,i);
            }
        }

        return  noOfOns(bulbs);

    }

    private static int noOfOns(boolean[] bulbs) {

        int count =0;

        for(int i=0;i<bulbs.length;i++) {
            if (bulbs[i])
                count++;
        }

        return count;

    }

    private static void noOfOnsPrint(boolean[] bulbs) {


        for(int i=0;i<bulbs.length;i++) {
            if (bulbs[i]){
                System.out.print((i+1)+" ");
            }
        }
    }


    private static void passThrough(boolean[] bulbs, int i) {

        for(int j=0;j<bulbs.length;j++){
            if((j+1)%i == 0){
                bulbs[j] = !bulbs[j];
            }
        }

        noOfOnsPrint(bulbs);
        System.out.println("Number Of bulb that are on :"+noOfOns(bulbs)+" in pass "+i);

    }

    private static void passThroughAgain(boolean[] bulbs, int i) {

        for(int j=bulbs.length-1;j>=0;j--){
            if((j+1)%i == 0){
                bulbs[j] = !bulbs[j];
            }
        }
        noOfOnsPrint(bulbs);
        System.out.println("Number Of bulb that are on :"+noOfOns(bulbs)+" in pass "+i);
    }

}