class RomanToNumber {
    // Finds decimal value of a given roman numeral
    public static int[] romanNumber(String str)
    {
        int romanNo[]=new int[str.length()];
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='I')
            {
                romanNo[i]=1;
            }
            else if(str.charAt(i)=='V')
            {
                romanNo[i]=5;
            }
            else if(str.charAt(i)=='X')
            {
                romanNo[i]=10;
            }
            else if(str.charAt(i)=='L')
            {
                romanNo[i]=50;
            }
            else if(str.charAt(i)=='C')
            {
                romanNo[i]=100;
            }
            else if(str.charAt(i)=='D')
            {
                romanNo[i]=500;
            }
            else
            {
                romanNo[i]=1000;
            }
        }
        return romanNo;
    }
    public int romanToDecimal(String str) {
        int num=0;
        int romanNo[]=romanNumber(str);
        if(romanNo.length==1)
        {
            return romanNo[0];
        }
        for(int i=0;i<romanNo.length-1;i++)
        {
            if(romanNo[i]>=romanNo[i+1])
            {
                num=num+romanNo[i];
            }
            else
            {
                num=num-romanNo[i];
            }
        }
        num=num+romanNo[romanNo.length-1];
        return num;
    }
}