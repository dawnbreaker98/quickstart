package imp;

import services.GreenPrinter;
import services.RedPrinter;

public class EnglishGreenPrinter implements GreenPrinter {

    @Override
    public String print()
    {
        return "green";
    }
}