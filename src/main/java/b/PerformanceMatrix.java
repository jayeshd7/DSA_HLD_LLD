package b;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.bidi.LogInspector;
import org.openqa.selenium.bidi.log.ConsoleLogEntry;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v110.log.Log;
import org.openqa.selenium.devtools.v110.performance.Performance;
import org.openqa.selenium.devtools.v110.performance.model.Metric;


import org.slf4j.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class PerformanceMatrix {
    final static Logger logger = LoggerFactory.getLogger(PerformanceMatrix.class);
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();

        //performanceMetricsExample(chromeOptions);
        consoleLogExample(chromeOptions);
        //listenerTesting(chromeOptions);
    }

    private static void listenerTesting(ChromeOptions chromeOptions) {
        ChromeDriver driver = null;
        try {
            driver = new ChromeDriver(chromeOptions);
            DevTools devTools = (driver).getDevTools();
            devTools.createSession();
            devTools.send(Log.enable());
            devTools.addListener(Log.entryAdded(), entry -> logger.error(entry.getText()));
            driver.get("https://www.google.com");
            System.out.println(devTools.getCdpSession());
        } catch (Exception e) {
            logger.error(e.getMessage());
        } finally {
            driver.quit();
        }

    }

    @SneakyThrows
    private static void consoleLogExample(ChromeOptions chromeOptions) {
        try {
            ChromeDriver driver = new ChromeDriver(chromeOptions);
            LogInspector logInspector = new LogInspector(driver);
            CompletableFuture<ConsoleLogEntry> future = new CompletableFuture<>();
            logInspector.onConsoleLog(future::complete);
            driver.get("https://www.selenium.dev/selenium/web/bidi/logEntryAdded.html");
            driver.findElement(By.id("consoleLog")).click();

            ConsoleLogEntry logEntry = future.get(5, TimeUnit.SECONDS);

            Assertions.assertEquals("Hello, world!", logEntry.getText());
            Assertions.assertNull(logEntry.getRealm());
            Assertions.assertEquals(1, logEntry.getArgs().size());
            Assertions.assertEquals("console", logEntry.getType());
            Assertions.assertEquals("log", logEntry.getMethod());
            Assertions.assertNull(logEntry.getStackTrace());


        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }


    public static void performanceMetricsExample(ChromeOptions chromeOptions) {
       ChromeDriver driver = new ChromeDriver(chromeOptions);
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        devTools.send(Performance.enable(Optional.empty()));
        List<Metric> metricList = devTools.send(Performance.getMetrics());

        driver.get("https://www.google.com");
        driver.quit();

        for(Metric m : metricList) {
            System.out.println(m.getName() + " = " + m.getValue());
        }
    }
}
