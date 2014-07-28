public class Solution {
    public String intToRoman(int num) {
        StringBuffer res=new StringBuffer();
    while(num>0)
    {
        if(num-1000>=0)
        {
        res.append("M");
        num-=1000;
        }
        else if(num-900>=0)
        {
        res.append("CM");
        num-=900;
        }
        else if(num-500>=0)
        {
        res.append("D");
            num-=500;
        }
        else if(num-400>=0)
        {
        res.append("CD");
        num-=400;
        }
        else if(num-100>=0)
        {
        res.append("C");
        num-=100;
        }
        else if(num-90>=0)
        {
        res.append("XC");
        num-=90;
        }
        else if(num-50>=0)
        {
        res.append("L");
        num-=50;
        }
        else if(num-40>=0)
        {
        res.append("XL");
        num-=40;
        }
        else if(num-10>=0)
        {
          res.append("X");
            num-=10;
        }
        else if(num-9>=0)
        {
        res.append("IX");
        num-=9;
        }
        else if(num-5>=0)
        {
        res.append("V");
        num-=5;
        }
        else if(num-4>=0)
        {
        res.append("IV");
        num-=4;
        }
        else if(num-1>=0)
        {
        res.append("I");
        num-=1;    
        }
    }
    return res.toString();
    }
}
