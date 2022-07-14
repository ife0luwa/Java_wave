package InheritanceChallenge;

public class highlow {
    public String number = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
    public String highAndLow(String numbers) {
        // Code here or
        StringBuffer result = new StringBuffer();
        String [] strArr = numbers.split(" ");
        int [] num = new int[strArr.length];
        int len = numbers.length();
        for (int i = 0; i < len; i++) {
            num[i] = Integer.parseInt(strArr[i]);
            result.insert(0, Math.max(num[0], num[i]));
            result.insert(1, Math.min(num[0], num[i]));
        }
        return result.toString();
    }
}
