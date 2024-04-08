// Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. Typing other characters works as expected.

// You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.

// Return the final string that will be present on your laptop screen.

 class Solution {
    public String finalString(String s) {
        StringBuilder d=new StringBuilder();
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(ch=='i')
                d.reverse();
            else
            d.append(ch);
        }
        return d.toString();
    }
}
