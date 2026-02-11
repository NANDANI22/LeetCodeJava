class Solution {
    public static String capitalizeTitle(String title) {
        String str[]=title.split(" ");
        for(int i=0;i<str.length;i++)
        {
            if(str[i].length()>=3){
            str[i]=str[i].toLowerCase();
            str[i]=Character.toUpperCase(str[i].charAt(0))+str[i].substring(1);
            }
            else
            {
                str[i]=str[i].toLowerCase();
            }
        }
        String z=String.join(" ",str);
        z=z.trim();
        return z;
    }
}