package week9_officeHours.evening;

public class HtmlGenerator {
    public static void main(String[] args) {
        /*
        T2HtmlGenerator [String, wrapper class, loop, array]

    Create a program that will read the request for the HTML that will be generated. Each request will be made of the tags and how many times that tag should be repeated. Each separate HTML tag will be separated by a semi-colon;

    Tags should be surrounded in diamond brackets and each closing tag has a / too

    Note: we are not creating a fully valid HTML structure. It is just a task

    Ex:
        Input:
            div2;li1

        Output:
            <div> </div>
            <div> </div>
            <li> </li>

    Ex:
        Input:
            ul1;li3;button2

        Output:
            <ul> </ul>
            <li> </li>
            <li> </li>
            <li> </li>
            <button> </button>
            <button> </button>

-----------------------------
         */

        String input="ul1;li3;button2";
        String[] arrayOfInput=input.split(";");//[ul1;li3;button2}
           for(String eachInput : arrayOfInput ){

               String tagName=getTagFromInput(eachInput);
               String s=eachInput.substring(tagName.length());
               int numberOfTag=Integer.parseInt(s);
               for (int i = 0; i < numberOfTag; i++) {
                   System.out.println("<"+tagName+">"+"</"+tagName+">");
               }
           }

    }
    public static String getTagFromInput(String eachInput){
        String tagName="";
        for(char c : eachInput.toCharArray()){

            if (!Character.isDigit(c)){
                tagName+=c;
            }
        }
        return tagName;
    }
}
