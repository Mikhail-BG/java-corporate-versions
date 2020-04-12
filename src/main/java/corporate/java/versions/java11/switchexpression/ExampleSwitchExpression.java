package corporate.java.versions.java11.switchexpression;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;

public class ExampleSwitchExpression
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 20; i++)
        {
            System.out.print("Iteration: " + i + ". ");
            processSelector();
        }
    }

    private static void processSelector()
    {
        SelectorEnum selectorEnum = SelectorEnum.getRandomSelector();
        double doubleCode = 10.0 + new Random().nextDouble() * (100.0 - 10.0);
        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        String msg;
        switch (selectorEnum)
        {
            case ABORT -> {
                doubleCode += 50000;
                msg = "Critical. ";
            }
            case RETRY -> {
                doubleCode += 30000;
                msg = "Please, ";
            }
            case IGNORE -> {
                doubleCode += 10000;
                msg = "Info. ";
            }
            default -> {
                msg = "Unsupported action: " + selectorEnum.getStrValue();
                throw new RuntimeException(msg);
            }
        }
        msg += selectorEnum.getStrValue() + ", code: " + decimalFormat.format(doubleCode);

        System.out.println(msg);
    }

    enum SelectorEnum
    {
        ABORT("Abort"),
        RETRY("Retry"),
        IGNORE("Ignore");

        private final String strValue;

        SelectorEnum(String strValue)
        {
            this.strValue = strValue;
        }

        public String getStrValue()
        {
            return strValue;
        }

        public static SelectorEnum getRandomSelector()
        {
            List<SelectorEnum> selectors = List.of(SelectorEnum.values());
            return selectors.get(new Random().nextInt(selectors.size()));
        }
    }
}
