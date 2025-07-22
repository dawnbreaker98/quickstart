package Main.services;
import Main.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public BluePrinter bluePrinter(){return new BluePrinter() {
        @Override
        public String print() {
            return "blue";
        }
    };
    }

    @Bean
    public RedPrinter redPrinter(){
        return new RedPrinter() {
            @Override
            public String print() {
                return "red";
            }
        };
    }

    @Bean
    public GreenPrinter greenPrinter()
    {
        return new GreenPrinter() {
            @Override
            public String print() {
                return "green";
            }
        };
    }

    @Bean
    public ColorPrinter colorPrinter(RedPrinter redPrinter,BluePrinter bluePrinter,GreenPrinter greenPrinter)
    {
        return new ColorPrinterImpl(redPrinter,greenPrinter,bluePrinter);
    }
}
