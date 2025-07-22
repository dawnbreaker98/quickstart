package Main.services;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j

public class Main implements CommandLineRunner{
    private ColorPrinter colorPrinter;
    public Main(ColorPrinter colorPrinter)
    {
        this.colorPrinter=colorPrinter;
    }

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }
    public void run(final String... args)
    {
        log.info(colorPrinter.print());
    }
}
