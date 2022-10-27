package string;

public class Strings {
    public static void main(String[] args) {


        // concatenation
        String firstName = "sagar";
        String lastName = "kumar";
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);

        //string lenght
        System.out.println(fullName.length());

        // string indeces
        System.out.println(fullName.charAt(0));


        // comparing string
        if(firstName.compareTo(lastName)==0){
            System.out.println("equal");

        }
        else{
            System.out.println("not equal");
        }

        // substring
        String part = fullName.substring(0,5);
        System.out.println(part);


        // strings are immutable
        firstName = firstName+"k";
        System.out.println(firstName);








        //  string builder

        StringBuilder sb = new StringBuilder("sagar");
        System.out.println(sb);


        // set char at index
        sb.setCharAt(0,'m');
        System.out.println(sb);

        // insert char at index
        sb.insert(0,"a");
        System.out.println(sb);


        // delete char
        sb.delete(0,2);
        System.out.println(sb);

        // appending 
        sb.append(" khush");
        System.out.println(sb);


        // length 

        System.out.println(sb.length());


        // reverse the string

        StringBuilder str = new StringBuilder("hello");
        for(int i=0;i<str.length()/2;i++){
            int start = i;
            int end = str.length()-1-i;
            char frontChar = str.charAt(start);
            char backChar = str.charAt(end);
            str.setCharAt(start, backChar);
            str.setCharAt(end, frontChar);

        }
        System.out.println(str);





        

    }
    
}
