public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //System.out.println(isPalindrome(121));
        //System.out.println(isPerfectNumber(5));
        System.out.println(numberToWords(123));
    }

    public static boolean isPalindrome(int num){
        num=Math.abs(num);
        char[] stringArray = String.valueOf(num).toCharArray();
        String newStringNum="";
        for(int i=stringArray.length-1;i>=0;i--){
             newStringNum=newStringNum+stringArray[i];
        }
        return newStringNum.equals(String.valueOf(num));

    }
    public static boolean isPerfectNumber(int number){
        if (number<0){
            return false;
        }
        int total=0;
        for (int i=1;i<=number/2;i++){
            if(number%i==0){
                total=total+i;
            }
        }
        return number==total;
    }

    public static String numberToWords(int number){
        if (number<0){
            return "Invalid Value";
        }
        char[] charNumber=String.valueOf(number).toCharArray();
        String result="";
        for (char num:charNumber){
            switch (num){
                case '1':
                    result+="One ";
                    break;
                case '2':
                    result+="Two ";
                    break;
                case '3':
                result+="Tree ";
                break;

                case '4':
                    result+="Four ";
                    break;

                case '5':
                    result+="Five ";
                    break;

                case '6':
                    result+="Six ";
                    break;

                case '7':
                    result+="Seven ";
                    break;

                case '8':
                    result+="Eigth ";
                    break;

                case '9':
                    result+="Nine ";
                    break;
            }
        }
        return result.trim();
    }
}