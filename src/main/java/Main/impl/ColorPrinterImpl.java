package Main.impl;

import Main.services.BluePrinter;
import Main.services.ColorPrinter;
import Main.services.GreenPrinter;
import Main.services.RedPrinter;

public class ColorPrinterImpl implements ColorPrinter {
    private RedPrinter redPrinter;

    private BluePrinter bluePrinter;

    private GreenPrinter greenPrinter;

    public ColorPrinterImpl(RedPrinter redPrinter,GreenPrinter greenPrinter,BluePrinter bluePrinter)
    {
        this.redPrinter=redPrinter;
        this.bluePrinter=bluePrinter;
        this.greenPrinter=greenPrinter;
    }
    @Override
    public String print()
    {
        return String.join(",", redPrinter.print(), bluePrinter.print(),greenPrinter.print());
    }
}