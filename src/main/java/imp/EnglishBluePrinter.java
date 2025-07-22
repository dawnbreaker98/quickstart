package imp;

import services.BluePrinter;
import services.RedPrinter;

public class EnglishBluePrinter implements BluePrinter {

    @Override
    public String print()
    {
        return "blue";
    }
}