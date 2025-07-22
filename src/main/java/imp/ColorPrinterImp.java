package imp;

import services.BluePrinter;
import services.ColorPrinter;
import services.GreenPrinter;
import services.RedPrinter;

public class ColorPrinterImp implements ColorPrinter {
    private RedPrinter redPrinter;

    private BluePrinter bluePrinter;

    private GreenPrinter greenPrinter;

    public ColorPrinterImp(RedPrinter redPrinter,BluePrinter bluePrinter,GreenPrinter greenPrinter)
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