class firstProgram{
    public static void main(String args[]){
        int[] arr = new int[10];
        int x  = 4;
        for(int i = 0;i<10;i++){
            arr[i] = i;
        }

        int index = 0;

        for(int i =0;i<10;i++){
            if(arr[i] == x){
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}