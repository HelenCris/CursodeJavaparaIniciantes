public class LogicalOperators {
    public static void main(String[] args) {
        // && || 
       boolean hasHighIncome = false;
       boolean hasGoodCredit = true;
       boolean hasCriminalRecord = false;
       boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; 
    }
}
