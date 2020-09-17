import java.math.BigDecimal;

public class Amount {
    private BigDecimal value;

    private Amount (BigDecimal value){
        this.value = value;
    }
    public static Amount fromEnglishValue(String value){
        return new Amount(new BigDecimal(value));
    }
    public static Amount fromPolishValue(String value){
        return new Amount(new BigDecimal(value.replace(",",".")));
    }

    public static void main(String[] args) {
        Amount polishAmount = Amount.fromPolishValue("1.01");
    }

}
