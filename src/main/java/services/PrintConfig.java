package services;

import imp.ColorPrinterImp;
import imp.EnglishBluePrinter;
import imp.EnglishGreenPrinter;
import imp.EnglishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrintConfig {
    @Bean
    public BluePrinter bluePrinter()
    {
        return new EnglishBluePrinter();
    }
    @Bean
    public RedPrinter redPrinter()
    {
        return new EnglishRedPrinter();
    }
    @Bean
    public GreenPrinter greenPrinter()
    {
        return new EnglishGreenPrinter();
    }
    @Bean
    public ColorPrinter colorPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter)
    {
        return new ColorPrinterImp(redPrinter, bluePrinter, greenPrinter);
    }
}
