public class Words {
    private String engAlp = "aeiouyAEIOUY";

    public String interviewRecursionTest(String line) {
        if (line.length() == 1) {
            return "" + line.charAt(0);
        }

        int pivot = line.length() / 2;
        String left = line.substring(0, pivot);
        String right = line.substring(pivot);
        boolean needSep = engAlp.indexOf(left.charAt(pivot - 1)) != -1
                || engAlp.indexOf(right.charAt(0)) != -1;

        return interviewRecursionTest(left) + (needSep ? "*" : "") + interviewRecursionTest(right);
    }
}
