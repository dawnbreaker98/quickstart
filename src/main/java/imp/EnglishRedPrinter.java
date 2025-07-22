package imp;

import services.RedPrinter;

public class EnglishRedPrinter implements RedPrinter {

    @Override
    public String print()
    {
        return "red";
    }
}